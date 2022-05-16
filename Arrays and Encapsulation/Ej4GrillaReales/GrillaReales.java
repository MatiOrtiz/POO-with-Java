
public class GrillaReales{
    //Atributos de Instancia
    private float[][] grilla;
    
    //Constructor
    public GrillaReales(int f, int c){
        grilla = new float[f][c];
    }
    
    //Comandos
    public void establecerReal(int f, int c, float r){
        grilla[f][c] = r;
    }
    public void reemplazar(float r1, float r2){
        for(int f=0; f < grilla.length; f++)
            for(int c=0; c < grilla[0].length; c++)
                if(grilla[f][c] == r1)
                    grilla[f][c] = r2;
    }
    public void reemplazar(float r1, float r2, int f){
        boolean ult = false;
        for(int c=grilla[f].length-1; c >= 0 && !ult; c--)
            if(grilla[f][c] == r1){
                grilla[f][c] = r2;
                ult = true;
            }
    }
    public boolean intercambiarFilas(int f1, int f2){
        boolean intercambia;
        float aux[] = null;
        if(grilla[f1].length >= 0 && grilla[f2].length < cantFilas()){
            aux= grilla[f1];
            grilla[f1] = grilla[f2];
            grilla[f2] = aux;
            intercambia = true;
        }
        else intercambia = false;
        return intercambia;
    }
    
    //Consultas
    public float obtenerReal(int f, int c){
        return grilla[f][c];
    }
    public int cantFilas(){
        return grilla.length;
    }
    public int cantColumnas(){
        return grilla[0].length;
    }
    public float total(){
        float suma=0;
        for(int f=0; f < grilla.length; f++)
            for(int c=0; c < grilla[0].length; c++)
                suma += grilla[f][c];
        return suma;
    }
    public float totalColumna(int c){
        float suma=0;
        for(int f=0; f < grilla.length; f++)
            suma += grilla[f][c];
        return suma;
    }
    public boolean estaNum(float r){
        boolean esta = false;
        for(int f=0; f < grilla.length && !esta; f++)
            for(int c=0; c < grilla[0].length && !esta; c++)
                if(grilla[f][c] == r)
                    esta= true;
        return esta;
    }
    public int cantidadMayores(float r){
        int cant=0;
        for(int f=0; f < grilla.length; f++)
            for(int c=0; c < grilla[0].length; c++)
                if(grilla[f][c] > r)
                    cant++;
        return cant;
    }
    public boolean esFilaCreciente(int f){
        boolean creciente= true;
        for (int c=0; c < grilla[f].length-1 && !creciente; c++)
            if(grilla[f][c] < grilla[f][c+1])
                creciente = true;
            else creciente = false;
        return creciente;
    }
    public boolean hayNMayoresConsecutivos(int n, float r){
        boolean tiene = true;
        int cont=0;
        for(int f=0; f < grilla.length && !tiene; f++){
            cont=0;
            for(int c=0; c < grilla[0].length && !tiene; c++)
                if(grilla[f][c] > r)
                    cont++;
                 else tiene= false;
            if(cont == n)
                tiene= true;
             else tiene= false;
        }
        return tiene;
    }
    public boolean esTranspuesta(GrillaReales g){
        boolean es = true;
        for(int f=0; f < grilla.length && !es; f++)
            for(int c=0; c < grilla[0].length && !es; c++)
                if(g.obtenerReal(f,c) == grilla[c][f])
                    es= true;
                  else es= false;
        return es;
    }
    public GrillaReales transpuesta(){
        GrillaReales t = new GrillaReales(grilla.length, grilla[0].length); 
        for(int f=0; f < grilla.length; f++)
            for(int c=0; c < grilla[0].length; c++)
                t.establecerReal(c,f,grilla[f][c]); 
        return t;
    }
}
