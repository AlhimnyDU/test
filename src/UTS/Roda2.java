/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author ASUS
 */
public class Roda2 extends SewaKendaraan{
    private String jKendaraan;

    public Roda2() {
    }

    public Roda2(String jKendaraan) {
        this.jKendaraan = jKendaraan;
    }

    public Roda2(String namaK, int hargaSewa, int uangSewa, int lamaSewa) {
        super(namaK, hargaSewa, uangSewa, lamaSewa);
    }


    public String getjKendaraan() {
        return jKendaraan;
    }

    public void setjKendaraan(String jKendaraan) {
        this.jKendaraan = jKendaraan;
    }

    
    
    @Override
    public void pembayaran(){
        System.out.println(jKendaraan+" dengan sewa "+super.getHargaSewa());
        System.out.println("Lama sewa"+super.getLamaSewa());
        int total = super.getHargaSewa()*super.getLamaSewa();
        System.out.println("Total harga sewa = "+total);
    }
    

   
    
}
