/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan36.targetsaldobulanan;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN36TARGETSALDOBULANAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo = 350000;
        double bunga = 0.08;
        double bulan = 0;
        Targetsaldo tst = new Targetsaldo();
        tst.hitungSaldoTabungan(saldo, bulan, bunga);
    }
    
}
