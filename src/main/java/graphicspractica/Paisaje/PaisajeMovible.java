package graphicspractica.Paisaje;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The type Paisaje movible.
 */
public class PaisajeMovible {
    private JPanel PanelPrincipal;
    private JPanel panelPaisaje;
    private JPanel PanelBotones;
    private JButton BtnDetener;
    private JButton BtnIniciar;

    /**
     *
     */
    public PaisajeMovible() {
        BtnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Inicia el viaje ;)");
                ((PanelPaisaje)panelPaisaje).iniciar();
            }
        });

        /**
         *
         */
        BtnDetener.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Ha terminado el viaje :( ");
                ((PanelPaisaje)panelPaisaje).detener();
            }
        });
    }

    private void createUIComponents() {
        panelPaisaje = new PanelPaisaje();
        // TODO: place custom component creation code here
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        JFrame paisaje = new JFrame("Paisaje");
        paisaje.setContentPane(new PaisajeMovible().PanelPrincipal);
        paisaje.setSize(900,600);
        paisaje.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        paisaje.setLocationRelativeTo(null);
        paisaje.setVisible(true);
    }
}
