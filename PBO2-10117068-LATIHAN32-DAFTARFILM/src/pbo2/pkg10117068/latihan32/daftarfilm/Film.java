/*o
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan32.daftarfilm;

/**
 *
 * @author user
 */
public class Film {
    public String FilmName;
    public String FilmGenre;
    public Double FilmRating;
    public int FilmDuration;
    
    public void DaftarFilm(String parName,String parGenre, Double parRating, int parDuration){
        System.out.println("=== Daftar Film Sedang Tayang ===");
        System.out.println("Judul Film : " + FilmName);
        System.out.println("Genre Film : " + FilmGenre);
        System.out.println("Rating Film : " + FilmRating);
        System.out.println("Duration Film :" + FilmDuration + " Menit ");
        System.out.println("");
    }
    
}
