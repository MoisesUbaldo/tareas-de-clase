package polimorfismo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Chicago
 */
import java.util.Scanner;

public abstract class  padre {

    protected int n1, n2, r;

    public void pedirDatos() {
        Scanner a = new Scanner(System.in);
        System.out.println("Dame el primer valor:");
        n1 = a.nextInt();
        System.out.println("Dame el segundo valor:");
        n2 = a.nextInt();

    }
    
    public abstract void OperacionesAritmeticas();
    
    
    public void MostrarResultado(){
        System.out.println(r);
    }
        
    
    
    

}
