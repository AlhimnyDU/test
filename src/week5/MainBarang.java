/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class MainBarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Barang>arrBar = new ArrayList<>();
        arrBar.add(new Barang("1","A",3000));
        arrBar.add(new Barang("2","B",5000));
        arrBar.add(new Barang("3","c",9000));
        
        for(int i=0; i<arrBar.size();i++){
            System.out.println("Kode barang \t: "+arrBar.get(i).getKodeBarang());
            System.out.println("Nama barang \t: "+arrBar.get(i).getNama());
            System.out.println("Harga barang \t: "+arrBar.get(i).getHarga());
            System.out.println("=============================================");
        }
        System.out.println(arrBar);
    }
    
}
