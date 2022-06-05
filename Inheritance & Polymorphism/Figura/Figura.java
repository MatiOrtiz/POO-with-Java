
public abstract class Figura{
    //Consultas
    public abstract float area();
    public abstract float perimtero();
    public abstract Punto centro();
    public abstract boolean equals(Figura f);
    
    
    public float diferencia(float n1,float n2){
        float dif;
        dif= n1-n2;
        return dif;
    }
    public float distancia(float n1, float n2){
        float cuadrado1, cuadrado2, raiz;
        cuadrado1= (float)Math.pow(n1,2);
        cuadrado2= (float)Math.pow(n2,2);
        raiz= (float)Math.sqrt(cuadrado1 + cuadrado2);
        return raiz;
    }
}
