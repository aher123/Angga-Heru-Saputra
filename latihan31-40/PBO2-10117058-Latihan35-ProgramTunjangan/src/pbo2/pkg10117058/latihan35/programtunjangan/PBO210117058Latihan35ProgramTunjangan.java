/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan35.programtunjangan;

import java.util.Scanner;

/** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :

 *
 * @author ITB
 */
public class PBO210117058Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double gajiPokok;
    String status;
    
    Scanner scanner = new Scanner (System.in);
    
    tunjangan tjn = new tunjangan ();
        tunjangan tunjangan = new tunjangan ();
        System.out.println("===Program Tunjangan===");
        System.out.print("Berapa Gaji Pokok Anda Sebulan? : Rp. ");
        gajiPokok = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah /Lajang) ? :");
        status =  scanner.next();
        System.out.println("");
        
        tjn.hitungTunjangan(gajiPokok, status);
        System.out.println("Developed by : Angga Heru");
                
        
    }
    
}
