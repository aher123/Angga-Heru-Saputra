/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan55.handphone;

/**
 *
 * @author angga
 */
public class Blackberry extends Handphone {
    private String pinBB;

    public Blackberry(String man, String os, String model, int harga) {
        super(man, os, model, harga);
        this.manufacture=man;
        this.operatingSystem=os;
        this.model=model;
        this.harga=harga;
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
    
    
}
