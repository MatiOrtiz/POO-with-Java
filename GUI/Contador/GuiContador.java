
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
class GuiContador extends JFrame {
/*Atributos de instancia, objetos gráficos y de la aplicación*/
  private int numero, nInicial, nFinal;
  private JLabel numeroEtiqueta;
  private JButton botonIncrementar,botonDecrementar;
  public GuiContador(int in, int fi) {
        super ("Contador");
        nInicial= in;
        nFinal= fi;
//Incializa variables
    numero = nInicial;
//Establece los valores de los atributos del frame
        setLayout(new FlowLayout());
    setSize(300, 250);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
//Invoca a un método interno que completa la GUI
     hacerGUI();
}
//Implementa las clases oyente
private void hacerGUI(){
//Crea la etiqueta para el número
  numeroEtiqueta = new JLabel("" + numero);
//Crea el boton incrementar, el oyente y lo registra
  botonIncrementar = new JButton("Incrementar");
  OyenteBotonI incrementar = new OyenteBotonI();
  botonIncrementar.addActionListener(incrementar);
//Crea el boton decrementar, el oyente y lo registra
  botonDecrementar = new JButton("Decrementar");
  OyenteBotonD decrementar = new OyenteBotonD();
  botonDecrementar.addActionListener(decrementar);
//Inserta las componentes en el panel del frame        
  getContentPane().add(numeroEtiqueta);
  getContentPane().add(botonIncrementar);
  getContentPane().add(botonDecrementar);
 }

 private class OyenteBotonI implements ActionListener {
     public void actionPerformed(ActionEvent event) {
      if(numero < nFinal){
         numero++;
         numeroEtiqueta.setText("" + numero);
      }  
     }
 }
 private class OyenteBotonD implements ActionListener {
     public void actionPerformed(ActionEvent event) {
      if(numero > nInicial){
         numero--;
        numeroEtiqueta.setText("" + numero);
      }  
     }
 }
}



