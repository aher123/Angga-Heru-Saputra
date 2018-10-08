/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan37rata.rata.objectoriented;

import java.util.Scanner;

/** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :

 *
 * @author ITB
 */
public class PBO210117058Latihan37RataRataObjectOriented {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int jumlahmahasiswa;
     Scanner scn = new Scanner(System.in);
     ratarata rata = new ratarata();
     
        System.out.print("Masukan Banyaknya Mahasiswa :");
        jumlahmahasiswa = scn.nextInt();
        
        rata.hitungnilai(jumlahmahasiswa);
        double jumlahnilai;
        System.out.println("Rata Rata Nilainya adalah :"+
        rata.hitungrata2Nilai(rata.jumlahnilai, jumlahmahasiswa));
    }
    
}
