/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan31.perkenalanmahasiswa;

/** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :

 *
 * @author ITB
 */
public class PBO210117058Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
   Mahasiswa nMhs1 = new Mahasiswa();
   nMhs1.nim = "10110229";
   nMhs1.nama = "Rizki Adam Kurniawan";
   
   nMhs1.perkenalanDiri(nMhs1.nim, nMhs1.nama);
   
   Mahasiswa nMhs2 = new Mahasiswa();
   nMhs2.nama = "10110270";
   nMhs2.nama = "Indra Tiola";
   
   nMhs2.perkenalanDiri(nMhs2.nim, nMhs2.nama);
   
   Mahasiswa nMhs3 = new Mahasiswa();
   nMhs3.nim = "10110271";
   nMhs3.nama = "Robi Tanzil Genefit";
   
   nMhs3.perkenalanDiri (nMhs3.nim, nMhs3.nama);
   
   Mahasiswa nMhs4 = new Mahasiswa();
   nMhs4.nim = "10110269";
   nMhs4.nama = "Muhammad Nur Awaludin";
   
   nMhs4.perkenalanDiri(nMhs4.nim, nMhs4.nama);
    }
    
    
}
