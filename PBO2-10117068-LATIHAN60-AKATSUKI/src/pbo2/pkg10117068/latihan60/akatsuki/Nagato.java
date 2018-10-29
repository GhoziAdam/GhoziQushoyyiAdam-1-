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
public class Nagato extends Akatsuki {
 private String name;
 
  public Nagato(String Kekuatan, String Juran, String clan){
      super(Kekuatan,Juran,clan);  
        this.Kekuatan=Kekuatan;
        this.JurusAndalan= Juran;
        this.clan = clan;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
  
}

