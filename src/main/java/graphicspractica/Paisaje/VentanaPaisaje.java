package graphicspractica.Paisaje;

import javax.swing.*;

public class VentanaPaisaje extends JFrame {

    public VentanaPaisaje(){

        setTitle("PAISAJE");
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new PanelPaisaje());

        setVisible(true);

    }

    public static void main(String[] args){

        new VentanaPaisaje();
    }




}
