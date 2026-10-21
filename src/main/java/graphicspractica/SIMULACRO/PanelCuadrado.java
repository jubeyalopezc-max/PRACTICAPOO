package graphicspractica.SIMULACRO;

import javax.swing.*;
import java.awt.*;

public class PanelCuadrado extends JPanel {

    private int x= 0;
    private int velocidad = 5;
    public Timer timer;

    public void animacion(){

        timer   = new Timer(50, e -> {

            x = x + velocidad;

         if (x <=0){

             velocidad = 10;

         }

        if (x >= 820){


            velocidad = -10;

        }

        repaint();


        });



    }


    public  PanelCuadrado(){animacion();}

    public void iniciar(){timer.start();}

    public void detener(){timer.stop();}


    @Override
    public Dimension getPreferredSize(){return new Dimension(900,600);};


    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        //CUADRADO
        g.setColor(Color.green);
        g.fillRect(x,150,60,60);


    }

}
