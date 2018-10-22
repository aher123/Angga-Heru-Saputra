/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan44.hukumohm;

/**
 *
 * @author Angga Heru Saputra
 * Nama : Angga Heru Saputra 
 * Kelas : PBO2 
 * Nim : 10117058
 * Deskripsi Program : Program ini berisi program untuk menghitung hasil
 * tengangan dari sebuah baterai
 */
public class Baterai {
 
    private float kuatArus;
    private float hambatan;
    
    public Baterai(){
        
    }
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus=kuatArus;
        this.hambatan=hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan(){
        return kuatArus*hambatan;
    }
}
