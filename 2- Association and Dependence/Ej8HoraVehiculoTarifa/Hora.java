
public class Hora{
    
    //Atributos de Instancia
    //Clase cliente es responsable de: hor es un entero entre 7 y 22
    //Clase cliente es responsable de: min es un entero entre 0 y 59
    private int hor;
    private int min;
    
    //Constructor
    public Hora(int h, int m){
        hor = h;
        min = m;
    }
    
    //Comandos
    public void establecerHora(int c){
        hor = c;
    }
    public void establecerMinutos(int c){
        min = c;
    }
    public void copy(Hora h){
        hor = h.obtenerHora();
        min = h.obtenerMinutos();
    }
    
    //Consultas
    public int obtenerHora(){
        return hor;
    }
    public int obtenerMinutos(){
        return min;
    }
    public boolean equals(Hora c){
        return hor == c.obtenerHora() && min == c.obtenerMinutos();
    }
    public int diferenciaMinutos(Hora c){
        int dif;
        if (hor >= c.obtenerHora())
           dif = (hor - c.obtenerHora())*60 + (min - c.obtenerMinutos());
         else
             dif = (c.obtenerHora() - hor)*60 + (min - c.obtenerMinutos());
        return dif;
    }
    public boolean anterior(Hora c){
        boolean aux = false;
        if(hor < c.obtenerHora())
            aux = true;
          else if (hor == c.obtenerHora())
                  if (min < c.obtenerMinutos())
                     aux = true;
                    else aux = false;
                else aux = false;
        return aux;
    }
}
