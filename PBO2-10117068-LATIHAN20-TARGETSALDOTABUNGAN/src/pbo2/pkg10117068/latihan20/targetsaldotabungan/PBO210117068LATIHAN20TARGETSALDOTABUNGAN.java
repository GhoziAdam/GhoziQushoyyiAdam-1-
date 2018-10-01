/*
 * NAMA       : Ghozi Qushoyyi Adam
 * KELAS      : IF2
 * MATAKULIAH : PBO2
 * NIM        : 10117068
 * Deskripsi  : menampilkan target saldo tabungan
*/
package pbo2.pkg10117068.latihan20.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class PBO210117068LATIHAN20TARGETSALDOTABUNGAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            
            int nSaldo, nBungan, bulan;
            
            nSaldo = 3500000;
            bulan = 1;
            
            DecimalFormat kursIndonesia =(DecimalFormat) DecimalFormat.getIntegerInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            
            formatRp.setGroupingSeparator('.');
            
            kursIndonesia.setDecimalFormatSymbols(formatRp);
            
            while (nSaldo <= 6000000) {
                
                nSaldo = (int) ((nSaldo * 0.08) + nSaldo);
                System.out.printf("Saldo di bulan ke-" + " Rp. %s \n", kursIndonesia.format(nSaldo));
                bulan = bulan + 1;
            }
        
    }
    
}
