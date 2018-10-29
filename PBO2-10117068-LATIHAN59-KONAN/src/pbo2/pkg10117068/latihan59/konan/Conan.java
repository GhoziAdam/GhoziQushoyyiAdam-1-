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
public class Conan {
    protected boolean Smart;
    protected String Hobby;
    protected int umur;
            
    public Conan(boolean Smart, String Hobby, int umur){
        this.Smart=Smart;
        this.Hobby=Hobby;
        this.umur=umur;
        }        

    public boolean isSmart(){
        return Smart;
    }
    public String isHobby(){
        return Hobby;
    }
    
    public int isumur(){
    return umur;
    }
}
