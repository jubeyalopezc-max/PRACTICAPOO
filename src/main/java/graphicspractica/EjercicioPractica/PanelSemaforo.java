package graphicspractica.EjercicioPractica;

import javax.swing.*;
import java.awt.*;

/**
 * AQUI ES EL PANEL QUE SE ENCARGA DE DIBUJAR EL SEMAFORO
 *
 * @author Zenin
 */

public class PanelSemaforo extends JPanel {

    private int luz = 0;

    private Timer timer;

    public void iniciarluces() {
        timer = new Timer(1500, e -> {

            if (luz == 2) {
                luz = 0;
            } else {
                luz++;
            }

            repaint();


        });
    }

    /**
     * Prepara el timer sin avanzar
     */

    public PanelSemaforo() {
        iniciarluces();
    }

    /**
     * Arranca el timer para que las luces empiecen a cambiar
     */
    public void iniciar() {
        timer.start();
    }

    /**
     * Detiene el timer
     */
    public void detener() {
        timer.stop();
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(900,450);
    }
    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        //RECTANGULO SEMAFORO
        g.setColor(Color.BLACK);
        g.fillRect(150, 110, 710, 300);


        if (luz == 0) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.GRAY);
        }

        //CIRCULO LUCES
        g.fillOval(190, 150, 210, 210);


        if (luz == 1) {
            g.setColor(Color.YELLOW);
        } else {
            g.setColor(Color.GRAY);
        }

        //CIRCULO2 LUCES
        g.fillOval(410, 150, 210, 210);


        if (luz == 2) {
            g.setColor(Color.GREEN);
        } else {
            g.setColor(Color.GRAY);
        }

        //CIRCULO3 LUCES
        g.fillOval(630, 150, 210, 210);
    }
}















