
public class PolizaFabrica extends Poliza{
    //Atributos de Instancia
    protected int cantOperarios;
    protected float valorEquipo;
    
    //Constuctor
    public PolizaFabrica(int np){
        super(np);    
    }
    public PolizaFabrica(int np, float i, float r, int co, float ve){
        super(np, i, r);
        cantOperarios= co;
        valorEquipo= ve;
    }
    
    //Comandos
    public void establecerCantOperarios(int n){
        cantOperarios= n;
    }
    public void establecerValorEquipo(int n){
        valorEquipo= n;
    }
    
    //Consultas
    public int obtenerCantOperarios(){
        return cantOperarios;
    }
    public float obtenerValorEquipos(){
        return valorEquipo;
    }
    public float obtenerCostoPoliza(){
        return (float) (incendio + robo + cantOperarios*500 + valorEquipo*0.8);    
    }
}
