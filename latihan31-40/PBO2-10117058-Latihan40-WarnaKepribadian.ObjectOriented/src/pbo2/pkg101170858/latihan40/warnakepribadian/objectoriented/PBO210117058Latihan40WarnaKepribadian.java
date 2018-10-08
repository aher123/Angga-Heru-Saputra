/** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented;

import java.util.Scanner;
import static PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented.Warna.BIRU;
import static PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented.Warna.BLUE;
import static PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented.Warna.CYAN;
import static PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented.Warna.GREEN;
import static PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented.Warna.HIJAU;
import static PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented.Warna.KUNING;
import static PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented.Warna.MAGENTA;
import static PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented.Warna.MERAH;
import static PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented.Warna.NORMAL;
import static PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented.Warna.RED;
import static PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented.Warna.UNGU;
import static PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented.Warna.WHITE;
import static PBO2.pkg101170858.latihan40.warnakepribadian.objectoriented.Warna.YELLOW;

public class  PBO210117058Latihan40WarnaKepribadian{

    public static void main(String[] args) {

        System.out.println(RED + "YUK " + GREEN + "CEK " + YELLOW + "KEPRIBADIANMU "
                + CYAN + "DARI " + MAGENTA + "WARNA " + BLUE + "FAVORITMU" + NORMAL);
        System.out.println("");
        System.out.println(WHITE + MERAH + "\t MERAH \t\t");
        System.out.println(WHITE + HIJAU + "\t HIJAU \t\t");
        System.out.println(WHITE + KUNING + "\t KUNING \t");
        System.out.println(WHITE + BIRU + "\t BIRU \t\t");
        System.out.println(WHITE + UNGU + "\t UNGU \t\t" + NORMAL);
        System.out.println("");

        Warna pWarna = new Warna();
        System.out.print("PILIH WARNA FAVORITMU : ");
        Scanner scanner = new Scanner(System.in);
        pWarna.pilihWarna = scanner.nextLine();

        Nama nama = new Nama();
        System.out.print("NAMA KAMU : ");
        nama.Nama = scanner.nextLine();

        String NAMABesar = nama.Nama.toUpperCase();
        System.out.println("===HASIL TEST KEPRIBADIAN " + NAMABesar + "===");

        nama.Nama(nama.Nama);
        pWarna.pilihWarna(pWarna.pilihWarna);

    }

}
