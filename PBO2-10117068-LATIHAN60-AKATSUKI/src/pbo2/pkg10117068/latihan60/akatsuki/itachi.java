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
public class itachi extends Akatsuki {
    private String Julukan;
    
     public itachi(String Kekuatan, String Juran, String clan){
      super(Kekuatan,Juran,clan);  
        this.Kekuatan=Kekuatan;
        this.JurusAndalan= Juran;
        this.clan = clan;
}

    public String getJulukan() {
        return Julukan;
    }

    public void setJulukan(String Julukan) {
        this.Julukan = Julukan;
    }
     
}
