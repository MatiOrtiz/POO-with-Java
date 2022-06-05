public class ColeccionRefugios
{
    //Atributos de instancia
    protected Refugio [] col;
    protected int cant;
    
    //Constructor
    public ColeccionRefugios(int n){
        col = new Refugio[n];
        cant = 0;
    }
    
    //Comandos
    public void insertarRefugio(Refugio r){
        //Requiere r ligado
       if(!estaLlena()){
           col[cant] = r;
           cant++;
           }
       }
    public void eliminarEscasaSupervivencia(){
        int eliminados=0;
        for(int i = 0; i < cantRefugios(); i++){
            if(col[i].diasSupervivencia()<=1){
            col[i]=null;  
            eliminados++;
            arrastrarAnt(i);
            }
        }
        cant=cant-eliminados;
    }   
    private void arrastrarAnt(int pos){
        for(int i = pos; i < cantRefugios()-1; i++){
            col[i]=col[i+1];
        }
    }
    
    //Consultas
    public int cantRefugios(){
        return cant;
    }
    
    public int cantPosiciones(){
        return col.length;
    }
    public boolean estaLlena(){
        return cant==col.length;
    }
    
    public Refugio obtenerRefugio(int pos){
        return col[pos];
    }
    
    public boolean hayNSeguidosHabitables(int n){
        boolean aux=false;
        int cont=0;
        for(int i=0; i < cantRefugios()-1 && !aux; i++){
            if(col[i].esHabitable())
               cont++; 
            else
                cont = 0;
            if (cont == n)
            aux=true;
        }
        return aux;
    }
    
    public boolean equals(ColeccionRefugios c){
        boolean aux=true;
        if((cantPosiciones() == c.cantPosiciones()) && (cantRefugios() == c.cantRefugios())){
            for(int i = 0; i < cantRefugios()-1 && aux; i++){
                if(!col[i].equals(c.obtenerRefugio(i)))
                aux=false;
            }
        }
        else
            aux=false;
        return aux;
    }
}