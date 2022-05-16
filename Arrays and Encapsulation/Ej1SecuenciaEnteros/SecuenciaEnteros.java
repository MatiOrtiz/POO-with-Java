
public class SecuenciaEnteros{
    
    //Atributos de Instancia
    private int sec[];
    
    //Constructor
    public SecuenciaEnteros(int cant){
        sec = new int[cant];
    }
    
    //Comandos 
    public void establecerEntero(int p, int n){
        sec[p] = n;
    }
    public void reemplazar(int n1, int n2){
        for(int i = 0; i < sec.length; i++)
            if(sec[i] == n1)
                sec[i] = n2;
    }
    public void reemplazar(int n){
        for(int i=0; i < sec.length; i++)
            if(sec[i] == n)
                sec[i] = 0;
        for(int i = sec.length -1; i >= 0 && sec[i] != 0; i--)
            if(sec[i] == n)
                sec[i] = 0;
    }
    public boolean intercambiar(int p1, int p2){
        int aux;
        boolean resultado;
        if(0 <= p1 && p2 < cantElementos()){
            aux = sec[p1];
            sec[p1] = sec[p2];
            sec[p2] = aux;
            resultado = true;
        }
        else resultado = false;
        return resultado;
    }
    public boolean copy(SecuenciaEnteros a){
        boolean aux;
        if(sec.length == a.cantElementos()){
            aux = true;
            for(int i=0; i < sec.length; i++)
                sec[i] = a.obtenerEntero(i);
        }
        else aux = false;
        return aux;
    }
    
    //Consultas
    public int obtenerEntero(int p){
        return sec[p];        
    }
    public int cantElementos(){
        return sec.length;
    }
    public int total(){
        int aux=0;
        for(int i=0; i < sec.length; i++)
            aux += sec[i];
        return aux;
    }
    public boolean estaNum(int n){
        boolean aux=false;
        for(int i=0; i < sec.length && !aux; i++)
            if(sec[i] == n)
                aux = true;
            else aux = false;
        return aux;
    }
    public int cantidadMayores(int n){
        int cont=0;
        for(int i=0; i < sec.length; i++)
            if(sec[i] > n)
                cont++;
        return cont;
    }
    public boolean mitadMayores(int n){
        boolean aux;
        int cant = 0;
        for(int i=0; i < sec.length && cant < sec.length/2; i++)
            if(sec[i] > n)
                cant++;
        if (cant == sec.length/2)
            aux = true;
         else aux = false;
        return aux;
    }
    public boolean equals(SecuenciaEnteros a){
        boolean aux = true;
        for(int i=0; i < sec.length && !aux; i++)
            if (sec[i] == a.obtenerEntero(i))
                aux = true;
             else aux = false;
        return aux;
    }
    public SecuenciaEnteros clone(){
        SecuenciaEnteros s = new SecuenciaEnteros(sec.length);    
        for(int i=0; i < cantElementos(); i++)
            s.establecerEntero(i, sec[i]);
        return s;
    }
    public String toString(){
       String cadena="< ";    
       for (int i=0; i<sec.length; i++)
           cadena+=sec[i]+" ";
       return cadena+">";
  }
}
