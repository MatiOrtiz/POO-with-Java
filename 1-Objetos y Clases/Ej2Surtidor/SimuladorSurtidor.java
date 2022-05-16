import IPOO.*;

public class SimuladorSurtidor{
    public static void main(String args[]){
        Surtidor s= new Surtidor();
        System.out.println("Ingrese la cantidad de interaciones que desea");
        int n= ES.leerEntero();
        for(int i=0; i<n; i++){
            System.out.println("La cantidad de litros de Gasoil es:" + s.obtenerLitrosGasoil());
            System.out.println("La cantidad de litros de Super es:" + s.obtenerLitrosSuper());
            System.out.println("La cantidad de litros de Premium es:" + s.obtenerLitrosPremium());
            
            System.out.println("Ingrese una opción: 1. Leer litros a cargar y cargar Gasoil");
            System.out.println("2. Leer litros a cargar y cargar Super"); 
            System.out.println("3. Leer litros a cargar y cargar Premium");
            System.out.println("4. Llenar depósito de Gasoil");
            System.out.println("5. Llenar depósito de Super");
            System.out.println("6. Llenar depósito de Premium");
            
            int opcion= ES.leerEntero();
            
            if(opcion == 1){
                System.out.println("Ingrese la cantidad de litros a cargar: ");
                int carga = ES.leerEntero();
                s.extraerGasoil(carga);
            }
            if(opcion == 2){
                System.out.println("Ingrese la cantidad de litros a cargar: ");
                int carga = ES.leerEntero();
                s.extraerSuper(carga);
            }
            if(opcion == 3){
                System.out.println("Ingrese la cantidad de litros a cargar: ");
                int carga = ES.leerEntero();
                s.extraerPremium(carga);
            }
            if(opcion == 4)
                s.llenarDepositoGasoil();
            if(opcion == 5)
                s.llenarDepositoSuper();
            if(opcion == 6)
                s.llenarDepositoPremium();
        }
        
        System.out.println("La cantidad de litros de Gasoil es: " + s.obtenerLitrosGasoil());
        System.out.println("La cantidad de litros de Super es:" + s.obtenerLitrosSuper());
        System.out.println("La cantidad de litros de Premium es:" + s.obtenerLitrosPremium());
    }
}
