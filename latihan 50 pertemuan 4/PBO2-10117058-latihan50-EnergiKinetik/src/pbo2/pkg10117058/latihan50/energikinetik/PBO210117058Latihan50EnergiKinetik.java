/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan50.energikinetik;

/**
 *
 * @author ITB
 */
public class PBO210117058Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        energi bola = new energi();
        bola.setMassa(145);
        bola.setKecepatan(25);
        System.out.println("sebuah boal baseball dengan massa ="+ bola.getMassa() + "g");
        System.out.println("bola baseball tersebut dilemparkan dengan kecepatan ="+ bola.getKecepatan()+"m/s");
        
        double massa = bola.getMassa();
        double kecepatan= bola.getKecepatan();
        
        System.out.println("A. energi kinetik ="+ bola.hitungEnergiKinetik(massa, kecepatan));
        System.out.println("B. usaha pada bola ="+ bola.usaha());
        System.out.println("P.S nilai usaha tetap, karena dimulai dari keadaan diam");
    }
    
}
