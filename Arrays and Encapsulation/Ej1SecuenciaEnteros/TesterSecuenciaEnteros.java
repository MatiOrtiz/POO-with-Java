
public class TesterSecuenciaEnteros{
    public static void main(String []args){
        SecuenciaEnteros s1= new SecuenciaEnteros(11);
        
        s1.establecerEntero(0, 8);
        s1.establecerEntero(1, 16);
        s1.establecerEntero(2, 24);
        s1.establecerEntero(3, 18);
        s1.establecerEntero(4, 24);
        s1.establecerEntero(5, 32);
        s1.establecerEntero(6, 74);
        s1.establecerEntero(7, 24);
        s1.establecerEntero(8, 2);
        s1.establecerEntero(9, 57);
        s1.establecerEntero(10, 21);
        
        for(int i=0; i< 11; i++)
            System.out.println(s1.obtenerEntero(i));
        
        s1.reemplazar(57, 18);
        s1.reemplazar(24);
        
        for(int i=0; i< 11; i++)
            System.out.println(s1.obtenerEntero(i));
        
        //s1.intercambiar(2,3);
        //s1.intercambiar(0,12);
        //System.out.println("El primer y segundo intercambiar son: " + (s1.intercambiar(2,3)== true) + " y " + (s1.intercambiar(0, 12)==true));
        
        SecuenciaEnteros s4 = s1.clone();
        System.out.println(s4.toString());
        
        SecuenciaEnteros s2= new SecuenciaEnteros(9);
        SecuenciaEnteros s3 = new SecuenciaEnteros(11);
        System.out.println("El primer y segundo parametro son: " + (s1.copy(s2)== true) + " y " + (s1.copy(s3)== true));
        
    }
}
