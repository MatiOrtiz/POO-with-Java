

public class EquipoB{
    //Atributos de Instancia
    private String nombre;
    private Jugador capitan;
    private int pG, pE, pP;
    private int gFavor, gContra;
    
    //Constructores
    public EquipoB(String nom, Jugador cap){
        nombre = nom;
        capitan = cap;
    }
    
    //Comandos
    public void incrementarPG(boolean jugoElCap){
        pG ++;
        if (jugoElCap == true)
            capitan.aumentarUnPartido();
    }
    public void incrementarPE(boolean jugoElCap){
        pE ++;
        if (jugoElCap == true)
            capitan.aumentarUnPartido();    
    }
    public void incrementarPP(boolean jugoElCap){
        pP ++;
        if (jugoElCap == true)
            capitan.aumentarUnPartido();
    }
    public void aumentarGfavor(int total, int delCap){
        gFavor += total;
        if (delCap > 0)
            capitan.aumentarGoles(delCap);
    }
    public void aumentarGcontra(int total){
        gContra += total;
    }
    
    //Consultas
    public String obtenerNombre(){
        return nombre;
    }
    public Jugador obtenerCapitan(){
        return capitan;
    }
    public int obtenerPG(){
        return pG;
    }
    public int obtenerPE(){
        return pE;
    }
    public int obtenerPP(){
        return pP;
    }
    public int obtenerGFavor(){
        return gFavor;
    }
    public int obtenerGContra(){
        return gContra;
    }
    public int obtenerPartidos(){
        return pP + pE + pG;
    }
    public int obtenerPuntos(){
        return pE + 3*pG;
    }
    public EquipoB mejorPuntaje(EquipoB e){
        EquipoB mejor;
        if (obtenerPuntos() > e.obtenerPuntos())
            mejor = this;
         else if (obtenerPuntos() < e.obtenerPuntos())
                mejor = e;
                else if (gFavor > e.obtenerGFavor())
                       mejor = this;
                      else if (gFavor < e.obtenerGFavor())
                             mejor = e;
                            else if (gContra < e.obtenerGContra())
                                   mejor = this;
                                  else if (gContra > e.obtenerGContra())
                                         mejor = e;
                                         else mejor = this;
        return mejor;
    }
    public Jugador capitanConMasGoles(EquipoB e){
        Jugador mas;
        if (capitan.obtenerGolesConvertidos() >  e.obtenerCapitan().obtenerGolesConvertidos())
            mas = capitan;
            else mas = e.obtenerCapitan();
        return mas;
    }
    public boolean equals(EquipoB e){
        if (e == null)
            return false;
            else return (nombre == (e.obtenerNombre()) && capitan == (e.obtenerCapitan()));        
    }
    public String toString(){
        return ("Nombre del equipo: " + nombre + ", Capitan: " + capitan + ", Partidos Ganados: " + pG + ", Partidos Empatados: " + pE + ", Partidos Perdidos: " + pP);    
    }
}
