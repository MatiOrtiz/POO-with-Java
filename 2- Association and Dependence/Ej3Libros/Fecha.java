import IPOO.*;

class Fecha
{
    // Atributos de instancia
    private int dia;
    private int mes;
    private int anio;
    
    //Constructor
    public Fecha (int d, int m, int a){
        dia=d; mes=m; anio=a;
    }
    
    //Comandos
    public void establecerDia(int d){
        dia=d;
    }
    public void establecerMes(int m){
        mes=m;
    }
    public void establecerAnio(int a){
        anio=a;
    }
    
    //Consultas
    public int obtenerDia(){
        return dia;
    }
    public int obtenerMes(){
        return mes;
    }
    public int obtenerAnio(){
        return anio;
    }
    public boolean esBisiesto(){
        return (((anio % 4) == 0) & ((anio % 100) != 0) | ((anio % 400) == 0));  
    }
    public int difFechas(Fecha f){
        //requiere f ligada
        int dif;
        dif= Math.abs(anio - f.obtenerAnio());
        return dif;
    }
    public Fecha diaSiguiente(){
        int d=dia;
        int m=mes;
        int a=anio;
        switch(d) {
            case 29: if(esBisiesto() & (mes==2)){
                         d=1;
                         m=m+1;
                     }
                      else
                          d=d+1;
                     break;
            case 28: if(esBisiesto() & (mes==2)){
                        d=d+1;
                     }
                     else
                         if(!esBisiesto() & mes==2){
                         d=1;
                         m=m+1; }
                         break;
            case 30: if((mes==11) | (mes==6) | (mes==9) | (mes==4)){
                         d=1;
                         m=m+1;
                     }
                     else
                         d=d+1;
                     break;
            case 31: if((mes==1) | (mes==3) | (mes==5) | (mes==7) | (mes==8) | (mes==10)){
                     d=1;
                     m=m+1; }
                     else{ 
                         if(mes==12){
                            d=1;
                            m=1;
                            a=a+1;
                         }
                        }
                     break;
            default: d=d+1;
                     break;             
            } //switch
        return new Fecha(d, m, a);
    }
    public boolean esAnterior(Fecha f){
        //requiere f ligada
        boolean aux;
        if (anio != f.obtenerAnio())
            aux= anio < f.obtenerAnio();
        else {
            if(mes != f.obtenerMes())
                aux= mes < f.obtenerMes();
            else
                aux= dia < f.obtenerDia(); }
        return aux;
    }
    public boolean equals(Fecha f){
        return dia==f.obtenerDia() && mes==f.obtenerMes() && anio==f.obtenerAnio();
    }
    public Fecha sumaDias(int d){
        Fecha f=this;
        for(int i=0;i < d;i++){
          f.diaSiguiente();
        }
        return f;
    }
    public String toString(){
        return (+ dia +"/"+ mes +"/"+ anio);
    }
    
}