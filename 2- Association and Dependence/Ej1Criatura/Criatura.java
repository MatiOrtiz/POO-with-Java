
public class Criatura{
    
    //Atributos de Clase
    private final int maxEnergia = 100;
    private final int minEnergia = 0;
    private final int consumoEnergia = 10;
    
    //Atributos de Instancia
    private int energia, caminatas;
    private Refugio refugio;
    private boolean dormido = true;
    
    //Constructor
    public Criatura(Refugio r){
        refugio = r;
        energia = maxEnergia;
        caminatas = 0;
        dormido = false;
    }
    
    //Comandos
    public boolean comer(){
        boolean aux = false;
        if (refugio.obtenerAlimentos() > 0 && estaVivo() && !estaDormido()){
            if(energia == maxEnergia)
                refugio.consumirAlimento();
            else{
                energia ++;
                refugio.consumirAlimento();
                aux= true;
            } 
        }
        else{
            aux= false;       
            }
        return aux;
    }
    public boolean beber(){
        boolean aux = false;
        if (refugio.obtenerBebidas() > 0 && estaVivo() && !estaDormido()){
            if(energia == maxEnergia)
                refugio.consumirBebida();
            else{
                energia ++;
                refugio.consumirBebida();
                aux= true;
            } 
        }
        else{
            aux= false;       
            }
        return aux;        
    }
    public boolean dormir(){
        boolean aux;
        if (estaVivo() && !estaDormido() && refugio.disponibilidad() > 0){
            refugio.ocuparCama();
            dormido = true;
            aux = true;
        }
        else aux = false;
        return aux;
    }
    public boolean despertar(){
        boolean aux;
        if(estaVivo() && estaDormido()){
            refugio.desocuparCama();
            dormido = false;
            caminatas = 0;
            aux = true;
        }
        else aux = false;
        return aux;
    }
    public boolean caminar(){
        boolean aux;
        if (!estaVivo() || estaDormido())
            aux = false;
        if (caminatas >= 3){
            aux = false;
            if(!dormir())
                energia = minEnergia;
        }
        else{
            caminatas ++;
            aux = true;
            energia -= consumoEnergia;
        }
        return aux;
    }
    
    //Consultas
    public int obtenerEnergia(){
        return energia;    
    }
    public int obtenerCaminatas(){
        return caminatas;
    }
    public int obtenerHumor(){
        int humor = 0;
        if (refugio.esHabitable()){
            if (energia >= 41 && energia <= 70)
                humor = 2;
            if (energia >= 71)
                humor = 3;
        }
        else humor = 1;
        return humor;
    }
    public Refugio obtenerRefugio(){
        return refugio;    
    }
    public boolean estaDormido(){
        return dormido;       
    }
    public boolean estaVivo(){
        return energia > minEnergia; 
    }
    public boolean mayorEnergia(Criatura c){
        return energia > c.obtenerEnergia();    
    }
    public String toString(){
        return energia + " " + dormido + " " + caminatas + ". " + refugio.toString();    
    }
}
