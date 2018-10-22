/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author Angga Heru Saputra
 * Nama : Angga Heru Saputra 
 * Kelas : PBO2 
 * Nim : 10117058
 * Deskripsi Program : Program ini berisi program untuk menghitung sisa tabungan
 * setelah penarikan uang
 */
public class Tabungan {
    private final int saldo;
    
    public Tabungan (int saldo){
        this.saldo = saldo;
        
    }
    public int ambilUang(int jumlah){
        return saldo-jumlah;
    }
    
}
