package graphicspractica.FormCarro;

import graphicspractica.DatosCarro.Datos;
import graphicspractica.PanelCarro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FomCarro {
    private JPanel panelCarro;
    private JPanel PanelPrincipal;
    private JPanel PanelBotones;
    private JButton BtnIniciar;
    private JButton BtnDetener;
    private JButton BtnInfo;

    public FomCarro(){

        BtnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "El carro arranco");
                ((PanelCarro)panelCarro).iniciar();

            }
        });


        BtnDetener.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "El carro se detuvo");
                ((PanelCarro)panelCarro).detener();

            }
        });


        BtnInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame ventana = new JFrame("Datos");
                ventana.setContentPane(new Datos().PanelInfo);
                ventana.setSize(900,600);
                ventana.setLocationRelativeTo(null);
                ventana.setVisible(true);

            }
        });
    }

    public static void main(String[]args){
        JFrame frame = new JFrame("Carro");

        frame.setContentPane(new FomCarro().PanelPrincipal);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(900,600);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

    }

    private void createUIComponents() {
        panelCarro = new PanelCarro();
    }
}
