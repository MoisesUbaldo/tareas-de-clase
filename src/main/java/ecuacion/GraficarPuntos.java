/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuacion;

import ecuacion.Layout;

/**
 *
 * @author Chicago
 */
public class GraficarPuntos {
   public static void dibujarPuntos(Layout p){
        for(float x=-10;x<10;x+=.1){
            float y=x*x;
            p.puntos(x, y);
        }
    }
}
