
class Color
{
    //Atributos de instancia
    private int rojo;
    private int verde;
    private int azul;
    
    //Constructores
    public Color(){
     rojo=255; verde=255; azul=255;   
    }
    public Color(int r, int a, int v){
    rojo=r; verde=v; azul=a;
    }
    
    //Comandos
    public void variar(int val){
      rojo=rojo+val;
      verde=verde+val;
      azul=azul+val;
      if (rojo > 255) {
          rojo=255;
      }
      else
          if (rojo < 0) {
              rojo=0;
          }
      if (verde > 255) {
          verde=255;
      }
      else
          if (verde < 0){
              verde=0;
          }
      if (azul > 255) {
          azul=255;
      }
      else
          if (azul < 0){
              azul=0;
          }    
    }
    public void variarRojo(int val){
         rojo=rojo+val;
         if (rojo > 255) {
          rojo=255;
          }
          else
              if (rojo < 0) {
                  rojo=0;
          }
    }
    public void variarAzul(int val){
         azul=azul+val;
         if (azul > 255) {
          azul=255;
          }
          else
              if (azul < 0) {
                  azul=0;
          }
    }
    public void variarVerde(int val){
         verde=verde+val;
         if (verde > 255) {
          verde=255;
          }
          else
              if (verde < 0) {
                  verde=0;
          }
    }
    public void establecerRojo(int val){
        rojo=val;
    }
    public void establecerAzul(int val){
        azul=val;
    }
    public void establecerVerde(int val){
        verde=val;
    }
    public void copy(Color p){
        rojo=p.obtenerRojo();
        verde=p.obtenerVerde();
        azul=p.obtenerAzul();
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
        return (rojo==255) && (verde==0) && (azul==0);
    }
    public boolean esGris(){
        return ((rojo==50) && (verde==50) && (azul==50)) | ((rojo==150) && (verde==150) && (azul==150));
    }
    public boolean esNegro(){
        return (rojo==0) && (verde==0) && (azul==0);
    }
    public Color complemento(){
        int r= 255-rojo;
        int a=255-azul;
        int v=255-verde;
        return new Color(r,a,v);
    }
    public boolean equals(Color p){
        return rojo==p.obtenerRojo() && azul==p.obtenerAzul() && verde==p.obtenerVerde();
    }
    public Color clone(){
       return new Color(rojo,azul,verde); 
    }
    public String toString(){
       return "("+rojo+","+azul+","+verde+")"; 
    }
}