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
public class Targetsaldo {

public void hitungSaldoTabungan(int saldo, double bulan, double bunga ){
    int i;
    for ( i= 1; saldo <= 6000000; i++){
        bulan = bunga * saldo;
        saldo = (int) (saldo + bulan);
        System.out.println("Saldo di bulan ke-" + i + "Rp." + saldo);
}    
}
}