
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
        
    }
    public boolean todosEnEmergencia(){
        
    }
    public boolean hayNRiesgoCol(int c, int n){
        
    }
    public boolean dosConsecutivosEmergenciaFila(int f){
        
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
