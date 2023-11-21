/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacion;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Chicago
 */
public class Layout {
 private JPanel p;
    private int weight;
    private int height;
    private int escala=30;
    public Layout(JPanel parametro, int par) {
        this.escala=escala;
        this.p=parametro;
        weight=parametro.getWidth();
        height=parametro.getHeight();
    }
    
    public void dibujar(){        
        Graphics2D g=(Graphics2D) p.getGraphics();        
        g.clearRect(0, 0, weight, height);
        int x2=weight/2;
        for(int x=weight/2;x<weight;x+=escala){
            g.drawLine(x, 0, x,height);
            g.drawLine(x2, 0, x2,height);
            x2=x2-escala;
        }
        int y2=height/2;
        for(int y=height/2;y<height;y+=escala){
            g.drawLine(0, y, weight,y);
            g.drawLine(0, y2, weight,y2);
            y2=y2-escala;
        }
        g.setColor(Color.red);
        g.drawLine(weight/2, 0, weight/2,height);
        g.drawLine(0, height/2, weight,height/2);          
    }
    
    public void puntos(float x, float y){
        Graphics2D g=(Graphics2D) p.getGraphics(); 
        int xDigital=(int) (weight/2+x*escala);
        int yDigital=(int) (height/2-y*escala);
        g.fillOval(xDigital+78, yDigital-6, 6, 6);
    }
    

}    

