
public class Dispositivo{
    //Atributos de Clase
    protected final double max=0.01;
    
    //Atributos de Instancia
    protected float p1;
    protected float p2;
    
    //Constructor
    public Dispositivo(float pU, float pD){
        p1= pU;
        p2= pD;
    }
    
    //Comandos
    public void establecerP1(float p){
        p1= p;
    }
    public void establecerP2(float p){
        p2= p;
    }
    public void copy(Dispositivo d){
        p1= d.obtenerP1();
        p2= d.obtenerP2();
    }
    
    //Consultas
    public float obtenerP1(){
        return p1;
    }
    public float obtenerP2(){
        return p2;
    }
    public boolean riesgo(){
        return p2>p1;    
    }
    public boolean emergencia(){
        return p1<max;
    }
    public boolean equals(Dispositivo s){
        boolean ig;
        if(this == s)
            ig= true;
        else if(s == null)
                ig= false;
            else if(getClass() != s.getClass())
                    ig= false;
                else
                    ig= (p1 == s.p1) && (p2 == s.p2);
        return ig;
    }
    public Dispositivo clone(){
        return new Dispositivo(p1, p2);
    }
}
