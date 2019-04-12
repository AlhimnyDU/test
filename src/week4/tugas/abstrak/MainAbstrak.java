/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.tugas.abstrak;

/**
 *
 * @author ASUS
 */
public class MainAbstrak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck duck = new Duck("Angsa","Cirebon",1);
        Cat cat = new Cat("Si Manis","Angora",5);
        Dog dog = new Dog("Si Hitam","Ciwawa", 30);
        System.out.println(duck);
        duck.suara();
        System.out.println(cat);
        cat.suara();
        System.out.println(dog);
        dog.suara();
        
    }
    
}
