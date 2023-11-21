/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modificadores;

/**
 *
 * @author Chicago
 */
public class Principal {
     public static void main(String[] args) {
        
        Modificadores ms = new  Modificadores();
        System.out.println("Modificador defecto es:"+ms.r);
        
        
        Privado ds= new Privado();
        ds.set_alorUno(16);
        
        System.out.println("Modificador privado es:"+ds.get_valoruno());
        
        
        Publico s = new Publico();
        s.n1=9;
       System.out.println("Modificador publico es:"+s.n1);
       
               Protegido sn= new Protegido();
               sn.valorUno=99;
               
       System.out.println("Modificador proctected es:"+sn.valorUno);

    }
    
    
}
