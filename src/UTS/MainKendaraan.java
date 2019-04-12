/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainKendaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SewaKendaraan sk = new SewaKendaraan();
        Roda2 rd2 = new Roda2();
        Roda4 rd4 = new Roda4();
        int i,a,b = 0,c = 0;
        String namaK = null;
        System.out.println("Pilih Kendaraan Roda 4");
        System.out.println("1. Ferari");
        System.out.println("2. Avanza");
        System.out.println("3. Sedan");
        System.out.println("Pilih Kendaraan Roda 2");
        System.out.println("4. Honda Vario");
        System.out.println("5. Hoda Beat");
        System.out.println("6. Aerox");
        System.out.println("Masukan angka kendaraan diatas");
        i = sc.nextInt();
        System.out.println("Lama sewa");
        a = sc.nextInt();
        System.out.println("Jumlah Bayar Pelanggan");
        c = sc.nextInt();
        switch(i){
            case 1:
                namaK = "Ferari";
                b = 100000;
            break;
            case 2:
                namaK = "Avanza";
                b = 100000;
            break;
            case 3:
                namaK = "Sedan";
                b = 100000;
            break;
            case 4 :
                namaK = "Honda Vario";
                b = 50000;
            break;
            case 5:
                namaK = "Honda Beat";
                b = 50000;
            break;
            case 6:
                namaK = "Aerox";
                b = 50000;
            break;
        }
        
        sk.setNamaK(namaK);
        sk.setHargaSewa(b);
        sk.setLamaSewa(a);
        sk.setUangSewa(c);
        sk.pembayaran();

    }
    
}
