/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan59.konan;

/**
 *
 * @author user
 */
public class Detektif extends Conan {
    private String ketua;
    private String name;

    public Detektif(String name,boolean Smart, String Hobby, int umur,String ketua) {
        super(Smart, Hobby, umur);
        this.name = name;
        this.Smart = Smart;
        this.Hobby = Hobby;
        this.umur = umur;
        this.ketua = ketua;
        }

    public String getKetua() {
        return ketua;
    }

    public String getName() {
        return name;
    }
    
}
