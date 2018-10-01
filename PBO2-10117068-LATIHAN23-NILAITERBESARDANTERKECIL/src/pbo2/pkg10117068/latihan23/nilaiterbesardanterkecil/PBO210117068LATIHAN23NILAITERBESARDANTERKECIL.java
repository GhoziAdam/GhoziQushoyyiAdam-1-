/*
 * NAMA       : Ghozi Qushoyyi Adam
 * KELAS      : IF2
 * MATAKULIAH : PBO2
 * NIM        : 10117068
 * Deskripsi  : menampilkan terbesardanterkecil
*/
package pbo2.pkg10117068.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;
public class PBO210117068LATIHAN23NILAITERBESARDANTERKECIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int nBanyak, nilai[];
        float rata = 0;
        String Nama;
        
        System.out.println("==========Program Nilai Terbesar dan Terkecil Mahasiswa=========");
        System.out.print("Masukan Nama Petugas : ");
        Nama = input.nextLine();
        
        System.out.println("Masukan Banyak Mahasiswa : ");
        nBanyak = input.nextInt();
        
        nilai = new int[nBanyak];
        
        for (int i = 0; i <= nBanyak - 1; i++){
            System.out.print("Masukam Nilai Mahasiswa ke - " +(i + 1)+" :");
            nilai[i] = input.nextInt();
            
        int max = 0;
        for (int val : nilai){
            if (max < val){
                max = val;
            }
        }
            
           
            
        }
    }
    
}
