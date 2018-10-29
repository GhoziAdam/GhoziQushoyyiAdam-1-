/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan55.handphone;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN55HANDPHONE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android adr = new Android("Xiaomi","Android","paccophone",3000000);
        adr.setKeyStore("234ibfd3840fo");
        adr.displayProduct();
        System.out.println("Android KeyStore : "+adr.getKeyStore());
        System.out.println("");
        
        Blackberry bb = new Blackberry("Balckberry","BB10","Gemini Curve",2000000);
        bb.setPinBB("BH151TT");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        System.out.println("");
        
        WindowsPhone wp = new WindowsPhone("Microsoft","Windows Phone 10","Lumia 5310",3500000);
        wp.setWpKeyStore("S451LB");
        wp.displayProduct();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore());
        
    }
    }
    

