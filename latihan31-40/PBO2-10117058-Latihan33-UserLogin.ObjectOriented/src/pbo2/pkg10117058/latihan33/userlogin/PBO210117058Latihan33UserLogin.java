/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan33.userlogin;

import java.util.Scanner;

/** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :

 *
 * @author ITB
 */
public class PBO210117058Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    User Login = new User();
    Scanner scn = new Scanner (System.in);
        System.out.println("Masukan Username:");
        String user = scn.next();
        System.out.println("Masukan Password");
        String password = scn.next();
        System.out.println("");
        
        Login.pengecekanLogin(user,password);
    }
    
}
