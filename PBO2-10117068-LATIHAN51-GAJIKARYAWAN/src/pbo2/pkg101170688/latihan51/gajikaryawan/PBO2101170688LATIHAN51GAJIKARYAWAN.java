/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg101170688.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PBO2101170688LATIHAN51GAJIKARYAWAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner baca = new Scanner(System.in);
        Manager mng1 = new Manager();
        System.out.println("=== Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan Nik : ");
        mng1.setNik(baca.nextLine());
        System.out.print("Masukkan Nama : ");
        mng1.setNama(baca.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");
        mng1.setGolongan(baca.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");
        mng1.setJabatan(baca.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        mng1.setKehadiran(baca.nextInt());
        System.out.println("");
        
        System.out.println("===Hasil Perhitungan===");
        System.out.println("NIK : "+mng1.getNik());
        System.out.println("Nama : "+mng1.getNama());
        System.out.println("Golongan : "+mng1.getGolongan());
        System.out.println("Jabatan : "+mng1.getJabatan());
        System.out.println("");
        
        System.out.println("TUNJANGAN GOLONGAN : "+mng1.tunjanganGolongan(mng1.getGolongan()));
        System.out.println("TUNJANGAN JABATAN : "+mng1.tunjanganJabatan(mng1.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN : "+mng1.tunjanganKehadiran(mng1.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL "+mng1.totalGaji());
    }
    }
    

