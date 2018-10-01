/*
NAME    : GHOZI QUSHOYYI ADAM
NIM     : 10117068
KELAS   : IF-2
 */
package pbo2.pkg10117068.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN17TUNJANGAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        String status;
        int gajipokok;
        double tunjangan, totalgaji;
        
        System.out.println("===========Program Tunjangan=============");
        System.out.println("Berapa gaji pokok anda perbulan :");
        gajipokok = scanner.nextInt();
        
        System.out.println("Status Anda     (Menikah/Belum) : ");
        status = scanner.next();
        
        tunjangan = (status.equalsIgnoreCase("Menikah")) ? gajipokok * 0.35 : 0;
        
        totalgaji = tunjangan + gajipokok;
        
        System.out.println("/n");
        System.out.println("===========MENU PERHITUNG==========");
        System.out.println("Gaji Pokok          :" + gajipokok);
        System.out.println("Tunjangan Gaji      :" + tunjangan);
        System.out.println("Total Gaji          :" + totalgaji);
        System.out.println("Developed By : Ghozi Qushoyyi Adam");
    }
    
}
