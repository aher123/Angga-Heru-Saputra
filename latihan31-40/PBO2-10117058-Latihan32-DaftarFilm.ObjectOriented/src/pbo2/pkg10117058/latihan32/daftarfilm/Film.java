/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan32.daftarfilm;

/**
 *
 * @author ITB
 */
public class Film {

public String filmName;
public String filmGenre;
public Double filmRating;
public int filmDuration;

public void daftarTayangFilm(String parfilmName, String parfilmGenre, Double parfilmRating,
                        int parfilmDuration){
    
    System.out.println("===Daftar Film Sedang Tayang===");
    System.out.println("Judul Film :" + filmName);
    System.out.println("Genre Film :" + filmGenre);
    System.out.println("Rating FIlm :"+ filmRating);
    System.out.println("Duration Film:" + filmDuration);
    System.out.println("");
            
}
}
