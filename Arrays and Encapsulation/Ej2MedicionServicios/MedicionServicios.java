
public class MedicionServicios{
    //Atributos de Instancia
    private int gas;
    private int agua;
    private int electricidad;
    
    //Constructor
    public MedicionServicios(int g, int a, int e){
        gas = g;
        agua = a;
        electricidad = e;
    }
    
    //Comandos
    public void establecerGas(int g){
        gas = g;
    }
    public void establecerAgua(int a){
       agua = a; 
    }
    public void establecerElectricidad(int e){
        electricidad = e;
    }
    
    //Consultas
    public int obtenerGas(){
        return gas;
    }
    public int obtenerAgua(){
        return agua;
    }
    public int obtenerElectricidad(){
        return electricidad;
    }
    public float costoServicios(){
        return (float)(gas*1.5 + agua*0.5 + electricidad*2);
    }
}
