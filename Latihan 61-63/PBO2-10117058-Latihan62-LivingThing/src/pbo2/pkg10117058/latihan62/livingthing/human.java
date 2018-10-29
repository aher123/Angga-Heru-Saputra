/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan62.livingthing;

/**
 *
 * @author ITB
 */
public class human {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void walk (String nama){
        this.nama = nama;
        System.out.println(nama + "sedang berjalan");
    }  
    public void breath (String nama){
        this.nama = nama;
        System.out.println(nama + "Sedang Ber Nafas");
    }    
        public void eat (String Nama){
            this.nama = nama;
            
            System.out.println(nama + "sedang makan");
    }
}
