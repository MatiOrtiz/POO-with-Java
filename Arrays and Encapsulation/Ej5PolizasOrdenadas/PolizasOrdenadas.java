
public class PolizasOrdenadas{
    //Atributos de Instancia
    private Poliza polOrd[];
    private int n;
    
    //Constructor
    public PolizasOrdenadas(int max){
        polOrd = new Poliza[max];
        n=0;
    }
    
    //Comandos
    public void insertar(Poliza pol){
        boolean hecho= false;
        for(int i=0; i<cantPolizas() && !hecho; i++)
            if(polOrd[i].obtenerNroPoliza() > pol.obtenerNroPoliza()){
                for(int j=n-1; j>=i; j--)
                    polOrd[j+1]= polOrd[j];
                hecho= true;
                n++;
            }
    }
    public void actualizar(int d, int h, int p){
        for(int i=0; i<cantPolizas(); i++)
            if(polOrd[i].obtenerCostoPoliza() > d && polOrd[i].obtenerCostoPoliza() < h)
                polOrd[i].actualizarPorcentaje(p);
    }
    public void copy(PolizasOrdenadas p){
        if(n == p.cantPolizas())
            for(int i=n; i<cantElementos(); i++){
                polOrd[i]= p.obtenerPoliza(i);
                n++;
            }
    }
    
    //Consultas
    public int cantPolizas(){
        return n;
    }
    public int cantElementos(){
        return polOrd.length;
    }
    public boolean estaLlena(){
        return n == polOrd.length;
    }
    public boolean existePoliza(int nro){
        boolean existe= false;
        for(int i=0; i<n && !existe; i++)
            if(polOrd[i].obtenerNroPoliza() == nro)
                existe= true;
        return existe;
    }
    public boolean existePoliza(Poliza pol){
        boolean existe= false;
        for(int i=0; i<n && !existe; i++)
            if(polOrd[i] == pol)
                existe= true;
        return existe;
    }
    public Poliza obtenerPoliza(int pos){
        Poliza p= null;
        if(pos>=0 && pos<n)
            p= polOrd[pos];
        return p;
    }
    public PolizasOrdenadas intercalar(PolizasOrdenadas p){
        PolizasOrdenadas poli= new PolizasOrdenadas(polOrd.length + p.cantPolizas());
        for(int i=0; i<cantPolizas(); i++)
            if(polOrd[i].obtenerNroPoliza() <= p.obtenerPoliza(i).obtenerNroPoliza())
                poli.insertar(polOrd[i]);
               else poli.insertar(p.obtenerPoliza(i));     
        return poli;
    }
    public boolean equals(PolizasOrdenadas p){
        boolean aux= true;
        for(int i=0; i<cantPolizas() && !aux; i++)
            if(p.existePoliza(i)== true)
                aux= polOrd[i] == p.obtenerPoliza(i);
        return aux;
    }
}
