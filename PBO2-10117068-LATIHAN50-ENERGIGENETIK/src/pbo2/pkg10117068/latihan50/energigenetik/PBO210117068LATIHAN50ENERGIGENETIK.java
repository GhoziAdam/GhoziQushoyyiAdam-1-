/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan50.energigenetik;

/**
 *
 * @author Ghozi Qushoyyi Adam
 * Nama : Ghozi Qushoyyi Adam
 * Kelas : PBO2 
 * Nim : 10117068
 * Deskripsi Program : program ini menampikan kuatnya massa dan kecepatan pada 
 * bola baseball
 */
public class PBO210117068LATIHAN50ENERGIGENETIK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Energi bola = new Energi();
        bola.setMassa(145);
        bola.setKecepatan(25);
        System.out.println("Sebuah Bola baseball dengan massa = "+ bola.getMassa() + " g");
        System.out.println("Bola baseball tersebut dilempar dengan kecepetan = " + bola.getKecepatan() + 
                "m/a");
        
        double massa = bola.getMassa();
        double kecepatan = bola.getKecepatan();
        
        System.out.println("A. Energi Kinetik = "+ bola.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha Pada Bola = "+ bola.usaha());
        System.out.println("F.S : Nilai usaha tetap karna dimulai dari Keadaan diam");
    }
    
}
