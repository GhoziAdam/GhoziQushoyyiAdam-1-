
/*
 * NAMA       : Ghozi Qushoyyi Adam
 * KELAS      : IF2
 * MATAKULIAH : PBO2
 * NIM        : 10117068
 * Deskripsi  : menampilkan ejaan nama
*/
package pbo2.pkg10117068.latihan25.ejaan.nama;

import java.util.Scanner;

public class PBO210117068LATIHAN25EJAANNAMA {

    public static void main(String[] args) {

        String Nama;
        int Panjang;
        char huruf;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nama depan anda untuk di eja : ");
        Nama = scanner.nextLine();
        
        Panjang = Nama.length();
        
        System.out.println("Ejaan untuk "+Nama+" adalah : ");
        
        for (int i = 0; i < Panjang; i++) {
            System.out.println("Huruf ke-" + (i+1) + " : " + Nama.charAt(i));
        }
    }
}
