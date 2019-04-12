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
public class Duck implements BinatangInterface{  
    
    @Override
    public void suara() {
        System.out.println("Kwek..Kwekk.Kwek..");
    }

    @Override
    public String toString() {
        return "Duck{" + "nama=" + nama1 + ", breed=" + breed1 + ", umur=" + umur1 + '}';
    }
    
    
}
