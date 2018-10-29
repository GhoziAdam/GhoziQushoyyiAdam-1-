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
public abstract class LivingThing {
    public abstract void walk (String nama);
    public void Breath(String nama){
        System.out.println(nama +" Bernafas ");
    }
    public void eat(String nama){
        System.out.println(nama + " Makan ");
    }
}
