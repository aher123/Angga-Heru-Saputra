/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan21.rata.ratanilai;

import java.util.Scanner;

public class PBO210117058Latihan21RataRataNilai {

    /*** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :MENAMPILKAN PROGRAM RATA-RATA NILAI MAHASISWA
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int banyak, jml, nilai[];
        float rata, jumlah = 0;
        
        System.out.print("Masukkan Jumah Mahasiswa ke-" + (1+1) + ":");
        banyak = input.nextInt();
        nilai = new int[banyak];
        
        for (int i =0; i <= banyak - 1; i++){
            System.out.print("Nilai Mahasiswa ke-" + (i+1 ) + ":");
            nilai[i] = input.nextInt();
            
        }
        for (int j = 0; j <= banyak -1; j++){
            jumlah = jumlah + nilai[j];
        } 
        rata =  jumlah /banyak;
        System.out.println();
        System.out.println("Maka, Rata-Rata Nilainya adalah " + rata);
        System.out.println("Developed by : Angga Heru Saputra");
    }
    
}
