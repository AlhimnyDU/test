/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author ASUS
 */
public class MainBangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar b = new BangunDatar();
        Persegi p = new Persegi();
        Segitiga s = new Segitiga();
        
        b.bentuk();
        p.bentuk();
        s.bentuk();
        
        //Persegi pl = new Persegi();
        //System.out.println(pl.luas(5));
        
        //pl.luas(3.5);
        Persegi p2 = new Persegi(5.5);
        p2.luas();
        
    }
    
}
