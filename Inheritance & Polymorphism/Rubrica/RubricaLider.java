
public class RubricaLider extends Rubrica{
    //Atributos de Instancia
    protected int gestionConflictos;
    protected int gestionCambios;
    
    //Constructor
    public RubricaLider(int l, int c, int a, int r, int go, int ga){
        super(l, c, a, r);
        gestionConflictos= go;
        gestionCambios= ga;
    }
    
    //Comandos
    public void establecerConflictos(int p){
        gestionConflictos= p;
    }
    public void establecerCambios(int p){
        gestionCambios= p;
    }
    
    //Consultas
    public int obtenerConflictos(){
        return gestionConflictos;
    }
    public int obtenerCambios(){
        return gestionCambios;
    }
    public String toString(){
        return ("legajo: " + legajo + ", comunicacion: " + comunicacion + ", autonomia: " + autonomia + ", responsabilidad: " + responsabilidad + "gestion de conflictos: " + gestionConflictos + ", gestion de cambios: " + gestionCambios);    
    }
    public int total(){
        return comunicacion + autonomia + responsabilidad + gestionConflictos + gestionCambios;
    }
    public float promedio(){
        return (comunicacion + autonomia + responsabilidad + gestionConflictos + gestionCambios)/5;
    }
}
