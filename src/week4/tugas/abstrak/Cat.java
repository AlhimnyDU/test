/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.tugas.abstrak;

/**
 *
 * @author ASUS
 */
public class Cat extends Binatang{
    private String nama;
    private String breed;
    private int umur;

    public Cat() {
    }

    public Cat(String nama, String breed, int umur) {
        this.nama = nama;
        this.breed = breed;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Cat{" + "nama=" + nama + ", breed=" + breed + ", umur=" + umur + '}';
    }
    
    @Override
    void suara() {
        System.out.println("Meong..Meong..Meong..");
    }
    
}
