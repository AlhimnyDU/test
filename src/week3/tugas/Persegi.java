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
public class Persegi extends BangunDatar {

    public Persegi() {
    }

    public Persegi(int p, int l, int t, int a, int r) {
        super(p, l, t, a, r);
    }
    
    @Override
    public void luas(){
        int s = super.getP();
        int luas =  s*s;
        System.out.println("Luas Persegi = "+luas);
    }
    
    public double luas(double s){
        return(s*s);
    }
    
    @Override
    public void keliling(){
        int s = super.getP();
        int kel = 4*s;
        System.out.println("Keliling Persegi = "+kel);
    }
    
    public double keliling(double s){
        return(4*s);
    }
}
