
public class Sensor{
    
    //Atributos de Clase
    protected final double max = 0.01;
    
    //Atributos de Instancia
    protected float p1;
    protected float p2;
    
    //Constructor
    public Sensor(float p1, float p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    
    //Comandos 
    public void establecerP1(float p){
        this.p1 = p;    
    }
    public void establecerP2(float p){
        this.p2 = p;    
    }
    public void copy (Sensor s){
        this.p1 = s.obtenerP1();
        this.p2 = s.obtenerP2();
    }
    
    //Consultas
    public float obtenerP1(){
        return p1;    
    }
    public float obtenerP2(){
        return p2;    
    }
    public boolean riesgo(){
        return p2 > p1;    
    }
    public boolean emergencia(){
        return p1 < max;    
    }
    public boolean equals(Sensor s){
        return (this!=null && s!=null && this.p1 == s.obtenerP1() && this.p2 == s.obtenerP2());    
    }
    public Sensor clone(){
        return new Sensor(p1,p2);
    }
}
