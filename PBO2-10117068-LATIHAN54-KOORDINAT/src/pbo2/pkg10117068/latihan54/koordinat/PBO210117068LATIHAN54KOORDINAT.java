/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan54.koordinat;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN54KOORDINAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WarnaKoordinat kordinat = new WarnaKoordinat(0,0,"");
        kordinat.setNamaWarna("Jingga");
        kordinat.setX(10);
        kordinat.setY(4);
        System.out.println("Warna Koordinat "+kordinat.getNamaWarna());
        System.out.println("Kordinat Sumbu x : "+kordinat.getX()+", y : "+kordinat.getY());
        
    
    }
    
}
