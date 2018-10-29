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
public class PBO210117068LATIHAN59KONAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Detektif cnn = new Detektif("Conan Edogawa",false,"Sepak bola",7,"Detektif cilik");
        System.out.println("Hello My Name is "+ cnn.getName());
        System.out.println(cnn.getName()+" is he Smart? "+ cnn.isSmart());
        System.out.println(cnn.getName()+" Hobby "+ cnn.isHobby());
        System.out.println(cnn.getName()+" Yars old "+ cnn.isumur());
        System.out.println(cnn.getName()+" dia menjadi "+ cnn.getKetua());
    }
    
}
