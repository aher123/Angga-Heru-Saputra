/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan20.targersaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/*** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :PROGRAM LATIHAN MENAMPILKAN SALDO TABUNGAN DARI SALDO AWAL
 *
 * @author ITB
 */
public class PBO210117058Latihan20TargerSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo,bunga, bulan;
        saldo = 3500000;
        bulan =1;
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getIntegerInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setGroupingSeparator ('.');
        
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        while (saldo <= 6000000){
        
        saldo = (int) ((saldo* 0.08) + saldo);
        //System.out.printf("saldo di bulan ke-" + bulan + "Rp.%,-10d%n", saldo );
        System.out.printf("saldo di bulan ke-" + bulan + " Rp.%s \n",kursIndonesia.format(saldo));
        bulan = bulan + 1;
     
    }
    }
    
}
