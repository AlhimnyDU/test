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
public class PersegiPanjang extends BangunDatar {

    public PersegiPanjang() {
    }

    public PersegiPanjang(int p, int l, int t, int a, int r) {
        super(p, l, t, a, r);
    }
    
    @Override
    public void luas(){
        int p = super.getP();
        int l = super.getL();
        int luas = p*l;
        System.out.println("Luas Persegi Panjang : "+luas);
    }
    
   public double luas(double p,double l){
       return(p*l);
   }
   
    @Override
   public void keliling(){
        int p = super.getP();
        int l = super.getL();
        int kel = 2*(p+l);
        System.out.println("Keliling Persegi Panjang : "+kel);
   }
   public double keliling(double p, double l){
       return(2*(p+l));
   }
}
