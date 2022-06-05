
public abstract class Alojamiento{
    //Atributos de Instancia
    protected int id;
    protected int personas;
    protected DatosPostales datosPostales;
    
    //Constructor
    public Alojamiento(int id, int p){
        this.id = id;
        personas= p;
    }
    
    //Consultas
    public int obtenerId(){
        return id;    
    }
    public int obtenerPersonas(){
        return personas;
    }
    public String toString(){
        return ("id: " + id + ", personas: " + personas + ", datos postales: " + datosPostales);
    }
    public abstract float costoDiario(int p);
}
