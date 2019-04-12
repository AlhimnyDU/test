/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.asosiasi;

/**
 *
 * @author ASUS
 */
public class Dosen {
    private String idDOsen;
    private String[] nrpMhs;
    private int jmlMhs;

    public Dosen() {
    }

    public Dosen(String idDOsen, String[] nrpMhs, int jmlMhs) {
        this.idDOsen = idDOsen;
        this.nrpMhs = nrpMhs;
        this.jmlMhs = jmlMhs;
    }

    public String getIdDOsen() {
        return idDOsen;
    }

    public void setIdDOsen(String idDOsen) {
        this.idDOsen = idDOsen;
    }

    public String[] getNrpMhs() {
        return nrpMhs;
    }

    public void setNrpMhs(String[] nrpMhs) {
        this.nrpMhs = nrpMhs;
    }

    public int getJmlMhs() {
        return jmlMhs;
    }

    public void setJmlMhs(int jmlMhs) {
        this.jmlMhs = jmlMhs;
    }

    @Override
    public String toString() {
        return "Dosen{" + "idDOsen=" + idDOsen + ", nrpMhs=" + nrpMhs + ", jmlMhs=" + jmlMhs + '}';
    }
    
    
}
