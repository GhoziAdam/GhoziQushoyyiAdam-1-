/*
 * To change this license header, choose License Headers in Project Properties.
/*
 * NAMA       : Ghozi Qushoyyi Adam
 * KELAS      : IF2
 * MATAKULIAH : PBO2
 * NIM        : 10117068
 * DESKRIPSI PROGRES : Program ini menampilkan program kambing global
 */
package pbo2.pkg10117068.latihan5.kambingglobal;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN5KAMBINGGLOBAL {

    /**
     * @param args the command line arguments
    
    */
        int jumlahKambing = 88;
        
        // Method untuk menampilkan jumlah kambing
        public void getJumlahKambing() {
               System.out.println("Jumlah Kambing: " + jumlahKambing);
        }
        
        public void tambahKambing() {
            jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
            
        }
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Variabel jumlahKambing menjadi variabel instance
        
    
        
            PBO210117068LATIHAN5KAMBINGGLOBAL kambingSusu = new PBO210117068LATIHAN5KAMBINGGLOBAL();{
            
            // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
            kambingSusu.getJumlahKambing();
            // Menambah satu kambing
            kambingSusu.tambahKambing();
            // Menampilkan Jumlah kambing yang ada
            kambingSusu.getJumlahKambing();
        
    
    
}
    }
}
