package graphicspractica.Circulo;

import javax.swing.*;

public class VentanaCirculo extends JFrame   {

    public VentanaCirculo(){

        setTitle("CIRCULO");
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new PanelCirculo());

        setVisible(true);

    }

    public static void main(String[] args){

        new VentanaCirculo();

    }










}
