package graphicspractica.Circulo;

import javax.swing.*;
import java.awt.*;

public class PanelCirculo extends JPanel {

    int radio = 10;
    private Timer timer;

    public void Animacion(){

        timer = new Timer(100,e -> {

            radio = radio + 5;

            if (radio > 150){
                timer.stop();
            }

            repaint();
        });
        timer.start();

    }

    public PanelCirculo(){Animacion();}


    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);


        //CIRCULO
        g.setColor(Color.RED);
        g.fillOval(450 - radio, 210 - radio, radio * 2, radio *2);


    }
}
