import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.border.*;

public class Expendedora extends JFrame{
    //Objetos Graficos
    private MiEtiqueta etiqueta, cantC, cantJ;
    private JButton botonJugo, botonCafe;
    private JPanel panelSup, panelMed, panelInf;
    private int clickJ, clickC;
    
    public Expendedora(){
        //Establece los valores de los atributos del frame
        super("Expendedora de Bebidas");
        setLayout(new GridLayout(3,1));
        setSize(300, 700);
        clickJ=0;
        clickC=0;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Arma los paneles
        armaPanelSup();
        armaPanelMed();
        armaPanelInf();
        //Inserta los paneles en el panel del frame        
        getContentPane().add(panelSup);
        getContentPane().add(panelMed);
        getContentPane().add(panelInf);           
    }
    
    private void armaPanelSup(){
        panelSup= new JPanel();
        panelSup.setBackground(Color.GRAY);
        etiqueta= new MiEtiqueta();
        panelSup.add(etiqueta);
    }
    private void armaPanelMed(){
        panelMed= new JPanel();
        cantC= new MiEtiqueta();
        cantJ= new MiEtiqueta();
        panelMed.add(cantJ);
        panelMed.add(cantC);
    }
    private void armaPanelInf(){
        panelInf= new JPanel();
        panelInf.setBackground(Color.GRAY);
        botonJugo= new JButton("Jugo");
        botonCafe= new JButton("Cafe");
        botonJugo.setPreferredSize(new Dimension(124, 50));
        //botonJugo.setSize(150, 50);
        botonJugo.setBackground(Color.BLUE);
        botonJugo.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.GREEN, 5, false), null));
        OyenteBotonJ oyenteJugo= new OyenteBotonJ();
        botonJugo.addActionListener(oyenteJugo);
        botonCafe.setPreferredSize(new Dimension(124, 50));
        //botonCafe.setSize(150,50);
        botonCafe.setBackground(Color.BLUE);
        botonCafe.setBorder(BorderFactory.createCompoundBorder(new LineBorder(Color.GREEN, 5, false), null));
        OyenteBotonC oyenteCafe= new OyenteBotonC();
        botonCafe.addActionListener(oyenteCafe);
        
        //Insertar los botones en el panel
        panelInf.add(botonJugo);
        panelInf.add(botonCafe);
    }
    
    private class OyenteBotonJ implements ActionListener{
        public void actionPerformed(ActionEvent e){
            etiqueta.setIcon(new ImageIcon("jugo.gif"));
            clickJ++;
            if(clickJ==10)
                botonJugo.setEnabled(false);
            etiqueta.setText("Jugo");
            cantJ.setText("Cantidad de jugos vendidos " + clickJ);
        }
    }
    private class OyenteBotonC implements ActionListener{
        public void actionPerformed(ActionEvent e){
            etiqueta.setIcon(new ImageIcon("cafe.gif"));
            clickC++;
            if(clickC==10)
                botonCafe.setEnabled(false);
            etiqueta.setText("Café");
            cantC.setText("Cntidad de café vendidos " + clickC);
        }
    }
}