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
public class Bola extends BangunRuang {
    private double jarijari;
   
   private double volume;
   
    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

   
   
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    

  


    @Override
    public double BangunRuang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public double jarijari() {
       return 7*7*7;
    }
    

    @Override
      public double HitungVolume() {
        return 22*49*4/3;
        
    }

   
    @Override
    public double volume() {
        return 4/3*22/7*343;
    }


    @Override
    public double tinggi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
    
    
    
    
    

