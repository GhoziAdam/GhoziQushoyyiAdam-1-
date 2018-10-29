/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan52.siapakamu;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN52SIAPAKAMU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen dsn = new Dosen();
        dsn.setNama("Rizki Adam Kurniawan");
        dsn.setNip("41227829930");
        dsn.setUmur(27);
        dsn.setMataKuliah("PBO");
        System.out.println("NIP DOSEN "+dsn.getNip());
        dsn.siapaKamu();
        dsn.mengajarApa();
        System.out.println("");
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("Ghozi Qushoyyi Adam");
        mhs.setKelas("IF-2");
        mhs.setNim("10117068");
        mhs.setUmur(20);
        System.out.println("NIM MAHASISWA "+mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
    
}
