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
public class Rumahsakit {
    private String nama;
    private Dokter dkr;
    private Suster str;
    private Pasien psn;

    public Rumahsakit(String nama, Dokter dkr, Suster str, Pasien psn) {
        this.nama = nama;
        this.dkr = dkr;
        this.str = str;
        this.psn = psn;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Dokter getDkr() {
        return dkr;
    }

    public void setDkr(Dokter dkr) {
        this.dkr = dkr;
    }

    public Suster getStr() {
        return str;
    }

    public void setStr(Suster str) {
        this.str = str;
    }

    public Pasien getPsn() {
        return psn;
    }

    public void setPsn(Pasien psn) {
        this.psn = psn;
    }

    @Override
    public String toString() {
        return "Rumahsakit{" + "nama=" + nama + ", dkr=" + dkr + ", str=" + str + ", psn=" + psn + '}';
    }
    
    
}
