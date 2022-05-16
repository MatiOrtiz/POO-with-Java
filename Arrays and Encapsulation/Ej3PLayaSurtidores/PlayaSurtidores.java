
public class PlayaSurtidores{
    
    //Atributos de Instancia
    private Surtidor tabla[];
    private int cont= 0;    
    //Constructor
    public PlayaSurtidores(int n){
        tabla = new Surtidor[n];
    }
    
    //Comandos
    public void establecerSurtidor(Surtidor s, int p){
        tabla[p] = s;    
        cont++;
    }
    public void establecerSurtidor(Surtidor s){
        boolean vacio = true;
        for(int i=0; i<cantPosiciones() && !vacio; i++)
            if(tabla[i] == null){
                tabla[i] = s;
                vacio = false;
                cont++;
            }
    }
    public void llenaDepositos(){
        for(int i=0; i<cantSurtidores(); i++)
            if(tabla[i] !=null){
                tabla[i].llenarDepositoGasoil();
                tabla[i].llenarDepositoSuper();
                tabla[i].llenarDepositoPremium();
            }
    }
    public void agrupaSurtidores(){
        Surtidor aux;
        for(int i=0; i<cantPosiciones(); i++)
            if(tabla[i] == null){
                for(int j=i+1; j<cantPosiciones(); j++){
                        aux= tabla[i];
                        tabla[i]= tabla[j];
                        tabla[j]= aux;
                    }
            }
    }
    
    //Consultas
    public int cantPosiciones(){
        return tabla.length;
    }
    public int cantSurtidores(){
        return cont;    
    }
    public Surtidor obtenerSurtidor(int p){
        return tabla[p];
    }
    public int cantMaximaCarga(){
        int aux=0;
        for(int i=0; i<cantPosiciones(); i++)
            if(tabla[i] != null && tabla[i].depositosLLenos() == true)
                aux++;
        return aux;
    }
    public boolean mismosNulos(PlayaSurtidores ps){
        boolean mismos= true;
        for(int i=0; i<cantPosiciones() && !mismos; i++)
            if(tabla[i] == null && ps == null)
                mismos= true;
             else mismos= false;
        return mismos;
    }
    public PlayaSurtidores clone(){
        PlayaSurtidores p= new PlayaSurtidores(tabla.length);
        for(int i=0; i<cantPosiciones(); i++)
            p.establecerSurtidor(tabla[i],i);
        return p;
    }
    public PlayaSurtidores nLigados(int n){
        int aux= 0;
        boolean ligados= true;
        PlayaSurtidores p;
        for(int i=0; i<cantPosiciones() && !ligados && aux<=n;i++)
            if(tabla[i] != null)
                aux++;
                else ligados= false;
        if(aux == n){
            p= new PlayaSurtidores(n);
            int j=0;
            for(int i=0; i<cantPosiciones() && i<=n; i++)
                if(tabla[i] != null){
                    p.establecerSurtidor(tabla[i], j);
                    j++;
                }
        }
         else p= null;
        return p;
    }
}
