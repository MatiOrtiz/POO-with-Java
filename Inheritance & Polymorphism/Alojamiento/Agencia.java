
public class Agencia{
    //Atributos de Instancia
    protected Alojamiento[] alojamientos;
    
    //Constructor
    public Agencia(int n){
        alojamientos= new Alojamiento[n];    
    }
    
    //Comandos
    public boolean insertarAlojamiento(Alojamiento aloj, int pos){
        boolean asigna= false;
        for(int i=0; i<tamanioTabla(); i++)
            if(alojamientos[i]!=null)
                if(aloj.obtenerId()!=alojamientos[i].obtenerId()){
                    alojamientos[pos]= aloj;
                    asigna= true;
                }
            else{
                alojamientos[pos]= aloj;
                asigna= true;
            }
        return asigna;
    }
    public void eliminarAlojamiento(int pos){
        alojamientos[pos]= null;
    }
    public void eliminarAlojamiento(Alojamiento aloj){
        for(int i=0; i<tamanioTabla(); i++)
            if(alojamientos[i]!=null && alojamientos[i].obtenerId()==aloj.obtenerId())
                alojamientos[i]=null;
    }
    
    //Consultas
    public int cantAlojamientos(){
        int cant=0;
        for(int i=0; i<tamanioTabla(); i++)
            if(alojamientos[i]!=null)
                cant++;
        return cant;
    }
    public int tamanioTabla(){
        return alojamientos.length;    
    }
    public Alojamiento recuperarAlojamiento(int pos){
        return alojamientos[pos];
    }
    public int recuperarPosicion(Alojamiento aloj){
        int p=-1;
        for(int i=0; i<tamanioTabla(); i++)
            if(alojamientos[i]!=null && alojamientos[i].obtenerId()==aloj.obtenerId())
                p=i;
        return p;
    }
    public Alojamiento estaAlojamiento(int c){
        Alojamiento a= null;
        for(int i=0; i<tamanioTabla(); i++)
            if(alojamientos[i]!=null && alojamientos[i].obtenerId()==c)
                a= alojamientos[i];
        return a;
    }
    public boolean estaLlena(){
        return cantAlojamientos()==tamanioTabla();
    }
    public boolean hayAlojamientos(){
        boolean hay= false;
        for(int i=0; i<tamanioTabla() && !hay; i++)
            if(alojamientos[i]!=null)
                hay= true;
        return hay;
    }
    public Agencia menorCosto(int c, int n, int p){
        boolean hay= false;
        int cont=0;
        Agencia a= new Agencia(alojamientos.length);
        for(int i=0; i<tamanioTabla() && cont<n && !hay; i++){
            if(alojamientos[i]!=null && alojamientos[i].costoDiario(p)>c)
                cont++;
             else cont=0;
            if(cont==n){
                hay= true;
                for(int j=i+1; j>=0 && alojamientos[j]!=null; j--)
                    a.insertarAlojamiento(alojamientos[j],j);
            }
        }
        if(cont<n)
            a= null;
        return a;
    }
}
