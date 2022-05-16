import IPOO.*;
public class TesterFecha
{
    public static void main(String args []){
    //Testeo de constructor
        Fecha f1 = new Fecha (25,3,2018);
        
    //Testeo de los obtener
        System.out.println("     Testeo Constructor (25/3/2018) y obtener");
        System.out.println("f1:  "+f1.obtenerDia()+" / "+f1.obtenerMes() +" / "+ f1.obtenerAnio());
        
        System.out.println();
        
    //Testeo de los establecer
        f1.establecerDia(28);
        f1.establecerMes(2);
        f1.establecerAnio(2020);
        
        System.out.println ("     Testeo establecer (28/2/2020)");
        System.out.println("f1  :"+f1.obtenerDia()+" / "+f1.obtenerMes()+ " / "+ f1.obtenerAnio());
        
    /*Testeo de consulta diaSiguiente() y esAnterior()
         * Dia siguiente de fecha 28-2-2020 (año bisiesto)
         */
        Fecha f2 = f1.diaSiguiente();
       
        System.out.println();
    
        System.out.println ("     Testeo día siguiente del día 28/2/2020   (f1) y   esAnterior ");
        System.out.println("Dia Siguiente (f2):   "+f2.obtenerDia()+" / "+f2.obtenerMes()+ " / "+ f2.obtenerAnio());
        System.out.println("¿f1 es anterior a f2?   "+f1.esAnterior(f2));
        System.out.println("¿f2 es anterior a f1?   "+f2.esAnterior(f1));
        /*
         * Dia siguiente de fecha 28-2-2019 (año no bisiesto)
         */
        f1.establecerAnio(2019);
        f2 = f1.diaSiguiente();
        System.out.println();
       
        System.out.println("f1:    "+f1.obtenerDia()+" / "+f1.obtenerMes() +" / "+ f1.obtenerAnio());
        System.out.println("Dia Siguiente (f2):     "+f2.obtenerDia()+" / "+f2.obtenerMes()+ " / "+ f2.obtenerAnio());
        System.out.println("¿f1 es anterior a f2?    "+f1.esAnterior(f2));
        System.out.println("¿f2 es anterior a f1?    "+f2.esAnterior(f1));
          /*
         * Dia siguiente de fecha 31-12-2019 (fin de año)
         */
        f1.establecerDia(31);
        f1.establecerMes(12);
        f2 = f1.diaSiguiente();        
        
        System.out.println();        
        System.out.println("f1:   "+f1.obtenerDia()+" / "+f1.obtenerMes() +" / "+ f1.obtenerAnio());
        System.out.println("Dia Siguiente (f2):   "+f2.obtenerDia()+" / "+f2.obtenerMes()+ " / "+ f2.obtenerAnio());        
        System.out.println("¿f1 es anterior a f2?  "+f1.esAnterior(f2));
        System.out.println("¿f2 es anterior a f1?   "+f2.esAnterior(f1));
        
        System.out.println();
    /*Testeo el comando equals
         * Fechas distintas 
         */
        System.out.println ("     Testeo equals ");
        System.out.println("f1:"+f1.obtenerDia()+" / "+f1.obtenerMes() +" / "+ f1.obtenerAnio());
        System.out.println("f2 :"+f2.obtenerDia()+" / "+f2.obtenerMes()+ " / "+ f2.obtenerAnio());
        System.out.println("¿f1 es igual a f2?   "+f1.equals(f2));
        
        /*
         * Fechas iguales 
         */
        f2 = new Fecha(31,12,2019);
        System.out.println();
        System.out.println("f1: "+f1.obtenerDia()+" / "+f1.obtenerMes() +" / "+ f1.obtenerAnio());
        System.out.println("f2: "+f2.obtenerDia()+" / "+f2.obtenerMes()+ " / "+ f2.obtenerAnio());
        System.out.println("¿f1 es igual a f2?   "+f1.equals(f2));
        
    //Testeo de la consulta difFechas
    
        f2 = new Fecha(31,12,2023);
        System.out.println();
        System.out.println("f1: "+f1.obtenerDia()+" / "+f1.obtenerMes() +" / "+ f1.obtenerAnio());
        System.out.println("f2: "+f2.obtenerDia()+" / "+f2.obtenerMes()+ " / "+ f2.obtenerAnio());
        System.out.println("diferencia "   +f1.difFechas(f2));
    
      
        
        
    }
}