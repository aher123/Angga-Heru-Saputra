/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan61.bangunruang;

/**
 *
 * @author ITB
 */
public class tabung extends BangunRuang{
    private double jarijari;
    private double tinggi;

    public double getJarijari() {
        return jarijari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double BangunRuang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double HitungVolume() {
        return (3.14*10*10)*21;
    }

    @Override
    public double jarijari() {
        return 10;
    }

    @Override
    public double tinggi() {
        return 21;
    }

    @Override
    public double volume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
