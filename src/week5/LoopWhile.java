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
public class LoopWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean running= true;
        int counter = 0;
        String jawab;
        
        Scanner scan = new Scanner(System.in);
        while(running){
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [ya/tidak]> ");
            jawab = scan.nextLine();
            
            if(jawab.equalsIgnoreCase("ya")){
                running = false;
            }
            counter++;
        }
        System.out.println("Anda sudah melakukan perulangan sebanyak "+counter+" kali");
    }
    
}
