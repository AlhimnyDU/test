/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author ASUS
 */
public class MainPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person pr = new Person("Alhimny","Cileunyi","087825351290", 19);
        
        System.out.println(pr.toString());
        
        Person pr2 = new Person();
        
        pr2.setNama("Dwinata");
        pr2.setAge(19);
        //pr2.setAddress("Cibiru");
        pr2.setNhp("087825351290");
        System.out.println(pr2.toString());
    }
    
}
