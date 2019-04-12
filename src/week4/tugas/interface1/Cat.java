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
public class Cat implements BinatangInterface{

    @Override
    public void suara() {
        System.out.println("meong.meong..meong");
    }

    @Override
    public String toString() {
        return "Cat{" + "nama=" + nama2 + ", breed=" + breed2 + ", umur=" + umur2 + '}';
    }
    
}
