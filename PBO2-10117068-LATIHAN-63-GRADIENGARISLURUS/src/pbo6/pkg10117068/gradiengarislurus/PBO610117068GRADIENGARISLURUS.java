/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg10117068.gradiengarislurus;

/**
 *
 * @author user
 */
public class PBO610117068GRADIENGARISLURUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        koordinat kdr = new koordinat(2,10,5,7);
        System.out.println("Garis yang melalui titik("+ kdr.getX1()+""+ kdr.getY1()+
                ")dan("+ kdr.getX2()+""+ kdr.getY2()+")");
        System.out.println("Memiliki Gradien sebesar :"+kdr.hitungGradien());
    
        koordinat btr = new koordinat(5,1,3,12);
        System.out.println("Garis yang melalui titik("+ btr.getX1()+""+ btr.getY1()+
                ")dan("+btr.getX2()+""+btr.getY2()+")");
        System.out.println("Memiliki Gradien sebesar : "+btr.hitungGradien());
    }
       
        
        
}
