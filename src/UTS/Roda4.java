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
public class Roda4 extends SewaKendaraan {
    private String jKendaraan;

    public Roda4() {
    }

    public Roda4(String namaK, int hargaSewa, int uangSewa, int lamaSewa) {
        super(namaK, hargaSewa, uangSewa, lamaSewa);
    }

    public Roda4(String jKendaraan) {
        this.jKendaraan = jKendaraan;
    }

    public String getjKendaraan() {
        return jKendaraan;
    }

    public void setjKendaraan(String jKendaraan) {
        this.jKendaraan = jKendaraan;
    }
    
    @Override
    public void pembayaran(){
        
    }
}
