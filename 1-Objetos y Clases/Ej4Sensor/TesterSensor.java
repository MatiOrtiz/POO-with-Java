
public class TesterSensor{
    public static void main(String[] args){
        Sensor s1 = new Sensor((float)13.2,(float)15.4);
        Sensor s2 = new Sensor((float)14.7, (float)12.5);
        Sensor s3 = s1.clone();
        System.out.println("El estado interno de s1 y s3 es igual: " + s1.equals(s3));
        System.out.println("El estado interno de s1 y s2 es igual: " + s1.equals(s2));
        s2.establecerP1((float)13.2);
        s2.establecerP2((float)15.4);
        System.out.println("El estado interno de s1 y s2 es igual: " + s1.equals(s2));
    }
}
