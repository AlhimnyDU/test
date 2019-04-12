/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5.tugas;

/**
 *
 * @author ASUS
 */
public class loopPiramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=5;i>=0;i--){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<(i*2);k++){
                    System.out.print(k);
                }
            System.out.println("");
         
        }
    }
    
}
