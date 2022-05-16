
public class Sensor{
    //Atributos de Clase
    private float max;
    
    //Atributos de Instancia 
    private float p1;
    private float p2;
    
    //Constructor
    public Sensor(float pUno, float pDos){
        p1 = pUno;
        p2 = pDos;
    }
    
    //Comandos 
    public void establecerP1(float p){
        p1 = p;
    }
    public void establecerP2(float p){
        p2 = p;
    }
    public void copy(Sensor s){
        p1 = s.obtenerP1();
        p2 = s.obtenerP2();
    }
    
    //Consultas 
    public float obtenerP1(){
        return p1;
    }
    public float obtenerP2(){
        return p2;
    }
    public boolean riesgo(){
            
    }
    public boolean emergencia(){
        
    }
    public boolean equals(Sensor s){
        return p1 == s.obtenerP1() && p2 == s.obtenerP2();
    }
    public Sensor clone(){
        Sensor s = new Sensor(p1, p2);
        return s;
    }
}
