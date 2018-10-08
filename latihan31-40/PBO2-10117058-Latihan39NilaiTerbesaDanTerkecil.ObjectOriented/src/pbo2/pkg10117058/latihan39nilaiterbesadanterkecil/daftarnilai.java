/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan39nilaiterbesadanterkecil;

import java.util.Scanner;

/**
 *
 * @author ITB
 */
public class daftarnilai {
public int jumlahmhs;
public int nbesar = 0;
public int nkecil = 100;
public int nilaimhs[] = new int[40];
Scanner scn = new Scanner (System.in);

public void inputjumlahmhs(){
    System.out.print("Masukan banyaknya Mahasiswa :");
    jumlahmhs = scn.nextInt();
}
public int hitungNilaiTerbesar(int i) {
    return nbesar = ((nbesar <= nilaimhs[i])? nilaimhs[i] :nkecil);
    
}
public int hitungNilaiTerkecil(int i){
    return nkecil = ((nkecil >= nilaimhs[i])? nilaimhs[i]:nkecil);
}
public void hasilNilaiMhs(){
    System.out.println("\n===Hasil Nilai Mahasiswa===");
    
    for (int i = 0; i< jumlahmhs; i++) {
    System.out.print("Nilai Mahasiswa ke-"+ (i+1)+" = "+nilaimhs[i]+"");
}
}

}
