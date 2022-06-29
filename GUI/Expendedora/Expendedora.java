import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.border.*;

public class Expendedora{
    //Objetos Graficos
    private MiEtiqueta etiqueta;
    private JButton botonJugo, botonCafe;
    private JPanel panelSup, panelInf;
    private int clickJ, clickC;
    
    public Expendedora(){
        //Establece los valores de los atributos del frame
        super("Jugo y Café");
        setLayout(new GridLayout(2,1));
        setSize(350, 550);
        clickJ=0;
        clickC=0;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Arma los paneles
        armaPanelSup();
        armaPanelInf();
        //Inserta los paneles en el panel del frame        
        getContentPane().add(panelSup);
        getContentPane().add(panelInf);           
    }
    
    private void armaPanelSup(){
        panelSup= new JPanel();
        etiqueta= new MiEtiqueta();
        etiqueta.setIcon(new ImageIcon("jugo.gif"));
        etiqueta.setText("Jugo " + clickJ);
        panelSup.add(etiqueta);
    }
    private void armaPanelInf(){
        panelInf= new JPanel();
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
            etiqueta.setText("Jugo " + clickJ);
        }
    }
    private class OyenteBotonC implements ActionListener{
        public void actionPerformed(ActionEvent e){
            etiqueta.setIcon(new ImageIcon("cafe.gif"));
            clickC++;
            etiqueta.setText("Cafe " + clickC);
        }
    }
}
