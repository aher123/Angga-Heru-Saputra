/** NAMA       : ANGGA HERU SAPUTRA
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117058
 * DESKRIPSI PROGRES :
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10117058.latihan30.cakep;

import java.util.Scanner;

public class CAKEP {

    //warna huruf
    public static final String NORMAL = "\u001b[0m";
    public static final String BLACK = "\u001b[30m";
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String MAGENTA = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String WHITE = "\u001b[37m";
    public static final String BLINK = "\u001b[5m";

    public static void main(String[] args) {

        String Jawab;

        System.out.println(RED + "Kamu"+ GREEN +" Ngerjain Sendiri"+ YELLOW +" Latihan 17 sampe"+BLUE+" Latihan 30 Ini?");
        System.out.print("Jawab"+RED+" (Yoi/Enggak) : "+NORMAL);
        Scanner scanner = new Scanner(System.in);
        Jawab = scanner.nextLine();
        System.out.println("");

        if (Jawab.equalsIgnoreCase("Yoi")) {
            System.out.println(RED + "Cakep bener."+MAGENTA+" Good Job ");
        } else if (Jawab.equalsIgnoreCase("Enggak")) {
            System.out.println(RED+"Tetep cakep sih. \n"
                    + CYAN + "Sing penting paham konsep nya yee \n"
                    + NORMAL + "Keep the code works dude.");
        }
    }

}
