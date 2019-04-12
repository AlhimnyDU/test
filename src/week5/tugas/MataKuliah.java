/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.tugas;

/**
 *
 * @author ASUS
 */
public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private String jam;

    public MataKuliah() {
    }

    public MataKuliah(String kodeMK, String namaMK, String jam) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.jam = jam;
    }

    public String getKodeMK() {
        return kodeMK;
    }

    public void setKodeMK(String kodeMK) {
        this.kodeMK = kodeMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public void setNamaMK(String namaMK) {
        this.namaMK = namaMK;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "MataKuliah{" + "kodeMK=" + kodeMK + ", namaMK=" + namaMK + ", jam=" + jam + '}';
    }
    
}
