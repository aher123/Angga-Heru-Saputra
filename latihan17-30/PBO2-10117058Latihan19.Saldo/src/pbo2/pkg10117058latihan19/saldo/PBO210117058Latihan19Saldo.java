/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058latihan19.saldo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


/**
 ** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :PROGRAM MENAMPILKAN SALDO 
 * @author ITB
 */
public class PBO210117058Latihan19Saldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double bunga;
        int saldo,bulan ;
     
        saldo = 2500000;
       bulan = 1;
       DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getIntegerInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
    while (bulan <= 6 ){
        saldo = (int) (saldo + (saldo * 0.15));
        System.out.printf("Saldo Di Bulan ke-" + bulan + " Rp.%s \n ", kursIndonesia.format(saldo));
        bulan = bulan +1;
    }
  
       
    
    }
    
}
