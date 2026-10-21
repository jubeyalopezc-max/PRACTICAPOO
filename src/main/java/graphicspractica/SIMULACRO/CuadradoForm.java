package graphicspractica.SIMULACRO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuadradoForm {
    public JPanel PanelPrincipal;
    public JPanel PanelCuadrado;
    private JPanel PanelBotones;
    private JButton BtnIniciar;
    private JButton BtnDetener;

    public CuadradoForm() {
        BtnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"Iniciando....");
                ((PanelCuadrado)PanelCuadrado).iniciar();

            }
        });


        BtnDetener.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"Cerrando....");
                ((PanelCuadrado)PanelCuadrado).detener();

            }
        });
    }

    private void createUIComponents() {
        PanelCuadrado = new PanelCuadrado();
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame cuadrado = new JFrame("UN LOQUILLO");
        cuadrado.setContentPane(new CuadradoForm().PanelPrincipal);
        cuadrado.setSize(900,600);
        cuadrado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cuadrado.setLocationRelativeTo(null);
        cuadrado.setVisible(true);
    }
}
