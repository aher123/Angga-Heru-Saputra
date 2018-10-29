/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan63.gradiengarislurus;

/**
 *
 * @author ITB
 */
public class PBO210117058Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        koordinat koor = new koordinat(2, 10 ,5 , 7);
        System.out.println("Garis yang melalui titik "+koor.getX1()+ "," +koor.getY1()
                +" dan "+koor.getX2()+","+koor.getY2());
        System.out.println("memiliki Gradien Sebesar "+koor.hitungGradien());
        koordinat kor = new koordinat(5 , 1, 3, 12);
        System.out.println("Garis yang melalui titik "+kor.getX1()+","+kor.getY1()
                +"dan"+kor.getX2()+","+kor.getY2());
        System.out.println("Memiliki gradien sebesar "+kor.hitungGradien());
    }
    
}
