package graphicspractica.DatosCarro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Datos {
    public JPanel PanelInfo;
    private JButton BtnCerrar;

    public Datos() {
        BtnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cerrando la ventana de datos...");
                SwingUtilities.getWindowAncestor(PanelInfo).dispose();
            }
        });
    }
}
