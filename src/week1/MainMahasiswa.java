/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Mahasiswa mh = new Mahasiswa();
        System.out.println("Masukan Nama : ");
        String nm = in.next();
        mh.setNama(nm);
        System.out.println("Masukan Alamat : ");
        String alm = in.next();
        mh.setAlamat(alm);
        System.out.println("Masukan Umur : ");
        int umr = in.nextInt();
        mh.setUmur(umr);
        System.out.println("Masukan NRP : ");
        int nrp = in.nextInt();
        mh.setNrp(nrp);
        System.out.println(mh.toString());
        System.out.println(mh.getNama()+mh.getNrp());
     
    }
    
}
