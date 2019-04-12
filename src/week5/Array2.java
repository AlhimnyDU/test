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
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String[][] kontak = {
            {"didin","0878"},
            {"al","0878"}
        };*/
        String[][] meja = new String[2][3];
        Scanner sc = new Scanner(System.in);
        for(int bar=0; bar<meja.length;bar++){
            for(int kol=0;kol<meja[bar].length;kol++){
                System.out.println("Siapa yang akan duduk di meja : ");
                meja[bar][kol] = sc.nextLine();
            }
        }
        System.out.println("======================================");
        for(int bar=0; bar<meja.length;bar++){
            for(int kol=0;kol<meja[bar].length;kol++){
                System.out.format("| %s |", meja[bar][kol]);
            }
            System.out.println("");
        }
        
    }
    
}
