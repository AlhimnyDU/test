/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.branching;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MainIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // = > ==
        //<> > !=
        //or > ||
        //not > !
        int nilai;
        Scanner scan = new Scanner(System.in);
        String pesan, jumlah;
        
        nilai = scan.nextInt();
        if(nilai>2){
            jumlah = ("Lebih besar dari 2");
            if(nilai%2==0){
                pesan = ("Bilangan genap");
            }else{
                pesan = ("Bilangan ganjil");
            }
            System.out.println(jumlah+" dan "+pesan);
        }else{
            jumlah = "Lebih kecil dari 2";
            System.out.println(jumlah);
        }
    }
    
}
