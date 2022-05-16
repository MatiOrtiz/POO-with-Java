import IPOO.*;

public class Oracion{
    //Atributos de Instancia 
    private char s[];
    
    //Constructor
    public Oracion(String str){
        s = new char[str.length()-1];    
    }
    
    //Comandos 
    public void reducirBlancos(){
        /*Reemplaza las secuencias de dos o mas blancos por un solo blanco, excepto al final
           de la oracion.*/
        for(int i=0; i < s.length; i++)
            if(s[i] == (' ')  && s[i-1] == (' ') && s[i+1] < s.length)
                for(int j=i; j < s.length; j++)
                    s[j-1] = s[j];   
    }
    public void establecerLetra(int pos, char l){
        s[pos] = l;    
    }
    
    //Consultas
    public char obtenerLetra(int pos){
        return s[pos];    
    }
    public boolean esLetra(int pos){
        boolean aux = false;
        if(pos >= 0 && pos < s.length)
            aux = s[pos] == ES.leerChar();
        return aux;
    }
    public boolean esPrimeraPalabra(int pos){
        boolean aux = false;
        if(pos >= 0 && pos < s.length)
            if(esLetra(pos) && !esLetra(pos-1))
                aux = true;
        return aux;
    }
    public int longitud(){
        return s.length;
    }
    public int contarPalabras(){
        int cont = 0;
        for(int i=0; i < s.length; i++)
            if(s[i] == ES.leerChar() && (s[i+1] == ' ' || s[i+1] == ',' || s[i+1] == '.'))
                cont ++;
        return cont;
    }
    public int masLarga(){
        int cont = 0;
        int mayor = 0;
        for(int i=0; i < s.length; i++){
            if(s[i] == ' ' || s[i] == ',' || s[i] == '.')
                cont++;   
            if(cont > mayor)
                mayor = cont;
        }
        return mayor;
    }
    public boolean hayNVocales(int n){
        int cont = 0;
        boolean resultado;
        for(int i=0; i < s.length; i++)
            if(s[i] == 'a' || s[i] == 'e'  || s[i] == 'i' || s[i] == 'o' || s[i] == 'u')
                cont++;
        if (cont == n)
            resultado = true;
          else resultado = false;
        return resultado;
    }
    public boolean dosVocalesConsecutivas(){
        boolean consecutivas = false;
        for(int i=0; i < s.length && !consecutivas; i++)
            if((s[i] == 'a' || s[i] == 'e'  || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') && (s[i+1] == 'a' || s[i+1] == 'e'  || s[i+1] == 'i' || s[i+1] == 'o' || s[i+1] == 'u'))
                consecutivas = true;
                else consecutivas = false;
            return consecutivas;
    }
    public SecuenciaEnteros histograma(){
        /*Retorna un objeto secuenciaEnteros que registra la cantidad de apariciones de cada 
        letra del alfabeto en la oración que recibe el mensaje. Observe que la cantidad de 
        elementos de secuenciaEnteros corresponde a la cantidad de letras del alfabeto.
        */
       SecuenciaEnteros h = new SecuenciaEnteros(26);
       
       for(int j=0; j < h.cantElementos(); j++)
           h.establecerEntero(j,0);
       for(int i=0; i < s.length; i++)
           if(s[i] == 'a')
               h.establecerEntero(i,h.obtenerEntero(i)+s[i]);
               else if(s[i] == 'b')
                       h.establecerEntero(i,h.obtenerEntero(i)+s[i]);
                       else if(s[i] == 'c')
                               h.establecerEntero(i,h.obtenerEntero(i)+s[i]);
                               else if(s[i] == 'd')
                                       h.establecerEntero(i,h.obtenerEntero(i)+s[i]);
    }
}

