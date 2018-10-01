/*
 * NAMA       : Ghozi Qushoyyi Adam
 * KELAS      : IF2
 * MATAKULIAH : PBO2
 * NIM        : 10117068
 * Deskripsi  : menampilkan rata rata nilai
*/
package pbo2.pkg10117068.latihan21.rataratanilai;

import java.util.Scanner;

public class PBO210117068LATIHAN21RATARATANILAI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner input = new Scanner(System.in);
       int nBanyak, jml, nilai[];
       float rata, jumlah = 0;
       
        System.out.println("Masukan Jumlah Mahasiswa  : ");
        nBanyak = input.nextInt();
        
        nilai = new int[nBanyak];
        
        for (int i = 0; i <= nBanyak - 1; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i + 1)+ " : ");
            nilai[i] = input.nextInt();
        }
        for (int j = 0; j <= nBanyak -1; j++) {
            jumlah = jumlah + nilai[j];
        }
    
        rata = jumlah / nBanyak;
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " + rata);
        System.out.println("Developed by : Ghozi Qushoyyi Adam");
    }
    
}
