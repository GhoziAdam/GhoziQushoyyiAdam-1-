/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117068.latihan32.daftarfilm;

/**
 *
 * @author user
 */
public class PBO210117068LATIHAN32DAFTARFILM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Film nFilm1 = new Film();
        nFilm1.FilmName ="Venom";
        nFilm1.FilmGenre ="Action,Horror,Scifi";
        nFilm1.FilmRating =8.5;
        nFilm1.FilmDuration =120;
        
        nFilm1.DaftarFilm(nFilm1.FilmName, nFilm1.FilmGenre, nFilm1.FilmRating, nFilm1.FilmDuration);
        
        Film nFilm2 = new Film();
        nFilm2.FilmName ="Small Foot";
        nFilm2.FilmGenre ="Animation";
        nFilm2.FilmRating =9.0;
        nFilm2.FilmDuration = 96;
         
        nFilm2.DaftarFilm(nFilm2.FilmName, nFilm2.FilmGenre, nFilm2.FilmRating, nFilm2.FilmDuration);
        
        Film nFilm3 = new Film();
        nFilm3.FilmName ="Crazy Rich Asian";
        nFilm3.FilmGenre ="Comedy";
        nFilm3.FilmRating =7.8;
        nFilm3.FilmDuration =119;
        
        nFilm3.DaftarFilm(nFilm3.FilmName, nFilm3.FilmGenre, nFilm3.FilmRating, nFilm3.FilmDuration);
        
        Film nFilm4 = new Film();
        nFilm4.FilmName ="Asih";
        nFilm4.FilmGenre="Horor";
        nFilm4.FilmRating=6.0;
        nFilm4.FilmDuration=100;
        
        nFilm4.DaftarFilm(nFilm4.FilmName, nFilm4.FilmGenre, nFilm4.FilmRating, nFilm4.FilmDuration);
        
        
    }
    
}
