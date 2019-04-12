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
public class MainIPK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float avg, ip1, ip2, ip3, ip4, ip5, ip6, ip7, ip8;
        Scanner sc = new Scanner(System.in);
        System.out.println("IP 1 = ");
        ip1 = sc.nextFloat();
        System.out.println("IP 2 = ");
        ip2 = sc.nextFloat();
        System.out.println("IP 3 = ");
        ip3 = sc.nextFloat();
        System.out.println("IP 4 = ");
        ip4 = sc.nextFloat();
        System.out.println("IP 5 = ");
        ip5 = sc.nextFloat();
        System.out.println("IP 6 = ");
        ip6 = sc.nextFloat();
        System.out.println("IP 7 = ");
        ip7 = sc.nextFloat();
        System.out.println("IP 8 = ");
        ip8 = sc.nextFloat();
        
        avg = (ip1+ip2+ip3+ip4+ip5+ip6+ip7+ip8)/8;
        System.out.println("IPK = "+avg);
        if (avg>=3.80){
            System.out.println("Summa Cum Laude");
        }else {
            if ((avg>=3.60)&&(avg<=3.79)){
                System.out.println("Magna Cum Laude");
            }else{
                if ((avg>=3.40)&&(avg<=3.59)){
                    System.out.println("Cum Laude");
                }else{
                   if ((avg>=3.20)&&(avg<=3.39)){
                       System.out.println("High Merit");
                   }else{
                       if((avg>=3.00)&&(avg<=3.)){
                           System.out.println("Merit");
                       }else{
                           System.out.println("Cukup");
                       }
                   }
                }
            }
        }
                
        
    }
    
}
