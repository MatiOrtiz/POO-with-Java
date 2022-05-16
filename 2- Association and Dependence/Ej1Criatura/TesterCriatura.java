import IPOO.*;
public class TesterCriatura{
    public static void main(String args[]){
        
        //Testeo del Constructor
        Refugio r = new Refugio(10,5,6);
        Criatura c = new Criatura(r);
        
        //Testeo refugio
        System.out.println(r.toString());
        
        //Testeo Comer
        System.out.println("En el refugio hay " + r.obtenerAlimentos() + "alimentos.");
        System.out.println("La energia de la criatura es " + c.obtenerEnergia() + ".");
        System.out.println("Ejecutando accion comer.");
        
        if (r.obtenerAlimentos() == 0)
            System.out.println("No quedan alimentos.");
        else{ 
            c.comer();
            System.out.println("Ahora hay " + r.obtenerAlimentos() + "alimentos.");
            System.out.println("Ahora la energia de la criatura es " + c.obtenerEnergia());
        }
        
        //Testeo Beber
        System.out.println("En el refugio hay " + r.obtenerBebidas() + "bebidas.");
        System.out.println("La energia de la criatura es " + c.obtenerEnergia() + ".");
        System.out.println("Ejecutando accion beber.");
        
        if (r.obtenerBebidas() == 0)
            System.out.println("No quedan bebidas.");
        else{ 
            c.beber();
            System.out.println("Ahora hay " + r.obtenerBebidas() + "bebidas.");
            System.out.println("Ahora la energia de la criatura es " + c.obtenerEnergia());
        }
        
        //Testeo Dormir
        int cam = r.disponibilidad();
        System.out.println("La cantidad de camas disponibles es: " + cam);
        
        if (c.estaDormido() == true)
            System.out.println("Ya esta dormido.");
        else if (c.dormir()){
                if (cam -1 != r.disponibilidad())
                    System.out.println("El metodo dormir es incorrecto");
                else 
                    System.out.println("El metodo dormir es correcto");
        }
        
        //Testeo Despertar
        cam = r.obtenerCamas();
        System.out.println("La cantidad de camas disponibles es: " + cam);
        
        if (c.estaDormido() == false)
            System.out.println("Ya esta despierto.");
        else if (c.despertar()){
                if (cam -1 != r.obtenerCamas())
                    System.out.println("El metodo despertar es incorrecto");
                else 
                    System.out.println("El metodo despertar es correcto");
        }
        
        //Testeo Caminatas
        System.out.println("La criatura caminó " + c.obtenerCaminatas());
        if (c.obtenerCaminatas() == 4)
            System.out.println("La criatura ya se cansó, ahora está durmiendo.");
        c.caminar();
        c.caminar();
        c.caminar();
        c.caminar();
        System.out.println("La criatura caminó " + c.obtenerCaminatas() + "veces en lo que estuvo despierta");
        
        //Testeo muerte
        
    }
}
