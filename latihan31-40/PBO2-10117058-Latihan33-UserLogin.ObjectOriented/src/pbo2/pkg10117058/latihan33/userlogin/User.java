/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan33.userlogin;

/**
 *
 * @author ITB
 */
public class User {
    String username = "Angga";
    String Password = "Heru";
    boolean status;
    
    public boolean cekAkun (String userName, String passWord){
        if (userName.equals(username)){
            status = true;
        }
        else if (passWord.equals(Password)){
            status = false;
        }
        else{
            status = false;
        }
        return status;
    }
    public void hasilLogin (boolean status, String userName){
        if(status){
            System.out.println("===hallo angga" + userName.toUpperCase()+"===");
            System.out.println("Selamat Datang Di Aplikasi ini");
            
        }
        else {
            System.out.println("oopppsss, Username atau password anda salah");
        }
    }
    
public void pengecekanLogin(String userName, String passWord){
    System.out.println(cekAkun (userName, Password));
    hasilLogin(status, userName);
}
}