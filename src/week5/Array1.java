/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class Array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String[] buah = {"Apel", "Nanas"};
        String[] buah = new String[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i<buah.length;i++){
            System.out.println("Buah ke-"+i+": ");
            buah[i] = scan.nextLine();
        }
        System.out.println("------------------------------------------------");
        for(int j =0;j<buah.length;j++){
            System.out.println(buah[j]);
        }
         /* for(String b : buah){
            System.out.println(b);
        }*/
        //buah[0] = "Apel";
        //buah[1] = "Mangga";

    }
    
}
