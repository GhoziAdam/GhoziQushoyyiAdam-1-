/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan45.cetaknama;

/**
 *
 * @author user
 */
public class Printer {
    
    private int jmlNama;
    private String nama;

    public int getJmlNama() {
        return jmlNama;
    }

    public void setJmlNama(int jmlNama) {
        this.jmlNama = jmlNama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak (String nama){
        System.out.println("Nama Anda: " + nama);
    }
    public void cetak (int jmlnama, String nama){
        System.out.println("Hasil Cetak : ");
        for(int i=1; i<=jmlnama;i++){
            System.out.println(i+" . " + nama);
        }
    }
}
