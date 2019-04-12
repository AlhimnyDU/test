/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

/**
 *
 * @author ASUS
 */
public class Barang {
    private String kodeBarang;
    private String nama;
    private int harga;

    public Barang() {
    }

    public Barang(String kodeBarang, String nama, int harga) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.harga = harga;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Barang{" + "kodeBarang=" + kodeBarang + ", nama=" + nama + ", harga=" + harga + '}';
    }
    
}
