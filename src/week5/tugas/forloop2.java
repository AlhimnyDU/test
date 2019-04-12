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
public class forloop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=1;
        for(int i=0;i<4;i++){
            for(int j= 0; j<=i;j++){
                System.out.print(a + " ");
                a++;
            }
            System.out.println("");
        }
    }
    
}
