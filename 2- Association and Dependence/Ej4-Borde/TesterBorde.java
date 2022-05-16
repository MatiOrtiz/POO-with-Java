
import IPOO.*;
public class TesterBorde{
    public static void main(String args[]){
        //Testeo de Construcotr
        Color c1 = new Color (30,40,60);
        Color c2 = new Color (30,40,60);
        Color c3 = c1;
        Color c4 = c1.clone();
        Borde b1 = new Borde(1, c1);
        Borde b2 = new Borde(1, c2);
        Borde b3 = b2.clone();
        Borde b4 = new Borde(b2.obtenerGrosor(), b2.obtenerColor());
        Borde b5 = b2;
        
        //Testeo de Comandos y Consultas
        System.out.println("C1 es igual a C2: " + (c1 == c2) + ", C1 es igual a C3: " + (c1 == c3) + ", C1 es igual a C4: " + (c1 == c4));
        System.out.println("El estado interno de B1 es igual al estado interno de B2: " + b1.equals(b2) + ", El estado interno de B1 es igual al estado interno de B3:" + b1.equals(b3) + ", El estado interno de B1 es igual al estado interno de B4:" + b1.equals(b4));
        System.out.println("El grosor de B4 es igual al de B5: " + (b4.obtenerGrosor()==b5.obtenerGrosor()) + " El color de B4 es igual al de B5: " + (b4.obtenerColor() == b5.obtenerColor()));
        
        c1.copy(c2);
        System.out.println("C1 es igual a C2: " + (c1==c2));
        
        b4.establecerColor(c3);
        b4.establecerGrosor(5);
        System.out.println("El color de B4 es: " + b4.obtenerColor() + " y el grosor es: " + b4.obtenerGrosor());
    }
}
