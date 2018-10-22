/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Ghozi Qushoyyi Adam
 * Nama : Ghozi Qushoyyi Adam
 * Kelas : PBO2 
 * Nim : 10117068
 * Deskripsi Program : program ini menampilkan kepribadian kita
 */
public class PBO210117068LATIHAN46TANDANYAKAMU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner scanner = new Scanner(System.in);
        Age age = new Age(2018);
        
        
        System.out.println("Masukan Tahun Lahir Anda :");
        age.setYearBirth(scanner.nextInt());
        System.out.println("===Hasil Perhitungan");
        System.out.println("Masukan Tahun Anda Lahir :"+ age.getYearBirth());
        System.out.println("Hari ini Tahun :"+ age.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah "+ age.hitungUmur());
        age.TandanyaKamu(age.hitungUmur());
    }
    
}
