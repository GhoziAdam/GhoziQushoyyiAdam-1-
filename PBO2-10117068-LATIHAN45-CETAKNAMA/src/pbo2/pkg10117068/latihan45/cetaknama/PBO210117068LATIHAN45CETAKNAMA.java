/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Ghozi Qushoyyi Adam
 * Nama : Ghozi Qushoyyi Adam
 * Kelas : PBO2 
 * Nim : 10117068
 * Deskripsi Program : program ini menampikan aplikasi pencetakan nama
 */
public class PBO210117068LATIHAN45CETAKNAMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner baca = new Scanner(System.in);
        Printer ptr = new Printer();
        System.out.println("=== Aplikasi Pencetak Nama===");
        System.out.print("Masukkan Nama Anda : ");
        ptr.setNama(baca.nextLine());
        System.out.print("Mau Cetak Berapa Kali? : ");
        ptr.setJmlNama(baca.nextInt());
        ptr.cetak(ptr.getNama());
        ptr.cetak(ptr.getJmlNama(), ptr.getNama());
    }
    
}
