
public class Color{
    
    //Atributos de Instancia
    private int rojo, verde, azul;
    
    //Constructores
    public Color(){
        rojo= 255; 
        verde= 255;
        azul= 255;
    }
    public Color(int r, int a, int v){
        rojo= r;
        azul= a;
        verde = v;
    }
    
    //Comandos
    public void variar(int val){
        rojo += val;
        azul += val;
        verde += val;
        if (rojo > 255)
            rojo = 255;
        if (azul > 255)
            azul = 255;
        if (verde > 255)
            verde = 255;
        if (rojo < 0)
            rojo = 0;
        if (azul < 0)
            azul = 0;
        if (verde < 0)
            verde = 0;
    }
    public void variarRojo(int val){
        rojo += val;    
    }
    public void variarVerde(int val){
        verde += val;
    }
    public void variarAzul(int val){
        azul += val;
    }
    public void establecerRojo(int val){
        rojo = val;
    }
    public void establecerAzul(int val){
        azul = val;
    }
    public void establecerVerde(int val){
        verde = val;
    }
    public void copy(Color c){
        rojo = c.obtenerRojo();
        verde = c.obtenerVerde();
        azul = c.obtenerAzul();
    }
    
    //Consultas
    public int obtenerRojo(){
        return rojo;    
    }
    public int obtenerAzul(){
        return azul;
    }
    public int obtenerVerde(){
        return verde;
    }
    public boolean esRojo(){
        return (rojo == 255 && azul == 0 && verde == 0); 
    }
    public boolean esGris(){
        return (rojo == 50 && verde == 50 && azul == 50) || (rojo == 150 && verde == 150 && azul == 150);
    }
    public boolean esNegro(){
        return (rojo == 0 && azul == 0 && verde == 0);
    }
    public Color complemento(){
        int r = 255 - rojo;
        int a = 255 - azul;
        int v = 255 - verde;
        return new Color(r,a,v);
    }
    public boolean iquals(Color c){
        return (rojo == c.obtenerRojo() && azul == c.obtenerAzul() && verde == c.obtenerVerde());    
    }
    public Color clone(){
        return new Color(rojo, azul, verde);
    }
    public String toString(){
        return "(" + rojo + "," + azul + "," + verde + ")"; 
    }
}
