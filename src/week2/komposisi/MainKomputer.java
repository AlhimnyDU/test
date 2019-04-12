/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.komposisi;

/**
 *
 * @author ASUS
 */
public class MainKomputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cpu cpu = new Cpu("AMD");
        Keyboard kb = new Keyboard("Razer");
        Mouse mouse = new Mouse("Votre");
        Komputer cmp = new Komputer("MyPC", mouse, cpu, kb);
        
        System.out.println(cmp.toString());
    }
    
}
