/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan37.programratarata;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN37PROGRAMRATARATA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int jmlhMahasiswa;
        Scanner scn = new Scanner(System.in);
        Ratarata rata = new Ratarata();
        
        System.out.println("Masukan Banyaknya Mahasiswa : ");
        jmlhMahasiswa = scn.nextInt();
        rata.hitungNilai(jmlhMahasiswa);
        double jmlhNilai;
        System.out.println("Rata Rata Nilainya adalah : "
                + rata.hitungRata2Nilai(rata.jmlhNilai, jmlhMahasiswa));
        
    }
    
}
