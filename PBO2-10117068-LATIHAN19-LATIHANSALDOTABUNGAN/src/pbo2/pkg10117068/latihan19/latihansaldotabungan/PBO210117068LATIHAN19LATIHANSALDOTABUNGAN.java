/*
 * NAMA       : Ghozi Qushoyyi Adam
 * KELAS      : IF2
 * MATAKULIAH : PBO2
 * NIM        : 10117068
 * Deskripsi  : menampilkan saldo tabungan
*/
package pbo2.pkg10117068.latihan19.latihansaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class PBO210117068LATIHAN19LATIHANSALDOTABUNGAN {

    public static void main(String[] args) {

        int nSaldo, bulan = 0;
        double nBungan;
        nSaldo = 25000000;
        
        DecimalFormat kursIndonesia   = (DecimalFormat) DecimalFormat.getIntegerInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setGroupingSeparator('.');
        
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        while (bulan <= 6) {
            
            nSaldo = (int) (nSaldo + (nSaldo * 0.15));
            System.out.printf("saldo di bulan ke - " + bulan + " Rp. %s \n", kursIndonesia.format(nSaldo) );
            bulan = bulan + 1;
            
        }
            
       
    }

}
