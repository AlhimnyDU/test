/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3.tugas;

/**
 *
 * @author ASUS
 */
public class BangunDatar {
    private int p;
    private int l;
    private int t;
    private int a;
    private int r;

    public BangunDatar() {
    }

    public BangunDatar(int p, int l, int t, int a, int r) {
        this.p = p;
        this.l = l;
        this.t = t;
        this.a = a;
        this.r = r;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
    public void luas(){
        System.out.println("Luas Bangun Datar");
    }
    public void keliling(){
        System.out.println("Keliling Bangun Datar");
    }
    
}
