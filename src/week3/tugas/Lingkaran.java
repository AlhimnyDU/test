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
public class Lingkaran extends BangunDatar {

    public Lingkaran() {
    }

    public Lingkaran(int p, int l, int t, int a, int r) {
        super(p, l, t, a, r);
    }
    
    @Override
    public void luas(){
        double r = super.getR();
        double luas = 3.14*r*r;
        System.out.println("Luas Lingkaran : "+luas);
    }
    
    public double luas(double r){
        return(3.14*r*r);
    }
    
    @Override
    public void keliling(){
        int r = super.getR();
        double kel = 2*3.14*r;
        System.out.println("Keliling Lingkaran : "+kel);
    }
    
    public double keliling(double r){
        return(2*3.14*r);
    }
}
