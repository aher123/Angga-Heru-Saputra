/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan24.perbandinganduabuahnilai;


import java.util.Scanner;

/**
 ** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :PROGRAM MENAMPILKAN NILAI DAN PERBANDINGAN KEDUA NILAI
 * @author ITB
 */
public class PBO210117058Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk = new Scanner(System.in);

        int nilai, nilai2 = 0, hasil, i;
        String jawaban, perintah;

        boolean ulang = true;

        while (ulang = true) {
            System.out.println("masukkan nilai pertama :");
            Scanner scanner = new Scanner(System.in);
            nilai = scanner.nextInt();

            jawaban = (nilai > nilai2 ? "besar" : "kecil");

            System.out.println("Hasil :" + nilai + " Lebih" + jawaban + "dari" + nilai2);
            System.out.print("Ulangi Aktivitas ? (ya/Tidak) : ");
            perintah = scanner.next();
          

            if (perintah.equalsIgnoreCase("tidak")) {
                
                ulang = false;
                 System.out.println("keluar");
            } else {
                System.out.println("masukan nilai pertama: ");
                nilai = scanner.nextInt();
                System.out.println("masukan nilai Kedua :");
                nilai2 = scanner.nextInt();

                jawaban = (nilai > nilai2 ? "besar" : "kecil");
                System.out.println("hasil : " + nilai + "lebih" + jawaban + "dari" + nilai2);

                System.out.println("Ulangi Aktivitas ? (Ya/Tidak):");
           perintah = scanner.next();
                
            }
        }

    }

}
