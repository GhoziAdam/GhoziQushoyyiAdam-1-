/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan38.perhitunganlingkaran;

import java.util.Scanner;

public class PBO210117068LATIHAN38PERHITUNGANLINGKARAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String diameter;
        double d;
        Scanner scn = new Scanner(System.in);
        Lingkaran clc = new Lingkaran();
        
        System.out.println("==Perhitungan Lingkaran==");
        do {
            System.out.println("Masukan Nilai diameter Lingkaran : ");
            diameter = scn.nextLine();
            System.out.print((!diameter.matches("[0-9]*")) ? "Nilai Diameter sesuai\n" : "");
        }while (!diameter.matches("[0-9]*"));
        System.out.println("===Hasil Perhitungan Lingkaran===");
        d = Double.parseDouble(diameter);
        
        System.out.printf("Jari-jari Lingkaran\t = %.0f cm %n",
                clc.jari2Lingkaran(d));
        System.out.printf("Luas Lingkaran/t = %.2f cm %n",
                clc.luas2Lingkaran(clc.jari2Lingkaran(d)));
        System.out.printf("Keliling Lingkaran\t = %.2f cm %n",
                clc.KelilingLingkaran(clc.jari2Lingkaran(d)));
    }
    
}
