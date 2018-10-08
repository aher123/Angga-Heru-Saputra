
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan39nilaiterbesadanterkecil;

import java.util.Scanner;

/**
 *
 * @author ITB
 */
public class petugas {
public String namaPetugas;
daftarnilai dafNilai = new daftarnilai();
Scanner scn = new Scanner (System.in);

public void inputpetugas(){
    System.out.println("Masukan Nama Petugas :");
    namaPetugas = scn.next();
}
}
