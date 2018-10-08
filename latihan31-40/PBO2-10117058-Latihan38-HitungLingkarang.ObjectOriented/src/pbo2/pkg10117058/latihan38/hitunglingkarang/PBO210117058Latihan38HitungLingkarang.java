/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan38.hitunglingkarang;


import java.util.Scanner;

/**
 *
 * @author ITB
 */
public class PBO210117058Latihan38HitungLingkarang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String diameter;
        double d;
        Scanner scn = new Scanner(System.in);
        lingkaran clc = new lingkaran();

        System.out.println("==Perhitungan Lingkaran==");
        do {
            System.out.print("Masukan nilai diameter lingkaran : ");
            diameter = scn.nextLine();
            System.out.println((!diameter.matches("[0-9]*")) ? "Nilai Diameter tidak sesuai\n" : "");

        } while (!diameter.matches("[0-9]*"));
        System.out.println("===Hasil Perhitungan Lingkaran==");
        d = Double.parseDouble(diameter);

        System.out.printf("Jari-jari Lingkaran\t = %.0f cm %n",
                clc.jari2Lingkaran(d));
        System.out.printf("Luas Lingkaran\t\t = %.2f cm %n",
                clc.luas2Lingkaran(clc.jari2Lingkaran(d)));
        System.out.printf("Keliling Lingkaran\t = %.2f cm %n",
                clc.kelilingLingkaran(clc.jari2Lingkaran(d)));

    }
        
    
    
      
        
             
    
    
}
