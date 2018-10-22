/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan48.kalkulator;

/**
 *
 * @author Ghozi Qushoyyi Adam
 * Nama : Ghozi Qushoyyi Adam
 * Kelas : PBO2 
 * Nim : 10117068
 * Deskripsi Program : program ini menampikan sistem perhitungan kakulator 
 */
public class PBO210117068LATIHAN48KALKULATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kalkulator klt = new Kalkulator();
        klt.setValue1(7);
        klt.setValue2(5);
        System.out.println("Value 1 : " + klt.getValue1());
        System.out.println("Value 2 : " + klt.getValue2());
        klt.setNameProject();
        klt.setNotProject(null);
        System.out.println("Result Add is : " + klt.add(klt.getValue1(), klt.getValue2()));
        System.out.println("Result minus is : " + klt.minus(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Multiple is : " + klt.multiplication(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Division is : " + klt.division(klt.getValue1(), klt.getValue2()));
    }
    
}
