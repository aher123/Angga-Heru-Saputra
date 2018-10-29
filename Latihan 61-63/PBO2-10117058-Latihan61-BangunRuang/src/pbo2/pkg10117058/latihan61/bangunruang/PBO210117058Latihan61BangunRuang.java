/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan61.bangunruang;

/**
 *
 * @author ITB
 */
public class PBO210117058Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bola = new Bola();
        bola.HitungVolume();
        
        System.out.println("Jari-Jari :"+bola.jarijari());
        System.out.println("Volume :"+bola.HitungVolume());
        
        tabung tabung = new tabung ();
        tabung.HitungVolume();
        System.out.println("Jari-Jari :"+tabung.jarijari());
        System.out.println("Tinggi :"+tabung.tinggi());
        System.out.println("Volume :"+tabung.HitungVolume());
        
        kerucut kerucut = new kerucut();
        kerucut.HitungVolume();
        System.out.println("Jari-Jari :"+kerucut.jarijari());
        System.out.println("Tinggi :"+kerucut.tinggi());
        System.out.println("Volume :"+kerucut.HitungVolume());
        
    }
    

    
    }

    

