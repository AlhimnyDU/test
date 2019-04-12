/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

import sun.security.x509.RDN;

/**
 *
 * @author ASUS
 */
public class SewaKendaraan {
    private String namaK;
    private int hargaSewa;
    private int uangSewa;
    private int lamaSewa;

    public SewaKendaraan() {
    }

    public SewaKendaraan(String namaK, int hargaSewa, int uangSewa, int lamaSewa) {
        this.namaK = namaK;
        this.hargaSewa = hargaSewa;
        this.uangSewa = uangSewa;
        this.lamaSewa = lamaSewa;
    }

    public String getNamaK() {
        return namaK;
    }

    public void setNamaK(String namaK) {
        this.namaK = namaK;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public int getUangSewa() {
        return uangSewa;
    }

    public void setUangSewa(int uangSewa) {
        this.uangSewa = uangSewa;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    
   public void pembayaran(){
        System.out.println("=====================================");
        System.out.println("Struk");
        System.out.println("=====================================");
        System.out.println("Jenis kendaraan = "+ namaK);
        int total = hargaSewa * lamaSewa;
        System.out.println("Lama sewa = "+lamaSewa+" hari");
        System.out.println("Total harga sewa = "+total);
        System.out.println("Uang Bayar = "+uangSewa);
        int kembalian = uangSewa - total;
        System.out.println("Kembalian = "+kembalian);
   }

  
    
}
