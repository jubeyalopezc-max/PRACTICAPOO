package graphicspractica;

import javax.swing.*;
import java.awt.*;

public class PanelCarro extends JPanel {

    private int x = 0;
    private Timer timer;

    public void iniciarAnimacion(){
        timer = new Timer(50, e -> {
            x= x + 10;

            if(x > 500){
                timer.stop();
            }
            repaint();

        });


    }

    public PanelCarro(){
        iniciarAnimacion();
    }

    public void iniciar(){
        timer.start();
    }

    public void detener(){
        timer.stop();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        //NUBES
        g.setColor(Color.BLUE);
        g.drawRect(120,70,200,65);
        g.drawRect(550,70,200,65);
        g.fillRect(550,70,200,65);
        g.fillRect(120,70,200,65);

        //SOL
        g.setColor(Color.YELLOW);
        g.fillOval(380,50,100,100);

        //CARRO
        g.setColor(Color.RED);
        g.fillRect(100 + x,400,250,90);
        g.fillRect(150 + x,350,150,65);

        //LLANTAS
        g.setColor(Color.BLACK);
        g.fillOval(120 + x,450,80,80);
        g.fillOval(250 + x,450,80,80);


        //CARRETERA
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,520,900,900);








    }


}
