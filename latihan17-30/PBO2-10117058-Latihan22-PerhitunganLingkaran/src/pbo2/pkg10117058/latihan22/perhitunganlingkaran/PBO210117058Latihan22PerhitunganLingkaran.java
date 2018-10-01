/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan22.perhitunganlingkaran;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 ** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :PROGRAM MENAMPILKAN DIAMETER INGKARAN
 * @author ITB
 */
public class PBO210117058Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner scanner = new Scanner (System.in);
     double PHI = 3.14159265358979323846;
     double keliling, diameter = 0, jarijari, luas;
     
     
     do{
         System.out.println("Masukkan nilai diameter ingkaran :");
         try{
             diameter = scanner.nextDouble ();
             
         }catch (Exception e){
             System.out.println("Nilai dimeter tidak sesuai");
             scanner.nextLine();
         }
         
     }while (diameter == 0);
    
     jarijari = diameter / 2;
     luas = (float) (PHI * (jarijari * jarijari));
     keliling = (PHI * diameter );
      
     DecimalFormat DF = new DecimalFormat("#.##");
         System.out.printf("jari-jari lingkaran \t = %s%n", DF.format(jarijari));
         System.out.printf("keliling lingkaran \t %s%n", DF.format(keliling));
    
    }
    
}

