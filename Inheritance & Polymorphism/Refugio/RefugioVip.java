
public class RefugioVip extends Refugio{
    //Atributos de Clase
    protected final int capacidadSillones= 10;
    
    //Atributos de Instancia
    protected int sillones;
    
    //Constructor
    public RefugioVip(int a, int b, int c, int s){
        super(a,b,c);
        sillones= s;
    }
    
    //Comandos
    public boolean ocuparSillon(){
        boolean incrementa= false;
        if(sillones>0 && sillones<capacidadSillones){
            sillones++;
            incrementa= true;
        }
        return incrementa;
    }
    public boolean desocuparSillon(){
        boolean decrementa= false;
        if(sillones<=capacidadSillones && sillones>0){
            sillones--;
            decrementa= true;
        }
        return decrementa;
    }
    
    //Consultas
    public int obtenerSillones(){
        return sillones;
    }
    public int disponibilidad(){
        return disponibilidad()+sillones;
    }
    public RefugioVip clone(){
        return new RefugioVip(alimentos, bebidas, camas, sillones);    
    }
}
