
public class VehiculoB{
    
    //Atributos de Instancia
    private Hora ingreso;
    private int aCobrar;
    private int numero;
    private String patente;
    
    //Constructor
    public VehiculoB(Hora i, int n, String p){
        ingreso = i;
        aCobrar = 0;
        numero = n;
        patente = p;
    }
    
    //Comandos
    public void egresaVehiculoB(Hora c, Tarifa t){
        int dif;
        dif = ingreso.diferenciaMinutos(c);
        if(dif > 0 && dif <= 15)
            aCobrar = t.obtenerT15();
            else if(dif > 15 && dif <= 30)
                    aCobrar = t.obtenerT30();
                    else if(dif > 30 && dif <= 60)
                            aCobrar = t.obtenerT60();
                            else aCobrar = t.obtenerTFija();
    }
    public void copy(VehiculoB v){
        ingreso.copy(v.obtenerIngreso());    
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
    public int obtenerACobrar(){
        return aCobrar;
    }
    public boolean equals(VehiculoB c){
        return ingreso.equals(c.obtenerIngreso()) && aCobrar == c.obtenerACobrar() && numero==(c.obtenerNumero()) && patente.equals(c.obtenerPatente());
    }
    public boolean anterior(VehiculoB v){
        boolean aux = false;
        if(ingreso.obtenerHora() < v.obtenerIngreso().obtenerHora())
            aux = true;
            else if(ingreso.obtenerHora() == v.obtenerIngreso().obtenerHora()) 
                    if (ingreso.obtenerMinutos() < v.obtenerIngreso().obtenerMinutos())
                        aux = true;
                        else aux = false;
                 else aux = false;
        return aux;    
    }
}
