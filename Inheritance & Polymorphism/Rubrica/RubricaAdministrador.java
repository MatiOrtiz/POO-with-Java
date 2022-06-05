

public class RubricaAdministrador extends RubricaLider{
    //Atributos de Instancia
    protected int proyectos; 
    
    //Constructor
    public RubricaAdministrador(int l, int c, int a, int r, int go, int ga, int p){
        super(l, c, a, r, go, ga);
        proyectos= p;
    }
    
    //Comandos 
    public void aumentarProyectos(){
        proyectos++;
    }
    
    //Consultas
    public int obtenerProyectos(){
        return proyectos;    
    }
    public String toString(){
        return ("legajo: " + legajo + ", comunicacion: " + comunicacion + ", autonomia: " + autonomia + ", responsabilidad: " + responsabilidad + "gestion de conflictos: " + gestionConflictos + ", gestion de cambios: " + gestionCambios + ", proyectos: " + proyectos);
    }
    public float productividad(){
        return 4*promedio()+proyectos*10;    
    }
}
