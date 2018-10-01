/*
 * NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan WAKTU DAN TANGGAL SEKARANG
 */
package pbo2.pkg10117058.latihan26.waktu.saat.ini;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TGLWAKTU {

    public static void main(String[] args) {

     Date Waktu = new Date( );
      SimpleDateFormat FormatWaktu = new SimpleDateFormat ("EEEE, dd MMM yyyy hh:mm:ss");

      System.out.println("Hari ini adalah hari : " + FormatWaktu.format(Waktu));
    }

}
