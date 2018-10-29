/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan62.livingthing;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN62LIVINGTHING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human hum = new Human() ;
        hum.setNama(" Rizky Adam Kurniawan ");
        
        hum.walk(hum.getNama());
        hum.Breath(hum.getNama());
        hum.eat(hum.getNama());
    }
    
}
