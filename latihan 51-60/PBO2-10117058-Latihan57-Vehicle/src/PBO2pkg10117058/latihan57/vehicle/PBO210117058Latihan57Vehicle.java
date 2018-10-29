/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO2pkg10117058.latihan57.vehicle;

/**
 *
 * @author angga
 */
public class PBO210117058Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bicycle = new Bicycle();
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");
        bicycle.setGearCount(23);
        System.out.println("Brand : "+bicycle.getBrand());
        System.out.println("Model : "+bicycle.getModel());
        System.out.println("Jumlah Gear : "+bicycle.getGearCount());
        System.out.println("");
        
        Skateboard skate = new Skateboard();
        skate.setBrand("Ally Skate");
        skate.setModel("Rocket");
        skate.setBoardLeght(54.5);
        System.out.println("Brand : "+skate.getBrand());
        System.out.println("Model : "+skate.getModel());
        System.out.println("Panjangnya Board : "+skate.getBoardLeght());
    }
    
}
