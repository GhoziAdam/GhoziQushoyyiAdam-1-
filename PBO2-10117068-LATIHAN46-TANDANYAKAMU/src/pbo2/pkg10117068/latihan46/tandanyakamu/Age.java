/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan46.tandanyakamu;

/**
 *
 * @author user
 */
public class Age {
    
    private int yearBirth;
    private int yearNow;
    private String red = "\u001B[31m";
    
    public Age (int yearNow){
        this.yearNow = yearNow;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow() {
        return yearNow;
    }

    public String getRed() {
        return red;
    }
    
    public int hitungUmur(){
        return yearNow - yearBirth;
    }
    
    public String TandanyaKamu(int umur) {
        if (umur >= 0 && umur <= 5){
            System.out.println(" Tandanya Kamu " + red + " Lagi Lucu Lucunya ");
        }else if (umur >= 5 && umur <= 10){
            System.out.println(" Tandanya Kamu "+ red + " Masih Anak Anak ");
        }else if (umur >= 10 && umur <= 13){
            System.out.println(" Tandanya Kamu "+ red + " Masih Remadja ");
        }else if (umur >= 13 && umur <= 19){
            System.out.println(" Tandanya Kamu "+ red + " Alay ");
        }else if (umur >= 19 && umur <= 29){
            System.out.println(" Tandanya Kamu "+ red + " Lagi Galau Nyari Jodoh ");
        }else if (umur >= 29 && umur <= 35){
            System.out.println(" Tandanya Kamu " + red + " Lagi Sibuk Nyari Uang ");
        }else if (umur >= 35 && umur <= 150){
            System.out.println(" Tandanya Kamu "+ red + " Sudah Tua ");
        }else if (umur >=150){
            System.out.println(" Tandanya Kamu "+ red + " Tidak Terdefinisi");
        }
        return red;
    }
    
}
