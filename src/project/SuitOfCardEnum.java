/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author gabri
 */
public enum SuitOfCardEnum {
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades"),
    CLUBS("Clubs");

    private final String suitText;

    private SuitOfCardEnum(String suitText){
        this.suitText = suitText;
    }

    public String PrintSuitText(){
        return suitText;
    } 
    
}
