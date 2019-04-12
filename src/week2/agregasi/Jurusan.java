/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.agregasi;

/**
 *
 * @author ASUS
 */
public class Jurusan {
    private String kdJurusan;
    private String namaJurusan;
    private Mahasiswa mhs;

    public Jurusan() {
    }

    public Jurusan(String kdJurusan, String namaJurusan, Mahasiswa mhs) {
        this.kdJurusan = kdJurusan;
        this.namaJurusan = namaJurusan;
        this.mhs = mhs;
    }

    public String getKdJurusan() {
        return kdJurusan;
    }

    public void setKdJurusan(String kdJurusan) {
        this.kdJurusan = kdJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public Mahasiswa getMhs() {
        return mhs;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mhs = mhs;
    }

    @Override
    public String toString() {
        return "Jurusan{" + "kdJurusan=" + kdJurusan + ", namaJurusan=" + namaJurusan + ", mhs=" + mhs + '}';
    }
    
}
