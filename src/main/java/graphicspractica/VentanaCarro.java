package graphicspractica;


import javax.swing.*;

public class VentanaCarro extends JFrame {

    public VentanaCarro(){
        setTitle("VENTANA PRACTICA CARRO");
        setSize(900,600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        add(new PanelCarro());

        setVisible(true);

    }

    public static void main(String[] args) {
        new VentanaCarro();
    }

}
