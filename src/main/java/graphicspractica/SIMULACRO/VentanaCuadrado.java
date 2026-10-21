package graphicspractica.SIMULACRO;

import javax.swing.*;

public class VentanaCuadrado extends JFrame {

    public VentanaCuadrado(){

        setTitle("Cuadrado");
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new PanelCuadrado());

        setVisible(true);
    }

    public static void main(String[] args){
        new VentanaCuadrado();
    }

}
