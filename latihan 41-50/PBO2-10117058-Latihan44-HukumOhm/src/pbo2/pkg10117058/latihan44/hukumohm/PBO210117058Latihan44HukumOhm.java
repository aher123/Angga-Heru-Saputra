/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan44.hukumohm;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk menghitung hasil
 * tengangan dari sebuah baterai
 */
public class PBO210117058Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai btr = new Baterai(3,12);
        System.out.println("Kuat Arus : "+btr.getKuatArus()+ " ampere");
        System.out.println("Hambatan : "+btr.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan : "+btr.hitungTegangan()+" volt");
    }
    
}
