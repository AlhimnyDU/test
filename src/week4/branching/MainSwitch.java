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
public class MainSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Input warna lampu : ");
        lampu = scan.nextLine();
        
        switch(lampu){
            case "merah" : 
                System.out.println("Lampu merah, Berhenti");
                break;
            case "kuning" :
                System.out.println("Lampu kuning, harap hati-hati");
                break;
            case "hijau"  :
                System.out.println("Lampu hijau, silahkan jalan");
                break;
            default:
                System.out.println("Input salah");
        }
    }
    
}
