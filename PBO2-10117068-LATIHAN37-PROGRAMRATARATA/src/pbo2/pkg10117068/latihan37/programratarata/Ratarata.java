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
public class Ratarata {
    double Rata2;
    double jmlhNilai = 0;
    
    
    public void hitungNilai(int jmlhMahasiswa) {
        int i;
        double nilai;
        Scanner scn = new Scanner(System.in);
        
        for (i = 1; 1 <= jmlhMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " ");
            nilai = scn.nextDouble();
            jmlhNilai = jmlhNilai + nilai;
        }}
    public double hitungRata2Nilai(double jmlhNilai, int jmlhMahasiswa){
        Rata2 = jmlhNilai / jmlhMahasiswa;
        return Rata2;
    }
}    

