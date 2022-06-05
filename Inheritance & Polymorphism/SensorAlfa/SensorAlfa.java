
public class SensorAlfa extends Sensor{
    //Atributos de Instancia
    protected float p3;
    protected float p4;
    
    //Constructor
    public SensorAlfa(float pU, float pD, float pT, float pC){
        super(pU, pD);
        p3= pT;
        p4= pC;
    }
    
    //Comandos
    public void establecerP3(float p){
        p3= p;
    }
    public void establecerP4(float p){
        p4= p;
    }
    
    //Consultas
    public float obtenerP3(){
        return p3;
    }
    public float obtenerP4(){
        return p4;
    }
    public boolean riesgo(){
        return p2>p1 || p4>p3;    
    }
    public boolean emergencia(){
        return p4 < max;    
    }
    public SensorAlfa clone(){
        return new SensorAlfa(p1, p2, p3, p4);    
    }
    public boolean equals(Sensor e){   
        boolean ig;   
        if (this == e)     
            ig = true;   
         else if (e == null)       
                 ig = false;     
                 else if(getClass()!= e.getClass())         
                         ig = false;       
                         else {          
                             SensorAlfa r = (SensorAlfa) e;         
                             ig = super.equals(e) && p3 == r.obtenerP3();   
                         }   
        return ig; 
        //La condicion del equals es que el parametro debe ser igual al SensorAlfa que recibe el mensaje o 
        //ser igual al Sensor que recibe el mensaje con el obtenerP3 igual a p3
    } 
}
