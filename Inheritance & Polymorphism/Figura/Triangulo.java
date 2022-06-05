
public class Triangulo extends Figura{
    //Atributos de Instancia 
    protected Punto v1, v2, v3;
    
    //Constructor
    public Triangulo(Punto p1, Punto p2, Punto p3){
        v1= p1;
        v2= p2;
        v3= p3;
    }
    
    //Consultas
    private float lado(Punto p1,Punto p2){
        return distancia(diferencia(p1.obtenerX(),p2.obtenerX()),diferencia(p1.obtenerY(),p2.obtenerY()));
    }
    private float altura(){
        float alt= distancia(lado(v1,v2),lado())
    }
    public float area(){
                
    }
    public float perimetro(){
        return lado(v1,v2)+lado(v2,v3)+lado(v1,v3);
    }
    public Punto centro(){
        
    }
    public boolean equals(Figura f){
        
    }
}
