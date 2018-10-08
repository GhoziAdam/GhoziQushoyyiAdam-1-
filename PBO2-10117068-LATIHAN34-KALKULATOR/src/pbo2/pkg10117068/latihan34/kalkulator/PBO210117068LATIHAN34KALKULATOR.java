/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan34.kalkulator;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN34KALKULATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
                
        Kalkulator nNilai1 = new Kalkulator();
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukan Angka ke 1 :");
        nNilai1.Value1 = scanner.nextDouble();
        System.out.print("Masukan Angka ke 2 :");
        nNilai1.Value2 = scanner.nextDouble();
        System.out.println("");
        System.out.println("Hasil Pertambahan "+ nNilai1.tambahBilangan());
        System.out.println("Hasil Pengurangan "+ nNilai1.kurangBilangan());
        System.out.println("Hasil Perkalian "+ nNilai1.kaliBilangan());
        System.out.println("Hasil Pembagian "+ nNilai1.bagiBilangan());
        System.out.println("Hasil Sisa "+ nNilai1.sisaBilangan());
    }
    
}
