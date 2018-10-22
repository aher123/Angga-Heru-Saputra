/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan48.kalkulator;

/**
 *
 * @author Angga Heru Saputra
 * Nama : Angga Heru Saputra
 * Kelas : PBO2 
 * Nim : 10117058
 * Deskripsi Program : Program ini berisi program untuk menghitung angka dengan
 * operator Tambah, Kurang, Kali, dan Bagi
 */
public class PBO210117058Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator klt =  new Kalkulator();
        klt.setValue1(7);
        klt.setValue2(5);
        System.out.println("VALUE 1 = "+klt.getValue1());
        System.out.println("VALUE 2 = "+klt.getValue2());
        klt.setNameProject();
        klt.setNoteProject(null);
        System.out.println("Result Add is = "+klt.add(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Minus is = "+klt.minus(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Multiplication is = "+klt.multiplication(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Division is = "+klt.division(klt.getValue1(), klt.getValue2()));
    }
    
}
