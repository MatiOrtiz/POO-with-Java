import IPOO.*;
public class TesterColor{
    public static void main(String args[]){
        //Testeo de los Constructores
        Color c1 = new Color();
        Color c2 = new Color(125, 200, 50);
        
        //Testeo de los obtener
        System.out.println("Testeo del Constructor(255,255,255):");
        System.out.println("c1: " + c1.obtenerRojo() + "," + c1.obtenerAzul() + "," + c1.obtenerVerde());
        System.out.println("Testeo del Constructor(125,200,50):");
        System.out.println("c2: " + c2.obtenerRojo() + "," + c2.obtenerAzul() + "," + c2.obtenerVerde());
        
        //Testeo de los establecer
        System.out.println("Testeo de los establecer: ");
        c1.establecerRojo(100);
        c1.establecerAzul(100);
        c1.establecerVerde(100);
        System.out.println("c1: " + c1.obtenerRojo() + "," + c1.obtenerAzul() + "," + c1.obtenerVerde());
        
        //Testeo de los variar 
        System.out.println("Testeo variar: ");
        System.out.println("c2 antes de variar: " + c2.obtenerRojo() + "," + c2.obtenerAzul() + "," + c2.obtenerVerde());
        c2.variar(100);
        System.out.println("Testeo luego de variar: " + c2.obtenerRojo() + "," + c2.obtenerAzul() + "," + c2.obtenerVerde());
        
        //Testeo complemento de blanco
        System.out.println("Testeo complemento de blanco");
        System.out.println("c2: " + c2.obtenerRojo() + "," + c2.obtenerAzul() + "," + c2.obtenerVerde());
        Color c3= c2.complemento();
        System.out.println("c3: " + c3.obtenerRojo() + "," + c3.obtenerAzul() + "," + c3.obtenerVerde());
    }
}
