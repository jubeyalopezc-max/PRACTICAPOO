package graphicspractica.EjercicioPractica;

import graphicspractica.EjercicioPractica.FormReglas.Reglas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Semaforo {
    private JPanel PanelPrincipal;
    private JPanel PanelSemaforo;
    private JPanel PanelBotones;
    private JButton BtnIniciar;
    private JButton BtnDetener;
    private JButton BtnInfo;


    public Semaforo() {
        BtnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "El semaforo ha iniciado");
                ((PanelSemaforo)PanelSemaforo).iniciar();
            }
        });


        BtnDetener.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "El semaforo se detuvo");
                ((PanelSemaforo)PanelSemaforo).detener();

            }
        });


        BtnInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame reglas = new JFrame("Reglas");
                reglas.setContentPane(new Reglas().PanelReglas);
                reglas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                reglas.setSize(600,200);
                reglas.setLocationRelativeTo(null);
                reglas.setVisible(true);

            }
        });


    }

    private void createUIComponents() {
        PanelSemaforo = new PanelSemaforo();
    } //AQUI ES DONDE EL DIBUJO ENTRA AL FORMULARIO Y SE ACTIVA DANDOLE CUSTOM CREATE EN EL FORMULARIO

    public static void main(String[] args){

        JFrame semaforovent = new JFrame("Semaforo");
        semaforovent.setContentPane(new Semaforo().PanelPrincipal);
        semaforovent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        semaforovent.setSize(900,600);
        semaforovent.setLocationRelativeTo(null);
        semaforovent.setVisible(true);




    }
}
