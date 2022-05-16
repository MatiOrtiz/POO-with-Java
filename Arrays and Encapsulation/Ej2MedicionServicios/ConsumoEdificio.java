public class ConsumoEdificio{
    //Atributos de Instancia
    private MedicionServicios consumoXPiso[];
    private int cant;
    
    //Constructor
    public ConsumoEdificio(int pisos){
        consumoXPiso = new MedicionServicios[pisos];
        cant= 0;
    }
    
    //Comandos
    public boolean registrarConsumo(MedicionServicios m, int p){
        boolean aux;
        if(p>=1 && p<cantPisos()){
            consumoXPiso[p] = m;
            aux = true;
            cant++;
        }
         else aux = false;
        return aux;
    }
    public boolean eliminarConsumo(int p){
    boolean aux;
        if(p>=1 && p<cantPisos()){
            consumoXPiso[p] = null;
            aux = true;
            cant--;
        }
         else aux = false;
        return aux;    
    }
    public void eliminarCeros(){
        int cont;
        for(int i=0; i < cantPisos(); i++){
            cont = 0;
            if(consumoXPiso[i].obtenerGas() == 0)
                cont++;
            if(consumoXPiso[i].obtenerAgua() == 0)
                cont++;
            if(consumoXPiso[i].obtenerElectricidad() == 0)
                cont++;
            if(cont >= 2)
                consumoXPiso[i] = null;
        }
    }
    
    //Consultas
    public int cantPosiciones(){
        return consumoXPiso.length;
    }
    public int cantPisos(){
        return cant;    
    }
    public MedicionServicios obtenerMedicionServicios(int p){
        return consumoXPiso[p];
    }
    public boolean hayMayorConsumo(int c){
        boolean mayor= false;
        for(int i=0; i < cantPosiciones() && !mayor; i++)
            if(consumoXPiso[i].costoServicios() > c)
                mayor= true;
        return mayor;
    }
    public int cuantasMayores(int c){
        int cont = 0;
        for(int i=0; i<cantPosiciones(); i++)
            if(consumoXPiso[i].costoServicios() > c)
                cont++;
        return cont;
    }
    public int primerPisoMayor(int c){
        boolean mayor= false;
        int aux= -1;
        for(int i=0; i < cantPisos() && !mayor; i++){
            if(consumoXPiso[i].costoServicios() > c)
                mayor= true;
            if(mayor == true)
                aux = i;
        }
        return aux;
    }
    public int ultimoPisoMayor(int c){
        boolean mayor= false;
        int aux= -1;
        for(int i=cantPisos()-1; i>=0 && !mayor; i--){
            if(consumoXPiso[i].costoServicios() > c)
                mayor= true;
            if(mayor == true)
                aux = i;
        }
        return aux;    
    }
    public boolean nMayores(int c, int n){
        boolean mayores= false;
        int cont= 0;
        for(int i=0; i<cantPisos() && cont<=n; i++)
            if(consumoXPiso[i].costoServicios() > c)
                cont++;
        if (cont == n)
            mayores= true;
        return mayores;
    }
    public boolean todosMayores(int c){
        boolean mayores = true;
        for(int i=0; i<cantPisos() && !mayores; i++)
            if(consumoXPiso[i].costoServicios() > c)
                mayores = true;
            else mayores = false;
        return mayores;
    }
    public boolean todosMayores(MedicionServicios m){
        boolean mayores = true;
        for(int i=0; i<cantPisos() && !mayores; i++)
            if(consumoXPiso[i].obtenerGas() > m.obtenerGas() && consumoXPiso[i].obtenerAgua() > m.obtenerAgua() && consumoXPiso[i].obtenerElectricidad() > m.obtenerElectricidad())
                mayores = true;
            else mayores = false;
        return mayores;    
    }
}
