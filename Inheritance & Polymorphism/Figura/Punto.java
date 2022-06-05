
public class Punto{
    //Atributos de Instancia
    private float x, y;
    
    //Constructor
    public Punto(float x, float y){
        this.x= x;
        this.y= y;
    }
    
    
    //Comandos
    public void establecerX(float x){
        this.x= x;
    }
    public void establecerY(float y){
        this.y= y;
    }
    
    //Consultas
    public float obtenerX(){
        return x;
    }
    public float obtenerY(){
        return y;
    }
}
