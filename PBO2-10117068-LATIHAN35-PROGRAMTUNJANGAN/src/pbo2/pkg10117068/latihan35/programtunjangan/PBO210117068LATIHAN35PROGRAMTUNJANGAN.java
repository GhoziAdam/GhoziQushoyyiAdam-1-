/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan35.programtunjangan;

import java.util.Scanner;
public class PBO210117068LATIHAN35PROGRAMTUNJANGAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gajiPokok;
        String status;
        
        Scanner scanner = new Scanner(System.in);
        
        Tunjangan tjn = new Tunjangan();
        
        System.out.println("===Program Tunjangan===");
        System.out.println("Berapa Gaji Pokok Anda Sebulan? : Rp. " );
        gajiPokok = scanner.nextDouble();
        
        System.out.println("Status Anda? (Menikah/Belum) ? : ");
        status = scanner.next();
        System.out.println("");
        
        tjn.hitungTunjangan(gajiPokok, status);
        System.out.println("Developed by : Ghozi Qushoyyi Adam");
    }
    
}
