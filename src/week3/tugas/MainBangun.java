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
public class MainBangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar b = new BangunDatar();
        Persegi p = new Persegi();
        Segitiga s = new Segitiga();
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran l = new Lingkaran();
        b.luas();
        b.keliling();
        System.out.println("");
        //Persegi Luas
        p.setP(2);
        p.luas();
        System.out.println("Luas Persegi : "+p.luas(2.5));
        System.out.println("");
        //Persegi Keliling
        p.setP(3);
        p.keliling();
        System.out.println("Keliling Persegi :"+p.keliling(2.4));
        System.out.println("");
        //Segitiga Luas
        s.setA(2);
        s.setT(7);
        s.luas();
        System.out.println("Luas Segitiga"+s.luas(2,7));
        System.out.println("");
        //Persegi Panjang Luas
        pp.setP(3);
        pp.setL(5);
        pp.luas();
        System.out.println("Luas Persegi Panjang"+pp.luas(4, 8));
        //Persegi Panjang Keliling
        pp.setP(2);
        pp.setL(4);
        pp.keliling();
        System.out.println("Keliling Persegi Panjang"+pp.luas(2.5,3.5));
        System.out.println("");
        //Lingkaran Luas
        l.setR(2);
        l.luas();
        System.out.println("Luas Lingkaran : "+l.luas(3.5));
        //Lingkaran Keliling
        l.setR(3);
        l.keliling();
        System.out.println("Keliling Lingkaran : "+l.keliling(4.5));
    }
    
}
