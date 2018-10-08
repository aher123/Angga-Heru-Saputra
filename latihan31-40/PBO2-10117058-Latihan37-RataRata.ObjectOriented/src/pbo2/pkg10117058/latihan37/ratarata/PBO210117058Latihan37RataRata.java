/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan37.ratarata;

import java.util.Scanner;

/**
 *
 * @author ITB
 */
public class PBO210117058Latihan37RataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahmahasiswa;
        Scanner scn = new Scanner (System.in);
        ratarata rata = new ratarata();
        
        System.out.println("Masukan Banyaknya Mahasiswa : ");
        jumlahmahasiswa = scn.nextInt();
        
        rata.hitungNilai(jumlahmahasiswa);
        double jumlahNilai;
        
        System.out.println("Rata-Rata Nilainya Adalah : " + rata.hitungrata2Nilai
        (rata.jumlahNilai, jumlahmahasiswa));
    }
    
}
