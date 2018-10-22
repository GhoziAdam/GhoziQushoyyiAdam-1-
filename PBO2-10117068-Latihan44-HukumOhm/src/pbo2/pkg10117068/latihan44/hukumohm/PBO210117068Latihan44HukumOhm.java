/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan44.hukumohm;

/**
 *
 * @author Ghozi Qushoyyi Adam
 * Nama : Ghozi Qushoyyi Adam
 * Kelas : PBO2 
 * Nim : 10117068
 * Deskripsi Program : program ini menampilkan sistem perhitungan tegangan pada batrai 
 */
public class PBO210117068Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai btr = new Baterai(3,12);
        System.out.println("Kuat Arus : "+btr.getKuatArus()+ " ampere");
        System.out.println("Hambatan : "+btr.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan : "+btr.hitungTegangan()+" volt");
    }
    
}
