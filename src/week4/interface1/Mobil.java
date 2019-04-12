/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.interface1;

/**
 *
 * @author ASUS
 */
public class Mobil implements KomponenInterface{

    @Override
    public void main() {
        System.out.println("Kecepatan Mobil : "+kecepatanMax);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void design() {
        System.out.println("Model Mobil : "+model);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
