/*
 * NAMA       : Ghozi Qushoyyi Adam
 * KELAS      : IF2
 * MATAKULIAH : PBO2
 * NIM        : 10117068
 * Deskripsi  : menampilkan huruf besar dan kecil
*/
package pbo2.pkg10117068.latihan27.huruf.besar.kecil;

import java.util.Scanner;

public class PBO210117068LATIHAN27HURUFBESARKECIL {

    public static void main(String[] args) {

        String Kalimat;

        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();

        String Besar = Kalimat.toUpperCase();
        String Kecil = Kalimat.toLowerCase();
        System.out.println();
        System.out.println("====Hasil Formating====");
        System.out.println("Huruf besar = " + Besar);
        System.out.println("Huruf kecil = " + Kecil);
    }

}
