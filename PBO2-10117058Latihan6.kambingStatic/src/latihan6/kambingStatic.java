/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;

/**
 *
 * @author
 * 
 * NAMA: Angga Heru Saputra
 * Kelas: IF-2
 * Nim : 10117058
 * Matkul: PBO-2
 * Deskripsi Program: Program ini berisi program menampilkan jumlah kambing Midun
 */



public class kambingStatic {
    
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
     
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                + Mamalia.jumlahKambing);
    }
    
}
