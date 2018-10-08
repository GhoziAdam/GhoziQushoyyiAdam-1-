/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan31.perkenalanmahasiswa;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN31PERKENALANMAHASISWA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa nMhs1 = new Mahasiswa();
        nMhs1.nim = "10110269";
        nMhs1.nama = "Rizki Adam Kurniawan";
        
        nMhs1.PerkenalanDiri(nMhs1.nim, nMhs1.nama);
        
        Mahasiswa nMhs2 = new Mahasiswa();
        nMhs2.nim  = "10110270";
        nMhs2.nama = "Indra Tiola";
        
        nMhs2.PerkenalanDiri(nMhs2.nim, nMhs2.nama);
        
        Mahasiswa nMhs3 = new Mahasiswa();
        nMhs3.nim = "10110271";
        nMhs3.nama = "Robi Tanzil Ganefi";
        
        nMhs3.PerkenalanDiri(nMhs3.nim, nMhs3.nama);
        
        Mahasiswa nMhs4 = new Mahasiswa();
        nMhs4.nim = "10110269";
        nMhs4.nama = "Muhammad Nur Awaludin";
        
        nMhs4.PerkenalanDiri(nMhs4.nim, nMhs4.nama);
    }
    
}
