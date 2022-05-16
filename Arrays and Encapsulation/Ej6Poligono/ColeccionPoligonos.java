
public class ColeccionPoligonos{
    //Atributos de Instancia
    private Poligono cp[];
    private int n;
    
    //Constructor
    public ColeccionPoligonos(int max){
        cp = new Poligono[max];    
    }
    
    //Comandos
    public void insertar(Poligono p){
        if(p!=null && !estaLlena()){
            cp[n]= p;
            n++;
        }
    }
    public void eliminar(Poligono p){
        boolean encontre= false;
        for(int i=0; i<n && !encontre; i++)
            if(cp[i]== p)
                encontre= true;
        if(encontre == true)
            for(int j=0; j<n && cp[j+1]!=null; j++){
                cp[j]= cp[j+1];
                n--;
            }
    }
    public void eliminarPoligonosNLados(int num){
        for(int i=0; i<n; i++)
            if(cp[i].cantPuntos() == n)
                for(int j=i; j<n && cp[j+1]!=null; j++){
                cp[j]= cp[j+1];
                n--;
                }    
    }
    
    //Consultas
    public int cantPoligonos(){
        return n;    
    }
    public boolean estaLlena(){
        return n == cp.length;
    }
    public boolean existePoligono(Poligono pol){
        boolean existe= false;
        for(int i=0; i<n; i++)
            if(cp[i] == pol)
                existe= true;
        return existe;
    }
    public int contarPoligonosPunto(Punto p){
            
    }
    public float mayorPerimetro(){
        
    }
}
