/*
 * NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES : Program ini berisi program untuk MENGUBAH HURURF BESAR DAN KECIL
 */
package pbo2.pkg10117058.latihan27.huruf.besar.kecil;

import java.util.Scanner;

public class PBO210117058LATIHAN27HURUFBESARKECIL {

    public static void main(String[] args) {

        String Kalimat;

        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();

        String Besar = Kalimat.toUpperCase();
        String Kecil = Kalimat.toLowerCase();
        System.out.println();
        System.out.println("====Hasil Formating====");
        System.out.println("Huruf besar = " + Besar);
        System.out.println("Huruf kecil = " + Kecil);
    }

}
