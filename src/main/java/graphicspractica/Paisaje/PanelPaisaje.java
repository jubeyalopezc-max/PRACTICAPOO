package graphicspractica.Paisaje;

import javax.swing.*;
import java.awt.*;

public class PanelPaisaje extends JPanel {

    int  desplazamiento = 0;
    int altura = 400;
    private Timer timer;

    public void animarPaisaje(){

        timer = new Timer(50,e -> {

            //CARRETERA
            desplazamiento = desplazamiento - 10;
            if (desplazamiento <= -100){
                desplazamiento =0;
            }

            //SOL

         if(altura > 150){

                altura = altura -2; //SE ENCARGA DE RESTARLE 2 A Y
         }

            repaint();

        });


    }

    public PanelPaisaje(){animarPaisaje();}
    public void iniciar(){timer.start();};
    public void detener(){timer.stop();};


    @Override
    public Dimension getPreferredSize(){
        return new Dimension(900,600);
    }



    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        //FONDO
        g.setColor(Color.blue);
        g.fillRect(0,0,900,600);

        //SOL
        g.setColor(Color.YELLOW);
        g.fillOval(100,altura,100,100);


        //CARRO
        g.setColor(Color.RED);
        g.fillRect(100,400,250,90);
        g.fillRect(150,350,150,65);

        //CARRETERA
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0,520,900,900);

        //LLANTAS
        g.setColor(Color.BLACK);
        g.fillOval(120 ,450,80,80);
        g.fillOval(250 ,450,80,80);


        //LINEAS CARRETERA
        g.setColor(Color.WHITE);
        for (int i = 0; i < 10; i++){
            g.fillRect(i * 100 + desplazamiento, 550, 50, 10);
        }









}   }
