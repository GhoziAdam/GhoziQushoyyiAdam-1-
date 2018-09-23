/*
 * NAMA       : Ghozi Qushoyyi Adam
 * KELAS      : IF2
 * MATAKULIAH : PBO2
 * NIM        : 10117068
 * DESKRIPSI PROGRES : Program ini menampilkan program kambing
 */
package pbo2.pkg10117068.latihan4.kambingg;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN4KAMBINGG {
    
    public void tambahKambing() {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: "+ jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       PBO210117068LATIHAN4KAMBINGG KambingJantan = new PBO210117068LATIHAN4KAMBINGG();
       KambingJantan.tambahKambing();
    }
    
}
