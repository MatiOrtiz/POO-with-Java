

public class Fecha{
    
    //Atributos de Instancia
    private int dia, mes, anio;
    
    //Constructor 
    public Fecha(int d, int m, int a){
        dia= d;
        mes= m;
        anio= a;
    }
    
    //Comandos
    public void establecerDia(int d){
        dia= d;
    }
    public void establecerMes(int m){
        mes = m;
    }
    public void establecerAnio(int a){
        anio= a;
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
        boolean aux;
        if (anio % 4 == 0)
            aux= true;
        if (anio % 100==0) 
            if (anio % 400 == 0)
                aux=true;
            else aux=false;
        return aux;
    }
    public int difFechas(Fecha f){
        int dif;
        if (anio >= f.obtenerAnio())
            dif= anio - f.obtenerAnio();
        else dif= f.obtenerAnio() - anio;
        return dif;
    }
    public Fecha diaSiguiente(){
        return ;
    }
    public boolean esAnterior(Fecha f){
        boolean ant;
        if (anio < f.obtenerAnio())
            ant= true;
         else if (mes < f.obtenerMes())
                 ant= true;
              else if (dia < f.obtenerDia())
                  ant= true;
                    else ant= false;
        return ant;
    }
    public boolean equals(Fecha f){
        return dia == f.obtenerDia() && mes == f.obtenerMes() && anio == f.obtenerAnio();
    }
    public String toString(){
        return dia + "/" + mes + "/" + anio; 
    }
}
