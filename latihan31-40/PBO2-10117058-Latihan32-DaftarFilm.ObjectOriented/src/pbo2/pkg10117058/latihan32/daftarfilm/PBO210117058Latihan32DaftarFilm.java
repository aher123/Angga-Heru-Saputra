/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan32.daftarfilm;

/** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :

 *
 * @author ITB
 */
public class PBO210117058Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Film nFilm1 = new Film();
    nFilm1.filmName = "Venom";
    nFilm1.filmGenre = "Action, Horor,Scifi";
    nFilm1.filmRating = 8.5;
    nFilm1.filmDuration = 120;
    nFilm1.daftarTayangFilm(nFilm1.filmName, nFilm1.filmGenre,nFilm1.filmRating,
                            nFilm1.filmDuration);
    
    Film nFilm2 = new Film();
    nFilm2.filmName = "Small Foot";
    nFilm2.filmGenre = "Animation";
    nFilm2.filmRating = 9.0;
    nFilm2.filmDuration = 96;
    
    nFilm2.daftarTayangFilm(nFilm2.filmName, nFilm2.filmGenre, nFilm2.filmRating,
                            nFilm2.filmDuration);
    
    Film nFilm3 = new Film();
    nFilm3.filmName = "Carzy Rich Asian";
    nFilm3.filmGenre = "Comedy";
    nFilm3.filmRating = 7.8;
    nFilm3.filmDuration=119;
    
    nFilm3.daftarTayangFilm(nFilm3.filmName, nFilm3.filmGenre,nFilm3.filmRating,
                            nFilm3.filmDuration);
    
    Film nFilm4 = new Film();
    nFilm4.filmName = "Asih";
    nFilm4.filmGenre = "Horor";
    nFilm4.filmRating = 6.0;
    nFilm4.filmDuration= 100;
    
    nFilm3.daftarTayangFilm(nFilm4.filmName, nFilm4.filmGenre,nFilm4.filmRating,
                            nFilm4.filmDuration);
    }
    
}
