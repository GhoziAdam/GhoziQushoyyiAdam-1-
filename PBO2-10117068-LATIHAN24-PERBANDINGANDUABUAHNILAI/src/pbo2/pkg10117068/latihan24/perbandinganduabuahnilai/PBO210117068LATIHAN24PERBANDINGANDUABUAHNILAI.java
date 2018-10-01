/*
 * NAMA       : Ghozi Qushoyyi Adam
 * KELAS      : IF2
 * MATAKULIAH : PBO2
 * NIM        : 10117068
 * Deskripsi  : menampilkan mengubah dua buah nilai
*/
package pbo2.pkg10117068.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

public class PBO210117068LATIHAN24PERBANDINGANDUABUAHNILAI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Scanner masuk = new Scanner(System.in);
        
        int nNilai, nNilai2, Hasil, i;
        String jawaban, peritah;
        
        boolean ulang = true;
        
        while(ulang == true) {
            System.out.print("masukan Nilai pertama :");
            Scanner scanner = new Scanner (System.in);
            nNilai = scanner.nextInt();
            
            System.out.print("Masukan Nilai Kedua :");
            nNilai2 = scanner.nextInt();
            
            jawaban = (nNilai > nNilai2 ? "besar" : "kecil");
            
            System.out.println("Hasil :" +nNilai + "Lebih" + jawaban + "dari" + nNilai2);
            
            System.out.println("Ulangi Aktifitas ? (Ya/Tidak)  :");
            String perintah = scanner.next();
            
            if (perintah.equalsIgnoreCase("Tidak")) {
                ulang = false;
                System.out.println("Keluar");
                
            } else {
                System.out.print("Masukan Nilai Pertama : ");
                nNilai = scanner.nextInt();
                
                System.out.Print("masukan Nilai Kedua : ");
                nNilai2 = scanner.nextInt();
                
                jawaban = (nNilai > nNilai2 ? "besar" : "kecil");
                
                System.out.println("Hasil :" + nNilai + "Lebih" + jawaban + "dari" + nNilai2);
                
                System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
                perintah = scanner.nextInt():
                
            }
        }
    }
    
}
