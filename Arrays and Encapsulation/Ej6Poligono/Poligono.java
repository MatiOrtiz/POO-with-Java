
public class Poligono{
    //Atributos de Instancia
    private Punto pol[];
    private int n=0;
    
    //Constructor
    public Poligono(int max){
        pol= new Punto[max];
    }
    
    //Comandos
    public void insertar(Punto p){
        if(p!=null && !estaLlena()){
            pol[n]= p;
            n++;
        }
    }
    public void eliminar(Punto p){
        boolean encontre= false;
        for(int i=0; i<n && !encontre; i++)
            if(pol[i] == p)
                encontre= true;
        if(encontre == true)
            for(int j=0; j<n && pol[j+1]!=null; j++){
                pol[j]= pol[j+1];
                n--;
            }
    }
    
    //Consultas
    public int cantPuntos(){
        return n;
    }
    public boolean estaLlena(){
        return n == pol.length;
    }
    public Punto obtenerPunto(int p){
        return pol[p];
    }
    public boolean existePunto(Punto p){
        boolean existe= false;
        for(int i=0; i<n && !existe; i++)
            if(pol[i] == p)
                existe= true;
        return existe;
    }
    public float perimetro(){
        
    }
    public boolean equals(Poligono p){
        boolean iguales= true;
        for(int i=1; i<n && !iguales; i++)
            if(pol[i] != p.obtenerPunto(i))
                iguales= false;
        return iguales;
    }
}
