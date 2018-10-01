/*
 * NAMA       : Ghozi Qushoyyi Adam
 * KELAS      : IF2
 * MATAKULIAH : PBO2
 * NIM        : 10117068
 * Deskripsi  : menampilkan program perhitungan lingkaran
*/
package pbo2.pkg10117068.latihan22.programperhitunganlingkaran;

import java.util.Scanner;
import java.text.DecimalFormat;
public class PBO210117068LATIHAN22PROGRAMPERHITUNGANLINGKARAN {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        double PHI = 3.14159265358979323846;
        double nKeliling, nDiameter = 0, nJarijari, nLuas;
        
        do{
            System.out.println("Masukan nilai Diamer Lingkaran :");
            try {
                nDiameter = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Nilai Diameter tidak sesuai");
                scanner.nextLine();
            }
        } while (nDiameter ==0);
        
        nJarijari = nDiameter / 2;
        nLuas = (float) (PHI * (nJarijari * nJarijari));
        nKeliling = (PHI * nDiameter);
        
        DecimalFormat DF = new DecimalFormat("#.##");
        System.out.printf("Jari-Jari Lingkaran \t= %s%n", DF.format(nJarijari));
        System.out.printf("Luas Lingkaran \t\t= %s%n", DF.format(nLuas));
        System.out.printf("Keliling Lingkaran \t= %s%n", DF.format(nKeliling));
        
    }
    
}
