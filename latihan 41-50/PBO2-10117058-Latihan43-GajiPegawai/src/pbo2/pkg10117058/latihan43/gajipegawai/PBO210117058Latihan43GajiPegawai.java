/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan43.gajipegawai;

/**
 *
 * @author Angga Heru Saputra
 * Nama : Angga Heru Saputra 
 * Kelas : PBO2 
 * Nim : 10117058
 * Deskripsi Program : Program ini berisi program untuk menghitung gaji pegawai
 */
public class PBO210117058Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("=== Data Gaji Karyawan PT.KAKATU ===");
        System.out.println("------------------------------------");
        GajiPegawai pgw = new GajiPegawai();
        pgw.setNama("Rizki Adam Kurniawan");
        pgw.setAlamat("Jalan Semar dalam 4 No 72/66");
        pgw.setUangTransport(250000);
        pgw.setUangTunjangan(300000);
        pgw.setGajiPokok(4500000);
        pgw.setTotalGaji(pgw.getTotalGaji());
        pgw.tampilData(pgw.getNama(), pgw.getAlamat(), pgw.getUangTunjangan(),
                pgw.getUangTransport(), pgw.getGajiPokok(), pgw.getTotalGaji());
    }
    
}
