/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.abstrak;

/**
 *
 * @author ASUS
 */
public class Kue extends Komponen{

    @Override
    void bahan() {
        String bahan1 = "Tepung terigu";
        String bahan2 = "Gula";
        String bahan3 = "Telur";
        System.out.println("Bahan - bahan");
        System.out.println("1. "+bahan1);
        System.out.println("2. "+bahan2);
        System.out.println("3. "+bahan3);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void peralatan() {
        String alat1 = "Oven";
        String alat2 = "Mixer";
        String alat3 = "Loyang";
        System.out.println("Alat - alat :");
        System.out.println("1. "+alat1);
        System.out.println("2. "+alat2);
        System.out.println("3. "+alat3);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void proses() {
        System.out.println("Proses Pembuatan :");
        System.out.println("1. Campur bahan menggunakan mixer");
        System.out.println("2. Masukkan pada Loyang");
        System.out.println("3. Panggang didalam oven hingga matang");
        System.out.println("4. Selesai");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
