
public class Jugador{
    
    //Atributos de Instancia
    private String nombre;
    private int nroCamiseta;
    private int posicion;
    private int golesConvertidos;
    private int partidosJugados;
    
    //Constructor
    public Jugador(String nom){
        nombre = nom;    
    }
    
    //Comandos
    public void establecerNroCamiseta(int n){
        nroCamiseta= n;    
    }
    public void establecerPosicion(int n){
        posicion= n;    
    }
    public void establecerGolesConvertidos(int n){
        golesConvertidos= n;    
    }
    public void establecerPartidosJugados(int n){
        partidosJugados= n;
    }
    public void aumentarGoles(int n){
        golesConvertidos += n;
    }
    public void aumentarUnPartido(){
        partidosJugados ++;    
    }
    
    //Consultas
    public String obtenerNombre(){
        return nombre;    
    }
    public int obtenerNroCamiseta(){
        return nroCamiseta;
    }
    public int obtenerPosicion(){
        return posicion;
    }
    public int obtenerGolesConvertidos(){
        return golesConvertidos;
    }
    public int obtenerPartidosJugados(){
        return partidosJugados;
    }
    public double obtenerPromedioGolesXPart(){
        return (golesConvertidos / partidosJugados);
    }
    public boolean masGoles(Jugador j){
        return golesConvertidos > j.obtenerGolesConvertidos();
    }
    public Jugador jugConMasGoles(Jugador j){
        Jugador l;
        if (golesConvertidos > j.obtenerGolesConvertidos()){
            l = new Jugador(nombre);
            l.establecerNroCamiseta(nroCamiseta);
            l.establecerPosicion(posicion);
            l.establecerGolesConvertidos(golesConvertidos);
            l.establecerPartidosJugados(partidosJugados);
        }
        else{
            l = new Jugador(j.obtenerNombre());
            l.establecerNroCamiseta(j.obtenerNroCamiseta());
            l.establecerPosicion(j.obtenerPosicion());
            l.establecerGolesConvertidos(j.obtenerGolesConvertidos());
            l.establecerPartidosJugados(j.obtenerPartidosJugados());            
        }
        return l;
    }
    public String toString(){
        return "Nombre: "+nombre+".Dorsal: "+nroCamiseta+".Posicion: "+posicion+".Goles: "+golesConvertidos+". PJ: "+partidosJugados;    
    }
    public Jugador clone(){
        Jugador j = new Jugador(nombre);
        j.establecerNroCamiseta(nroCamiseta);
        j.establecerPosicion(posicion);
        j.establecerGolesConvertidos(golesConvertidos);
        j.establecerPartidosJugados(partidosJugados);   
        return j;
    }
    public boolean equals(Jugador j){
        return nombre == j.obtenerNombre() && nroCamiseta == j.obtenerNroCamiseta() && posicion == j.obtenerPosicion() && golesConvertidos == j.obtenerGolesConvertidos() && partidosJugados == j.obtenerPartidosJugados();    
    }
    
}
