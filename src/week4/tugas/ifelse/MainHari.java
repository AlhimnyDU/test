/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.tugas.ifelse;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainHari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan hari : ");
        String nama_hari = sc.nextLine();
        System.out.println("Jadwal Kuliah Hari "+nama_hari+" : ");
        switch(nama_hari){
            case "senin" :
                System.out.println("KOSONG");
                break;
            case "selasa" :
                System.out.println("OOP");
                System.out.println("PBD");
                break;
            case "rabu" :
                System.out.println("RPL");
                System.out.println("PCD");
                break;
            case "kamis" :
                System.out.println("Inggris");
                break;
            case "jumat" :
                System.out.println("Indonnesia");
                break;
            case "sabtu" :
                System.out.println("Ranlog");
            case "minggu" :
                System.out.println("Libur");
                break;
            default :
                System.out.println("Input salah");
        }
    }
    
}
