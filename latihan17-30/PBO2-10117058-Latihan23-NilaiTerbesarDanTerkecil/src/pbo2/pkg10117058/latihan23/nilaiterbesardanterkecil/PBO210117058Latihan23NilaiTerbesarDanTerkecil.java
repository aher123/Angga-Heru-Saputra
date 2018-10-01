/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;


/**
 ** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :PENAMPILAN PROGRAM NILAI MAHASISWA
 * @author ITB
 */
public class PBO210117058Latihan23NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner (System.in); 
       int banyak , nilai[];
       float rata = 0;
       String nama;
       
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa====");
        System.out.println("Masukan Nama Petugas : ");
        
        System.out.println("Masukan Banyak Mahasiswa:");
        banyak = input.nextInt();
        
        nilai = new int [banyak];
        for (int i = 0; i <= banyak - 1; i++ ) {
            System.out.println("Masukan nilai Mahasiswa ke-" +(i + 1)+ ":");
            nilai[i] = input.nextInt();
        }
        int max = 0;
        for (int val : nilai){
            if ( max < val){
                max = val;
            }
        }
    }
    
}
