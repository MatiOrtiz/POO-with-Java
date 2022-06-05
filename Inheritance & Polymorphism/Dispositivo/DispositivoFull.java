
public class DispositivoFull extends Dispositivo{
    //Atributos de Instancia
    protected float p3;
    protected float p4;
    
    //Constructor
    public DispositivoFull(float pU, float pD, float pT, float pC){
        super(pU, pD);
        p3= pT;
        p4= pC;
    }
    
    //Comandos
    public void establecerP3(float p){
        p3= p;
    }
    public void establecerP4(float p){
        p4= p;
    }
    
    //Consultas
    public float obtenerP3(){
        return p3;
    }
    public float obtenerP4(){
        return p4;
    }
    public boolean riesgo(){
        return p2>p1 || p4>p3;
    }
    public boolean emergencia(){
        return p4<max;
    }
    /*public boolean equals(Dispositivo d){
        boolean ig;
        DispositivoFull df= (DispositivoFull) d;
        ig= super.equals(d) && p3==df.obtenerP3() && p4==df.obtenerP4();
        return ig;
    }*/
    public boolean equals(DispositivoFull e){
        boolean ig;
        if(this == e)
            ig= true;
          else if(e == null)
                  ig= false;
                else if(getClass() != e.getClass())
                        ig= false;
                      else{
                          DispositivoFull r= (DispositivoFull) e;
                          ig= super.equals(e)  && p3==r.obtenerP3() && p4==r.obtenerP4();
                      }
        return ig;
    }
}
