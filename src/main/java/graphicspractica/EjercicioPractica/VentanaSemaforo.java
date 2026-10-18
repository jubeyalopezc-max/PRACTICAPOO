package graphicspractica.EjercicioPractica;

import javax.swing.*;

public class VentanaSemaforo extends JFrame {

    public VentanaSemaforo(){

        setTitle("SEMAFORO");
        setSize(900,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        add(new PanelSemaforo());

        setVisible(true);

    }

    public static void main(String[] args){

        new VentanaSemaforo();
    }








}
