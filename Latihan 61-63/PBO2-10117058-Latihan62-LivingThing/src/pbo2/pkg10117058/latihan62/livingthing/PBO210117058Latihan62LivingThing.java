/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117058.latihan62.livingthing;

/**
 *
 * @author ITB
 */
public class PBO210117058Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        human human = new human ();
        human.setNama(" Rizki Adam Kurniawan ");
        
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
        
        
    }
    
}
