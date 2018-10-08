/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan39nilaiterbesadanterkecil;

import java.util.Scanner;

/** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :

 *
 * @author ITB
 */
public class PBO210117058Latihan39NilaiTerbesaDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      petugas ptg = new petugas();
      daftarnilai dafNilai = new daftarnilai();
      Scanner scn = new Scanner(System.in);
      
        System.out.println("===Program Nilai Terbesar dan Terkecil===");
        ptg.inputpetugas();
        dafNilai.inputjumlahmhs();
        
        //
        for (int i=0; i<dafNilai.jumlahmhs; i++){
            System.out.print("Masukan Nilai Mahasiswa ke-" +(i + 1)+"=");
            dafNilai.nilaimhs[i] = scn.nextInt();
            dafNilai.hitungNilaiTerbesar(i);
            dafNilai.hitungNilaiTerkecil(i);
            
        }
        dafNilai.hasilNilaiMhs();
        System.out.println("\nNilai Terbesar Adalah " +dafNilai.nbesar);
        System.out.println("Nilai Terkecil adalah " +dafNilai.nkecil);
        
        System.out.println("\npetugas : " +ptg.namaPetugas);
    }
    
}
