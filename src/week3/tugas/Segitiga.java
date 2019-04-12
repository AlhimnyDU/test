/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3.tugas;

/**
 *
 * @author ASUS
 */
public class Segitiga extends BangunDatar{

    public Segitiga() {
    }

    public Segitiga(int p, int l, int t, int a, int r) {
        super(p, l, t, a, r);
    }
    
    @Override
    public void luas(){
        int a = super.getA();
        int t = super.getT();
        double luas = 0.5*a*t;
        System.out.println("Luas Segitiga"+luas);
    }
    
    public int luas(int a, int t){
        return(int) (0.5*a*t);
    }
    
}
