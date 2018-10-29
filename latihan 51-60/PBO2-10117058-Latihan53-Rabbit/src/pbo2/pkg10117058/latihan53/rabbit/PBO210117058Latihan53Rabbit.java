/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2.pkg10117058.latihan53.rabbit;

/**
 *
 * @author angga
 */
public class PBO210117058Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit kelinci = new Rabbit("Peter",false,"Grass",4,"grey");
        System.out.println("Hello, his name is "+kelinci.getName());
        System.out.println(kelinci.getName()+" is Vegetarian? "+kelinci.isVegetarian());
        System.out.println(kelinci.getName()+" eats "+kelinci.getEats());
        System.out.println(kelinci.getName()+" has "+kelinci.getNoOfLegs()+" legs");
        System.out.println(kelinci.getName()+" color is "+kelinci.getColor());
        
    }
    
}
