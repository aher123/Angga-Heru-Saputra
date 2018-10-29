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
public class Skateboard extends Vehicle {
    private double myBoardLeght;
    public Skateboard(){
        System.out.println("Skateboard");
    }

    public double getBoardLeght() {
        return myBoardLeght;
    }

    public void setBoardLeght(double myBoardLeght) {
        this.myBoardLeght = myBoardLeght;
    }
    
}
