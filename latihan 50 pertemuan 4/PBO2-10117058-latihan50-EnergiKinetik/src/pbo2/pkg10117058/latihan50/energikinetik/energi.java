/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan50.energikinetik;

/**
 *
 * @author ITB
 */
public class energi {

private double massa;
private double kecepatan;
private double energikinetik;
private double energikinetik2;

public double getMassa(){
    return massa;
}
public void setMassa(double massa ){
    this.massa =  massa;
}
public double getKecepatan(){
    return kecepatan;
}
public void setKecepatan(double kecepatan){
    this.kecepatan = kecepatan;
}

public double hitungEnergiKinetik (double m, double k){
    energikinetik = 0.5 * m * (k*k);
    return  energikinetik;
}
public double hitungEnergiKinetik2(double m, double k){
    energikinetik = 0.5 * m * 0;
    return energikinetik2;
}
public double usaha(){
    return energikinetik - energikinetik2;
}
}
