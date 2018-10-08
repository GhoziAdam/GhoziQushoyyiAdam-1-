/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Petugas {
    public String namapetugas;
    DaftarNilai dafNilai = new DaftarNilai();
    Scanner scn = new Scanner(System.in);
    
    public void inputpetugas() {
        System.out.println("masukn Nama Petugas : ");
        namapetugas = scn.next();
    }
}
