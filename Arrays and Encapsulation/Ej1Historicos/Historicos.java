import IPOO.*;

public class Historicos{
    //Atributos de Instancia
    private Jugador jugadoresHistoricos[];
    private int cant;
    
    //Constructor
    public Historicos(int n){
        jugadoresHistoricos = new Jugador[n];    
        cant = 0;
    }
    
    //Comandos
    public void establecerJugador(Jugador j){
        jugadoresHistoricos[cant] = j;
        cant++;
    }
    public void ordenar(){
        boolean huboIntercambios= true;
        Jugador jugadores;
        for(int i=0; i<cantPosiciones(); i++)
            for(int j=i+1; j<cantPosiciones(); j++)
                if(jugadoresHistoricos[j].obtenerNombre().compareTo(jugadoresHistoricos[i].obtenerNombre())<0){
                    jugadores = jugadoresHistoricos[i];
                    jugadoresHistoricos[i] = jugadoresHistoricos[j];
                    jugadoresHistoricos[j] = jugadores;
                }
    }
    
    //Consultas
    public boolean estaLLena(){
        return cant == jugadoresHistoricos.length;
    }
    public int cantPosiciones(){
        return jugadoresHistoricos.length;
    }
    public int cantJugadores(){
        return cant;
    }
    public Jugador obtenerJugador(int p){
        return jugadoresHistoricos[p];
    }
    public boolean mMayores(int g, int m){
        int cont= 0;
        boolean aux= false;
        for(int i=0; i < cantJugadores(); i++)
            if(jugadoresHistoricos[i].obtenerGolesConvertidos() > g)
                cont++;
        if(cont == m)
            aux = true;
        return aux;
    }
    public boolean alMenosMMayores(int g, int m){
        int cont= 0;
        boolean aux= false;
        for(int i=0; i < cantJugadores() && cont <= m; i++)
            if(jugadoresHistoricos[i].obtenerGolesConvertidos() > g)
                cont++;
        if(cont == m)
            aux = true;
        return aux;        
    }
    public Historicos goleadores(int g){
        Historicos jugadores = new Historicos(cantJugadores());
        for(int i=0; i < cantJugadores(); i++)
            if(jugadoresHistoricos[i].obtenerGolesConvertidos() > g)
                jugadores.establecerJugador(jugadoresHistoricos[i]);
        return jugadores;
    }
}
