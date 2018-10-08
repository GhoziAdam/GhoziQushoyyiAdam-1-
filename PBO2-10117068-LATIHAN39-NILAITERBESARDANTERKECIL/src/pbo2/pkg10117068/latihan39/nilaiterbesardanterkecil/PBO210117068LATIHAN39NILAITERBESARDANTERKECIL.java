/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN39NILAITERBESARDANTERKECIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Petugas ptg = new Petugas();
        DaftarNilai dafNilai = new DaftarNilai();
        Scanner scn = new Scanner(System.in);
        
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai====");
        ptg.inputpetugas();
        dafNilai.inputJumlahMhs();
        
        for (int i=0; i<dafNilai.jumlahMhs; i++){
        System.out.print("Masukan Nilai Mahasiswa ke-"+ (i+1) +" = ");
        dafNilai.nilaiMhs[i] = scn.nextInt();
        dafNilai.hitungNilaiTerbesar(i);
        dafNilai.hitungNilaiTerkecil(i);
    }
        System.out.println("\nNilai Terbesar adalah "+dafNilai.nBesar);
        System.out.println("\nNilai Terkecil adalah"+dafNilai.nKecil);
        
        System.out.println("\nPetugas : "+ptg.namapetugas);
    }   
}
