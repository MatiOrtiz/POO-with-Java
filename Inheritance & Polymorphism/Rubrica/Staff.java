
public class Staff{
    //Atributos de Instancia
    protected Rubrica[] s;
    protected int cant;
    
    //Constructor
    public Staff(int max){
        s= new Rubrica[max];
        cant= 0;
    }
    
    //Comandos
    public boolean agregarRubrica(Rubrica r){
        boolean agrega= false;
        if(r!=null && !estaLlena()){
            s[cant]= r;
            cant++;
            agrega= true;
        }
        return agrega;
    }
    public void eliminar(int p){
        for(int i=0; i<cant; i++){
            if(s[i]!=null && s[i].productividad()<p)
                s[i]= null;
            if(s[i]==null){
                s[i]= s[cant-1];
                s[cant-1]= null;
                cant--;
            }
        }
    }
    
    //Consultas
    public boolean estaLlena(){
        return cant==s.length;
    }
    public int cantPosiciones(){
        return s.length;
    }
    public int cantRubricas(){
        return cant;
    }
    public Rubrica obtenerRubrica(int p){
        return s[p];    
    }
    public int contarMayorP(int p){
        int cont=0;
        for(int i=0; i<cant; i++)
            if(s[i]!=null && s[i].productividad()>p)
                cont++;
        return cont;
    }
    public Staff totalMayorT(int t){
        Staff s1= new Staff(cant);
        for(int i=0; i<cant; i++)
            if(s[i]!=null && s[i].total()>t)
                s1.agregarRubrica(s[i]);
        return s1;
    }
}
