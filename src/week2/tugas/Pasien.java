/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.tugas;

/**
 *
 * @author ASUS
 */
public class Pasien {
    private String nik;
    private String nama;
    private Suster str;

    public Pasien() {
    }

    public Pasien(String nik, String nama, Suster str) {
        this.nik = nik;
        this.nama = nama;
        this.str = str;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Suster getStr() {
        return str;
    }

    public void setStr(Suster str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Pasien{" + "nik=" + nik + ", nama=" + nama + ", str=" + str + '}';
    }
    
    
}
    
