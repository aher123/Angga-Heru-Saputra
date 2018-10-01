/*
 * NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENGGANTI/MERUBAH KATA 
 * YANG TELAH DI INPUTKAN OLEH USER
 */
package pbo2.pkg10117058.latihan28.ganti.kata;

import java.util.Scanner;

public class PBO210117058LATIHAN28GANTIKATA {

    public static void main(String[] args) {

        String Kalimat;
        String nGanti,nJadi;

        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata : ");
        nGanti = scanner.nextLine();
        
        System.out.print("Menjadi Kata : ");
        nJadi = scanner.nextLine();
                      
        String ganti = Kalimat.replace(nGanti,nJadi);
        System.out.println("ADALAH : "+ganti);        
    }

}
