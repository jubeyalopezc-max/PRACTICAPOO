package graphicspractica.Paisaje;

import javax.swing.*;

public class PanelPaisaje extends JPanel {

    int  desplazamiento = 0;
    private Timer timer;

    public void AnimarPaisaje(){

        //CARRETERA
        desplazamiento = desplazamiento - 9;
        if (desplazamiento <= -100){

        }

        repaint();
    }










}
