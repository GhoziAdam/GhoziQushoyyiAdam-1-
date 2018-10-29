/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan61.bangunruang;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN61BANGUNRUANG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bola bl = new bola();
        Tabung tb = new Tabung();
        KERUCUT kr = new KERUCUT();
        
        bl.setR(7);
        System.out.println("1. VOLUME BOLA :");
        System.out.println("    Hasil = %, 12.1f%n "+(double) bl.hitungVolume());
        System.out.println("");
    
        tb.setH(21);
        tb.setR(10);
        System.out.println("2. VOLUME TABUNG : ");
        System.out.println(" Hasil = "  +(int) tb.hitungVolume());
        System.out.println("");
        
        kr.setR(14);
        kr.setT(9);
        System.out.println("3. VOLUME KERUCUT : ");
        System.out.println(" Hasil = "+(int) kr.hitungVolume());
    }
    
}
