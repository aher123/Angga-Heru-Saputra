/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Angga Heru Saputra
 * Nama : Angga Heru Saputra
 * Kelas : PBO2 
 * Nim : 10117058
 * Deskripsi Program : Program ini berisi program untuk mencetak nama sebanyak
 * yang diinginkan oleh user
 */
public class PBO210117058Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner baca = new Scanner(System.in);
        Printer prn = new Printer();
        System.out.println("=== Aplikasi Pencetak Nama ===");
        System.out.print("Masukkan Nama Anda : ");
        prn.setNama(baca.nextLine());
        System.out.print("Mau Cetak Berapa Kali? : ");
        prn.setJmlCetak(baca.nextInt());
        prn.cetak(prn.getNama());
        prn.cetak(prn.getJmlCetak(), prn.getNama());
    }
    
}
