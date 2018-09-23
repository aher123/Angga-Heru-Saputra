/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author Angga Heru Saputra IF-2
 * 
 * NAMA: Angga Heru Saputra
 * Kelas: IF-2
 * Nim : 10117058
 * Matkul: PBO-2
 * Deskripsi Program: Program ini berisi program penambahan/tambah kambing
 */
public class kambing{
    
    public void tambahKambing(){
        //deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing Setelah Ditambahkan: " + 
                            jumlahKambing);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        kambing kambingJantan = new kambing();
        kambingJantan.tambahKambing();
        
    }    

}
