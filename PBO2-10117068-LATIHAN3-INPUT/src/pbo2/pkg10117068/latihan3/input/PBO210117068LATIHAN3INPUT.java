/*
 * NAMA       : Ghozi Qushoyyi Adam
 * KELAS      : IF2
 * MATAKULIAH : PBO2
 * NIM        : 10117068
 * DESKRIPSI PROGRES : Program ini menampilkan program input 
 */
package pbo2.pkg10117068.latihan3.input;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN3INPUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.print("Masukkan nama anda");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.print("Nama anda adalah :"+nama);
        
    }
    
}
