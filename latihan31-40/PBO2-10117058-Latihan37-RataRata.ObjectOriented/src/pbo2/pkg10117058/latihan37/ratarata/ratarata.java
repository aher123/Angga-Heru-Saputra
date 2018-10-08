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
public class ratarata {
    double rata2;
    double jumlahNilai = 0;
    
    public void hitungNilai (int jumlahmahasiswa){
        int i;
        double nilai;
        Scanner scn = new Scanner (System.in);
        
        for (i = 1; i <= jumlahmahasiswa; i++){
            System.out.println("Nilai Mahasiswa ke-" + i + " : ");
            nilai = scn.nextDouble();
            jumlahNilai = jumlahNilai + nilai;
            
        }
    }
    public double hitungrata2Nilai (double jumlahNilai, int jumlahmahasiswa){
        rata2 = jumlahNilai / jumlahmahasiswa;
        return rata2;
    }
}
