/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg2.pkg10117058.latihan34.kalkulator;

import java.util.Scanner;

/** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :

 *
 * @author ITB
 */
public class PBO210117058Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        kalkulator nNilai = new kalkulator();
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.println("masukan angka ke 1:");
        nNilai.value1 = scanner.nextDouble();
        System.out.println("Masukan Angka ke 2:");
        nNilai.value2 = scanner.nextDouble();
        System.out.println("");
        System.out.println("Hasil Pertambahan "+ nNilai.tambahBilangan());
        System.out.println("Hasil Pengurangan" + nNilai.kurangBilangan());
        System.out.println("Hasil Perkalian"+ nNilai.kaliBilangan());
        System.out.println("Hasil Pembagian"+ nNilai.bagiBilangan());
        System.out.println("Hasil Sisa"+ nNilai.sisaBilangan());
    }
    
}
