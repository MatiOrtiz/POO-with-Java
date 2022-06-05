import IPOO.*;
public class Territorio{
    //Atributo de Instancia
    protected Refugio tablero[][];
    
    //Constructor
    public Territorio(int nf, int nc){
        tablero = new Refugio[nf][nc];    
    }
    
    //Comandos
    public boolean establecerRefugio(Refugio r, int f, int c){
        boolean aux;
        tablero[f][c]= r;
        if(f>=0 && f<cantFilas() && c>=0 && c<cantColumnas())
            aux= true;
            else aux= false;
        return aux;
    }
    
    //Consultas
    public int cantFilas(){
        return tablero.length;    
    }
    public int cantColumnas(){
        return tablero[0].length;
    }
    public int cantRefugios(){
        int aux=0;
        for(int f=0; f<cantFilas(); f++)
            for(int c=0; c<cantColumnas(); c++)
                if(tablero[f][c] != null)
                    aux++;
        return aux;
    }
    public int filaMasPoblada(){
        int mayor=0;
        int cont;
        for(int f=0; f<cantFilas(); f++){
            cont=0;
            for(int c=0; c<cantColumnas(); c++)
                if(tablero[f][c] != null)
                    cont++;
            if(cont > mayor)
                mayor= cont;
        }
        return mayor;    
    }
    public boolean maximoNRefugiosHabitables(int f, int n){
        int cont= 0;
        for(int c=0; c<cantColumnas() && cont<=n; c++)
            if(tablero[f][c].esHabitable())
                cont++;
        return cont<= n;
    }
    public int cantConDisponibilidadMayor(int m){
        int cont;
        int cant=0;
        for(int f=0; f<cantFilas(); f++){
            cont=0;
            for(int c=0; c<cantColumnas(); c++)
                if(tablero[c][f].disponibilidad() > m)
                    cont++;
            if(cont > m)
                cant++;
        }
        return cant;
    }
    public boolean territorioEspejo(){
        int central=0;
        boolean impar= true;
        boolean espejo= true;
        if(cantColumnas() %2 != 0)
            central+= (int)Math.floor(cantColumnas()/2);
         else{
            impar= false;
            espejo= false;
         }
        if(impar == true)
            for(int f=0; f<cantFilas() && !espejo; f++)
                if(tablero[f][central-1] != tablero[f][central +1])
                    espejo= false;
        return espejo;
    }
    public ColeccionRefugios coleccionFila(){
        ColeccionRefugios coleccion= null;
        boolean ligada;
        int columna=0;
        for(int f=0; f<cantFilas(); f++){
            ligada= false;
            for(int c=0; c<cantColumnas() && !ligada; c++){
                columna=0;
                if(tablero[f][c] != null)
                    ligada= true;
            }
            if(ligada == true)
                coleccion.insertarRefugio(tablero[f][columna]);
        }
        return coleccion;
    }
    public Territorio clone(){
        Territorio t= new Territorio(cantFilas(), cantColumnas());
        for(int f=0; f<cantFilas(); f++)
            for(int c=0; c<cantColumnas(); c++)
                t.establecerRefugio(tablero[f][c].clone(), f, c);
        return t;
    }
    
}
