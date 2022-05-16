
public class Refugio{
   //Atributos de Clase
   private final int capacidadAlacena= 20; 
   private final int cantidadCamas= 10;
   
   //Atributos de Instancia
   private int alimentos;
   private int bebidas;
   private int camas;
   
   //Constructor
   public Refugio(int a, int b, int c){
       if (a+b > capacidadAlacena){
           alimentos = capacidadAlacena / 2;
           bebidas = capacidadAlacena / 2;
       }
        else{
            alimentos = a;
            bebidas = b;
        }
       if (c > cantidadCamas)
           camas = cantidadCamas;
        else
            camas = c;
   }
   
   //Comandos
   public void consumirAlimento(){
       alimentos -=1;    
   }
   public void consumirBebida(){
       bebidas -=1;    
   }
   public boolean ocuparCama(){
       boolean aux;
       if (camas > 0 && camas < cantidadCamas){
           camas += 1;
           aux = true;
       }
       else
           aux = false;
       return aux;
   }
   public boolean desocuparCama(){
       boolean aux;
       if (camas > 0){
           camas -= 1;
           aux = true;
       }
       else
           aux = false;
       return aux;
    }
   public boolean reponerAlimentos(int n){
       boolean aux;
       if (n>0 && n + alimentos + bebidas <= capacidadAlacena){
           aux = true;
           alimentos += n;
       }
        else 
            aux = false;
       return aux;
   }
   public boolean reponerBebidas(int n){
       boolean aux;
       if (n>0 && n + alimentos + bebidas <= capacidadAlacena){
           aux = true;
           bebidas += n;
       }
        else 
            aux = false;
       return aux;
   }
   
   //Consultas
   public int obtenerAlimentos(){
       return alimentos;
   }
   public int obtenerBebidas(){
       return bebidas;
   }
   public int obtenerCamas(){
       return camas;
   }
   public int obtenerCapacidadAlacena(){
       return capacidadAlacena - alimentos - bebidas;    
   }
   public boolean esHabitable(){
       boolean aux;
       if (alimentos + bebidas > 0 || camas > 0)
           aux = true;
        else 
            aux = false;
       return aux;
   }
   public int disponibilidad(){
       return cantidadCamas - camas;
   }
   public int diasSupervivencia(){
       int aux;
       if (alimentos <= bebidas)
           aux = alimentos;
        else 
            aux = bebidas;
       return aux;
   }
   public boolean mayorAlimentos(Refugio r){
       boolean aux;
       if (alimentos > r.obtenerAlimentos())
            aux = true;
        else
             aux = false;
        return aux;
   }
   public boolean equals(Refugio r){
       return (alimentos == r.obtenerAlimentos() && bebidas == r.obtenerBebidas() && camas == r.obtenerCamas());    
   }
   public Refugio clone(){
       return new Refugio(alimentos, bebidas, camas);        
   }
   public String toString(){
       return ("En el refugio hay: " + alimentos + "alimentos, " + bebidas + "bebidas y " + camas + "camas.");    
   }
}
