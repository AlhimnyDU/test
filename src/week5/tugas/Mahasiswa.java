/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.tugas;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    private String nrp;
    private String nama;
    private String notlp;
    private String alamat;
    ArrayList<MataKuliah> arrMk = new ArrayList<>();

    public Mahasiswa() {
    }

    public Mahasiswa(String nrp, String nama, String notlp, String alamat) {
        this.nrp = nrp;
        this.nama = nama;
        this.notlp = notlp;
        this.alamat = alamat;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNotlp() {
        return notlp;
    }

    public void setNotlp(String notlp) {
        this.notlp = notlp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public ArrayList<MataKuliah> getArrMk() {
        return arrMk;
    }

    public void setArrMk(ArrayList<MataKuliah> arrMk) {
        this.arrMk = arrMk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nrp=" + nrp + ", nama=" + nama + ", notlp=" + notlp + ", alamat=" + alamat + ", arrMk=" + arrMk + '}';
    }
    
    public void isiArray(String kodeMK, String namaMK, String jam){
        arrMk.add(new MataKuliah(kodeMK,namaMK,jam));   
    }
    
    void lihatArray(){
        int i = 1;
        for(MataKuliah mk:arrMk){
            System.out.println("Jadwal Mata Kuliah ke-"+i+" "+mk.getNamaMK());
            System.out.println("Kode Mata Kuliah "+mk.getNamaMK()+" = "+mk.getKodeMK());
            System.out.println("Jadwal Kuliah Jam "+mk.getJam());
            System.out.println("");
            i++;
        }
    }
}
