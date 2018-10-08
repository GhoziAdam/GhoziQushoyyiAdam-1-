/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan33.userlogin;

import java.util.Scanner;


public class PBO210117068LATIHAN33USERLOGIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User lgn = new User ();
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukan USername: ");
        String usr = scn.next();
        System.out.println("Masukan Password: ");
        String psw = scn.next();
        System.out.println("");
        
        lgn.pengechekanLogin(usr, psw);
        
    }
    
}
