/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.tugas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class MainDataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mh = new Mahasiswa("152017130", "Alhimny", "087825351290", "Cileunyi");
        mh.isiArray("001", "Pemogramman Berorientasi Objek", "8");
        mh.isiArray("002", "Pengolahan Citra Digital", "11");

        
        System.out.println("NRP  : " + mh.getNrp());
        System.out.println("Nama : " + mh.getNama());
        System.out.println("No HP: " + mh.getNotlp());
        System.out.println("alamat : " + mh.getAlamat());
        System.out.println("---------------------Jadwal Kuliah " + mh.getNama() + "-------------------");
        mh.lihatArray();
  

    }

}
