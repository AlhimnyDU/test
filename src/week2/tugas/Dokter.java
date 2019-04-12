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
public class Dokter {
    private String idDokter;
    private String nama;

    public Dokter() {
    }

    public Dokter(String idDokter, String nama) {
        this.idDokter = idDokter;
        this.nama = nama;
    }

    public String getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Dokter{" + "idDokter=" + idDokter + ", nama=" + nama + '}';
    }
    
}
