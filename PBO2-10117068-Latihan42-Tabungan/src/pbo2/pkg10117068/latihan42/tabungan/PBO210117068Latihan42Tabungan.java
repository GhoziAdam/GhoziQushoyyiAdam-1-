/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan42.tabungan;

import java.util.Scanner;


public class PBO210117068Latihan42Tabungan {

    /**
 *
 * @author Ghozi Qushoyyi Adam
 * Nama : Ghozi Qushoyyi Adam
 * Kelas : PBO2 
 * Nim : 10117068
 * Deskripsi Program : program ini menampilkan sistem tabungan
 */
    public static void main(String[] args) {
        int jumlah;
        // TODO code application logic here
        Scanner baca = new Scanner(System.in);
        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukan saldo Awal : ");
        Tabungan tbg = new Tabungan(baca.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = baca.nextInt();
        System.out.println("Saldo anda sekarang : "+tbg.ambilUang(jumlah));
          
    }
    
}
