/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan38.hitunglingkarang;

/**
 *
 * @author ITB
 */
public class lingkaran {

    double jari;
    double luas;
    double keliling;

    public double jari2Lingkaran(double diameter) {
        jari = diameter / 2;
        return jari;
    }

    public double luas2Lingkaran(double r) {
        luas = Math.PI * r * r;
        return luas;
    }

    public double kelilingLingkaran(double r) {
        luas = 2 * Math.PI * r;
        return luas;

}
}
