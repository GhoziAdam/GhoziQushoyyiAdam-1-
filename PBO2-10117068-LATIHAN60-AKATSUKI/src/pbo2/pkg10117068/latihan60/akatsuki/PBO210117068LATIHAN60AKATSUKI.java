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
public class PBO210117068LATIHAN60AKATSUKI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nagato ngt = new Nagato("Rinegan","Menyerap chakra","uzumaki");
        ngt.setName("Nagato Uzumaki");
        ngt.Display();
        System.out.println("Nama Lengkap : "+ ngt.getName());
        System.out.println("");
        
        itachi itc = new itachi("Sharingan","API","uchiha");
        itc.setJulukan("Uchiha Itachi");
        itc.Display();
        System.out.println("Julukan : " + itc.getJulukan());
    }
    
}
