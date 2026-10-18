package graphicspractica.EjercicioPractica.FormReglas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reglas {
    public JPanel PanelReglas;
    private JTextField TxtNombre;
    private JButton BtnSaludar;
    private JButton BtnCerrar;
    private JLabel Reglas;

    public Reglas() {
        BtnSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = TxtNombre.getText();
                JOptionPane.showMessageDialog(null, "Hola, " + nombre + ", Respeta las luces");

            }
        });


        BtnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Cerrando la ventana de datos...");
                SwingUtilities.getWindowAncestor(Reglas).dispose();

            }
        });


    }

    public static void main(String[] args){
        JFrame reglas = new JFrame("Reglas");
        reglas.setContentPane(new Reglas().PanelReglas);
        reglas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        reglas.setSize(900,600);
        reglas.setLocationRelativeTo(null);
        reglas.setVisible(true);

    }
}
