/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan60.akatsuki;

/**
 *
 * @author user
 */
public class Akatsuki {
    protected String Kekuatan;
    protected String JurusAndalan;
    protected String clan;
    
    public Akatsuki(String Kekuatan, String Juran, String clan){
        this.Kekuatan=Kekuatan;
        this.JurusAndalan= Juran;
        this.clan = clan;
    }
    public void Display(){
        System.out.println("Kekuatan : " +Kekuatan);
        System.out.println("Jurus Andalan : "+JurusAndalan);
        System.out.println("clan : " + clan);
    }   
}
