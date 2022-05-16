import IPOO.*;

public class TesterJugador{
    public static void main (String args[]){
        System.out.println("Testeo de constructor y establecer" );
        System.out.println();
        System.out.println("Ingrese el nombre del jugador");
        String n = ES.leerCadena();
        Jugador a= new Jugador(n);
        a.establecerNroCamiseta(10);
        a.establecerPosicion(10);
        a.establecerGolesConvertidos(5);
        a.establecerPartidosJugados(8);
        System.out.println(a.toString());
        System.out.println("Promedio de goles por partido: " + a.obtenerPromedioGolesXPart());
    
        //Testeo de clone, equals y aumentar goles y partidos
        Jugador b= a.clone();
        System.out.println(b.toString());
        System.out.println("Son iguales los jugadores?");
        System.out.println(b.equals(a));
        b.aumentarGoles(10);
        System.out.println("Se aumentan 10 goles");
        System.out.println("Son iguales los jugadores?");
        System.out.println(b.equals(a));
        System.out.println("Se aumenta un partido");
        a.aumentarUnPartido();
        System.out.println(a.toString());
        
        //Testeo Mas Goles
        System.out.println("Ingrese el nombre del jugador");
        String nom = ES.leerCadena();
        Jugador c = new Jugador(nom);
        c.establecerNroCamiseta(9);
        c.establecerPosicion(9);
        c.establecerGolesConvertidos(24);
        c.establecerPartidosJugados(18);
        System.out.println(c.toString());
        System.out.println("El jugador " + a.obtenerNombre() + "tiene mas goles que " + c.obtenerNombre() + "?");
        System.out.println(a.masGoles(c));
        
        //Testeo jugador con mas goles
        System.out.println("Devuelve el jugador con mas goles entre " + a.obtenerNombre() + "y " + c.obtenerNombre());
        Jugador j= a.jugConMasGoles(b);
        System.out.println(j.toString());
    }
    
}
