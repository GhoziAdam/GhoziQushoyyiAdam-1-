/*
 * NAMA       : Ghozi Qushoyyi Adam
 * KELAS      : IF2
 * MATAKULIAH : PBO2
 * NIM        : 10117068
 * Deskripsi  : menampilkan Ganti Kata
*/
package pbo2.pkg10117068.latihan68.ganti.kata;

import java.util.Scanner;

public class PBO210117068LATIHAN28GANTIKATA {

    public static void main(String[] args) {

        String Kalimat;
        String nGanti,nJadi;

        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata : ");
        nGanti = scanner.nextLine();
        
        System.out.print("Menjadi Kata : ");
        nJadi = scanner.nextLine();
                      
        String ganti = Kalimat.replace(nGanti,nJadi);
        System.out.println("ADALAH : "+ganti);        
    }

}
