
public class RubricaProgramador extends Rubrica{
    //Atributos de Instancia 
    protected int lineasCodigo; 
    
    //Constructor
    public RubricaProgramador(int l, int c, int a, int r, int lc){
        super(l,c,a,r);
        lineasCodigo= lc;
    }
    
    //Comandos
    public void aumentarLineasCodigo(int p){
        lineasCodigo+=p;
    }
    
    //Consultas
    public int obtenerLineasCodigo(){
        return lineasCodigo;
    }
    public String toString(){
        return ("legajo: " + legajo + ", comunicacion: " + comunicacion + ", autonomia: " + autonomia + ", responsabilidad: " + responsabilidad + "lineas de codigo: " + lineasCodigo);    
    }
    public float productividad(){
        return 1.5f*comunicacion + 3*autonomia + 5*responsabilidad + (lineasCodigo/10000);
    }

}
