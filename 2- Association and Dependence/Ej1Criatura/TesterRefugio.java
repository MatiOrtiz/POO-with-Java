import IPOO.*;

public class TesterRefugio{

    public static void main(String args[]){
    /*ATENCION: 
      SE ASUME QUE LOS MÉTODOS  
            obtener...()
            toString()
     
      FUNCIONAN CORRECTAMENTE
    */
     
     
        //----------------------------
    //---TESTING DE CONSTRUCTOR---
        //----------------------------
        //valores ingresados por consola
        System.out.println("Testeando constructor... Ingrese 3 valores enteros:");
        int a,b,c;
        do{
            System.out.println("Ingrese alimentos y bebidas (juntos no deben 20 unidades ):");
            a = ES.leerEntero();
            b = ES.leerEntero();
            System.out.println("Ingrese camas (<= 10):");
            c = ES.leerEntero();
            
        }while((a + b > 20) || (c > 10));
        
        Refugio r = new Refugio(a,b,c);
        System.out.println();
        System.out.println(r.toString());
       
        System.out.println("==========================================================");
        
        //----------------------------
    //-----TESTING DE METODOS-----
        //----------------------------
       
        System.out.println("Testeando metodo consumirAlimento()...");
        // implementar consumirBebida() de manera similar
        int alim=r.obtenerAlimentos();
        if (r.obtenerAlimentos()>0){
            r.consumirAlimento();
            if (r.obtenerAlimentos() != (alim - 1)){
                System.out.println("ERROR: revisar metodo consumirAlimento()");
            }
            else{
                System.out.println("Metodo consumirAlimento() funciona correctamente");
            }
        }
        System.out.println();
        System.out.println(r.toString());
        System.out.println("----------------------------------------------------------");
        
        //------------------------------------------------------------------------------------------
        
        System.out.println("Testeando método reponerAlimento()...");
        // implementar reponerBebida() de manera similar
        System.out.println(" reponerAlimento(valor negativo)...");
        if (r.reponerAlimentos(-3) != false )
            System.out.println("ERROR : revisar metodo reponerAlimentos() al ingresar valor negativo");            
        
        alim = r.obtenerAlimentos()+ r.obtenerBebidas();
        
        int llenar = 20 - alim;
        
        System.out.println(" reponerAlimentos(supera capacidad)...");
        if (r.reponerAlimentos(llenar+1)!=false)
            System.out.println("ERROR : revisar metodo reponerAlimento() al superar capacidad");

        System.out.println(" reponerAlimento(valor correcto)...");
        if (r.reponerAlimentos(llenar))           
                    System.out.println("Método obtenerAlimento() funciona correctamente");
               else  
                    System.out.println("ERROR ");
                
        System.out.println();    
        System.out.println(r.toString());
        
        System.out.println("----------------------------------------------------------");
        
        //------------------------------------------------------------------------------------------
        
       
        System.out.println("Testeando método desocuparCama()...");
        // implementar ocuparCama() de manera similar
        int camas = r.obtenerCamas();        
        
        if (r.desocuparCama() ){
             System.out.println(r.toString());
             if (r.obtenerCamas()==camas-1)
                  System.out.println("Método desocuparCama() funciona correctamente");
             else
                  System.out.println("ERROR: revisar método desocuparCama()");
                }
        else{
            System.out.println(r.toString());
            if (camas == 0)
                    System.out.println("Método desocuparCama() funciona correctamente");
            else                
                    System.out.println("ERROR: revisar metodo desocuparCama()");
                                
            
        }
        System.out.println("----------------------------------------------------------");
        
        //------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("Testeando metodo mayorAlimentos()...");
        int a1 = r.obtenerAlimentos();
        Refugio r2 = new Refugio(1,1,1);
        int a2 = r2.obtenerAlimentos();
         System.out.println("Refugio 1   "+r.toString());
         System.out.println("Refugio 2   "+r2.toString());
        if (a1 > a2) 
            if (r.mayorAlimentos(r2))
                 System.out.println("Metodo mayorAlimentos() funciona correctamente");
            else 
                System.out.println("ERROR");
        
        else
             if (r.mayorAlimentos(r2)==false)
                 System.out.println("Método mayorAlimentos() funciona correctamente");
             else 
                System.out.println("ERROR");
        
        System.out.println("----------------------------------------------------------");
        
        //-------------------------------------------------------------------

        System.out.println("Testeando método clone()...");
        Refugio r3 = r.clone();
        if (r.obtenerAlimentos() == r3.obtenerAlimentos() && r.obtenerBebidas() == r3.obtenerBebidas() && r.obtenerCamas() == r3.obtenerCamas()){
            System.out.println("Método clone() funciona correctamente");
        }
        else{
            System.out.println("ERROR");
        }
        System.out.println("----------------------------------------------------------");

        //-------------------------------------------------------------------
//verificar los métodos restantes   
        System.out.println("FIN DEL TESTING");
     
    }
}