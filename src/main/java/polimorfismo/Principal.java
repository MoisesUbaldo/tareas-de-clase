package polimorfismo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chicago
 */
public class Principal {
    public static void main(String[] args) {
        padre ms = new suma();
        ms.pedirDatos();
        ms.OperacionesAritmeticas();
        ms.MostrarResultado();
        
        
        
         padre s = new resta();
        s.pedirDatos();
        s.OperacionesAritmeticas();
        s.MostrarResultado();
    }
}
