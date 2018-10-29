/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan53.rabbit;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN53RABBIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rbt = new Rabbit("Peter",false,"Grass",4,"grey");
        System.out.println("Hello, his name is "+rbt.getName());
        System.out.println(rbt.getName()+" is Vegetarian? "+rbt.isVegetarian());
        System.out.println(rbt.getName()+" eats "+rbt.getEats());
        System.out.println(rbt.getName()+" has "+rbt.getNoOfLegs()+" legs");
        System.out.println(rbt.getName()+" color is "+rbt.getColor());
    }
    
}
