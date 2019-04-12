/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.tugas.interface1;

/**
 *
 * @author ASUS
 */
public class Dog implements BinatangInterface{

    @Override
    public String toString() {
        return "Dog{" + "nama=" + nama3 + ", breed=" + breed3 + ", umur=" + umur3 + '}';
    }

    @Override
    public void suara() {
        System.out.println("gok..gok..gok");
    }
    
}
