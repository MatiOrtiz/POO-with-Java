
public class TableroSensores{
    //Atributos de Instancia
    private Sensor grilla[][];
    
    //Constructor
    public TableroSensores(int cantFil, int cantCol){
        grilla = new Sensor[cantFil][cantCol];    
    }
    
    //Comandos
    public void establecerSensor(int f, int c, Sensor s){
        grilla[f][c] = s;
    }
    public void intercambiar(int f1, int f2){
        Sensor aux;
        for(int c=0; c < grilla.length; c++){
            aux= grilla[f1][c];
            grilla[f1][c]= grilla[f2][c];
            grilla[f2][c]= aux;
        }
    }
    public void copy(TableroSensores t){
        if(t != null && grilla.length == t.cantFilas() && grilla[0].length == t.cantColumnas())
            for(int f=0; f < t.cantFilas(); f++)
                for(int c=0; c < t.cantColumnas(); c++)
                    grilla[f][c]= t.obtenerSensor(f, c); 
    }
    
    //Consultas
    public int cantFilas(){
        return grilla.length;
    }
    public int cantColumnas(){
        return grilla[0].length;
    }
    public Sensor obtenerSensor(int f, int c){
        return grilla[f][c];
    }
    public int cantFilasRiesgo(){
        boolean hayRiesgo=false;
        int cant=0;
        for(int f=0; f<cantFilas(); f++)
            for(int c=0; c<cantColumnas() && !hayRiesgo; c++){
                hayRiesgo=false;
                if(grilla[f][c].riesgo()==true){
                    cant++;
                    hayRiesgo=true;
                }
            }
        return cant;
    }
    public boolean todosEnEmergencia(){
        boolean todos=true;
        for(int f=0; f<cantFilas(); f++)
            for(int c=0; c<cantColumnas(); c++)
                if(grilla[f][c].riesgo()==false)
                    todos= false;
        return todos;
    }
    public boolean hayNRiesgoCol(int c, int n){
        int cant;
        boolean riesgo=false;
        for(int f=0; f<cantFilas(); f++){
            cant=0;
            for(int i=0; i<cantColumnas() && cant<=n; i++){
                if(grilla[f][c].riesgo()==true){
                    cant++;
                }
            }
            riesgo= cant<=n;
        }
        return riesgo;
    }
    public boolean dosConsecutivosEmergenciaFila(int f){
        boolean consecutivos=false;
        for(int c=0; c<cantColumnas()-1 && !consecutivos; c++)
            if(grilla[f][c].riesgo()==true && grilla[f][c+1].riesgo()==true)
                consecutivos=true;
        return consecutivos;
    }
    public int contarCoincidencias(TableroSensores gs){
        int cont=0;
        for(int f=0; f < grilla.length; f++)
            for(int c=0; c < grilla.length; c++)
                if(grilla[f][c] == gs.obtenerSensor(f,c))
                    cont++;
        return cont;
    }
    public boolean equals(TableroSensores t){
        boolean aux= false;
        for(int f=0; f < grilla.length; f++)
            for(int c=0; c < grilla.length; c++)
                if(grilla[f][c].equals(t.obtenerSensor(f,c)))
                    aux= true;
        return aux;
    }
    public TableroSensores clone(){
        TableroSensores s = new TableroSensores(grilla.length, grilla[0].length);
        for(int f=0; f < grilla.length; f++)
            for(int c=0; c < grilla.length; c++)
                s.establecerSensor(f, c, grilla[f][c].clone());
        return s;
    }
}
