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
public class Suster {
    private String idSuster;
    private String nama;

    public Suster() {
    }

    public Suster(String idSuster, String nama) {
        this.idSuster = idSuster;
        this.nama = nama;
    }

    public String getIdSuster() {
        return idSuster;
    }

    public void setIdSuster(String idSuster) {
        this.idSuster = idSuster;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Suster{" + "idSuster=" + idSuster + ", nama=" + nama + '}';
    }
    
}
