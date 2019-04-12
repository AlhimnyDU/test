/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author ASUS
 */
public class Person {
    
    private String nama;
    private String address;
    private String nhp;
    private int age;

    public Person() {
    }

    public Person(String nama, String address, String nhp, int age) {
        this.nama = nama;
        this.address = address;
        this.nhp = nhp;
        this.age = age;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNhp() {
        return nhp;
    }

    public void setNhp(String nhp) {
        this.nhp = nhp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "nama=" + nama + ", address=" + address + ", nhp=" + nhp + ", age=" + age + '}';
    }
    
    
    
}
