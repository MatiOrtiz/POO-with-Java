
public class Vehiculo{
    
    //Atributos de Instancia
    private Hora ingreso, egreso;
    private int numero;
    private String patente;
    
    //Constructor
    public Vehiculo(Hora i, int n, String p){
        ingreso = i;
        egreso = null;
        numero = n;
        patente = p;
    }
    
    //Comandos
    public void egresaVehiculo(Hora c){
        egreso = c;
    }
    public void copy(Vehiculo v){
        ingreso.copy(v.obtenerIngreso());
        egreso.copy(v.egreso);
        numero = v.obtenerNumero();
        patente = v.obtenerPatente();
    }
    
    //Consultas
    public Hora obtenerIngreso(){
        return ingreso;
    }
    public int obtenerNumero(){
        return numero;
    }
    public String obtenerPatente(){
        return patente;
    }
    public int obteneraCobrar(Tarifa t){
        int importe = 0;
        int dif = 0;
        if(egreso == null)
            importe = 0;
            else dif = egreso.diferenciaMinutos(ingreso); 
        if (dif > 0 && dif <= 15)
            importe = t.obtenerT15();
            else if (dif > 15 && dif <= 30)
                    importe = t.obtenerT30();
                    else if (dif > 30 && dif <= 60)
                            importe = t.obtenerT60();
                            else importe = t.obtenerTFija();
         return importe;
    }
    public boolean equals(Vehiculo v){
        return ingreso.equals(v.obtenerIngreso()) && numero == v.obtenerNumero() && patente.equals(v.obtenerPatente());    
    }
    public boolean anterior(Vehiculo b){
        boolean aux = false;
        if(ingreso.obtenerHora() < b.obtenerIngreso().obtenerHora())
            aux = true;
            else if(ingreso.obtenerHora() == b.obtenerIngreso().obtenerHora()) 
                    if (ingreso.obtenerMinutos() < b.obtenerIngreso().obtenerMinutos())
                        aux = true;
                        else aux = false;
                 else aux = false;
        return aux;
    }
}
