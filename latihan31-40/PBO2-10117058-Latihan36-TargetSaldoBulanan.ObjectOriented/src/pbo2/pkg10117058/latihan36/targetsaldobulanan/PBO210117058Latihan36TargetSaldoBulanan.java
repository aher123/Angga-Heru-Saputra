/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan36.targetsaldobulanan;

/** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :

 *
 * @author ITB
 */
public class PBO210117058Latihan36TargetSaldoBulanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo = 3500000;
        double bunga = 0.08;
        double bulan = 0;
        
        saldoTabungan tst = new saldoTabungan();
        tst.hitungTabungan(saldo, bulan, bunga);
    }
    
}
