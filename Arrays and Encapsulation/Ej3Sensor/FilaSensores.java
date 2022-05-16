public class FilaSensores{
    //Atributos de Instancia
    private Sensor fs[];
    
    //Constructor
    public FilaSensores(int cant){
        fs = new Sensor[cant];
    }
    
    //Comandos
    public void establecerSensor(int p, Sensor s){
        if(p > 0 && p < fs.length)
            fs[p-1] = s;
    }
    public void intercambiar(int p1, int p2){
        Sensor aux = null;
        if(p1 > 0 && p1 <= fs.length && p2 > 0 && p2 <= fs.length){
            aux = fs[p1-1];
            fs[p1-1] = fs[p2-1];
            fs[p2-1] = aux;
        }
    }
    public void copy(FilaSensores a){
        for(int i=0; i<fs.length; i++)
            fs[i].copy(a.obtenerSensor(i));
    }
    
    //Consultas
    public Sensor obtenerSensor(int p){
        return fs[p];
    }
    public boolean posicionValida(int p){
        return (p >= 0 && p < fs.length);    
    }
    public int cantFila(){
        return fs.length;
    }
    public int cantSensores(){
        int cont=0;
        for(int i=0; i< cantFila(); i++)
            if(fs[i] != null)
                cont++;
        return cont;
    }
    public int cantidadRiesgo(){
        
    }
    public boolean hayNRiesgo(int n){
        
    }
    public boolean dosConsecutivosEmergencia(){
        
    }
    public boolean equals(FilaSensores a){
        boolean igual= true;
        for(int i=0; i<cantFila() && !igual; i++)
            if(fs[i] == a.obtenerSensor(i))
                igual= true;
             else igual= false;
        return igual;
    }
    public FilaSensores clone(){
        FilaSensores f1 = new FilaSensores(cantFila());
        for(int i=0; i<cantFila(); i++)
            f1.establecerSensor(i, fs[i]);
        return f1;
    }
    public FilaSensores filaCompleta(){
        FilaSensores f1 = new FilaSensores(cantFila());
        for(int i=0; i<cantFila(); i++)
            if(fs[i] != null)
                f1.establecerSensor(i, fs[i]);
        return f1;    
    }
}
