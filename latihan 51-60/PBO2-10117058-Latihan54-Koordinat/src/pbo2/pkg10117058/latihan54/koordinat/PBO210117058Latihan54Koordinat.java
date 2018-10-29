/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2.pkg10117058.latihan54.koordinat;

/**
 *
 * @author angga
 */
public class PBO210117058Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WarnaKoordinat kordinat = new WarnaKoordinat(0,0,"");
        kordinat.setNamaWarna("Jingga");
        kordinat.setX(10);
        kordinat.setY(4);
        System.out.println("Warna Koordinat "+kordinat.getNamaWarna());
        System.out.println("Kordinat Sumbu x : "+kordinat.getX()+", y : "+kordinat.getY());
        
    }
    
}
