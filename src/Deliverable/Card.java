/*
 * Name: Gabriel Espinoza
 * Date: Current Date
 * Assignment: ...
 * Description: Assignment Description
 */

package Deliverable;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public abstract class Card {

    private String[] cardSuit = {"Diamonds", "Hearts", "Spades", "Clubs"};
    private int[] cardValueInt = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private String[] cardValueString = {"Two", "Three", "Four", "Five", "Six", 
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    String cardString = "";
    private ArrayList<String> card = new ArrayList<String>();
    private ArrayList<Integer> cardValue = new ArrayList<Integer>();

    public Card() {
    }

    public void setCard(int value, int suit){
        String cardInDeck = cardValueString[value] + " of " + cardSuit[suit];
        card.add(cardInDeck);
    }
    
    public String getCard(int index){
        return card.get(index);
    }
    
    public void setRandomArrayList(){
        for (int i = 0; i < 14; i++) { 
            String arrayListCard = cardValueString[(int)(Math.random() * ((12 - 0) + 1))] 
                + " of " + cardSuit[(int)(Math.random() * ((3 - 0) + 1))];
            card.add(arrayListCard);
        }  
    }
    
    public ArrayList<String> getRandomArrayList(){
        return card;
    }
    
    public void setCardValue(){
        for (int i = 0; i < 14; i++) {
            if (card.get(i).substring(0, 2).matches("Two")) {
                cardValue.add(cardValueInt[0]);
            } else if (card.get(i).substring(0, 5).matches("Three")){
                cardValue.add(cardValueInt[1]);
            } else if (card.get(i).substring(0, 4).matches("Four")){
                cardValue.add(cardValueInt[2]);
            } else if (card.get(i).substring(0, 4).matches("Five")){
                cardValue.add(cardValueInt[3]);
            } else if (card.get(i).substring(0, 3).matches("Six")){
                cardValue.add(cardValueInt[4]);
            } else if (card.get(i).substring(0, 5).matches("Seven")){
                cardValue.add(cardValueInt[5]);
            } else if (card.get(i).substring(0, 5).matches("Eight")){
                cardValue.add(cardValueInt[6]);
            } else if (card.get(i).substring(0, 4).matches("Nine")){
                cardValue.add(cardValueInt[7]);
            } else if (card.get(i).substring(0, 3).matches("Ten")){
                cardValue.add(cardValueInt[8]);
            } else if (card.get(i).substring(0, 4).matches("Jack")){
                cardValue.add(cardValueInt[9]);
            } else if (card.get(i).substring(0, 5).matches("Queen")){
                cardValue.add(cardValueInt[10]);
            } else if (card.get(i).substring(0, 4).matches("King")){
                cardValue.add(cardValueInt[11]);
            } else if (card.get(i).substring(0, 3).matches("Ace")){
                cardValue.add(cardValueInt[12]);
            }
        }
    }
    
    public int getValue(int index){
        return cardValue.get(index);
    }
    
    public String getCard(){
        return card.get(0);
    }
    
    public String getAllCards(){
        String output = "";
        for (int i = 1; i < card.size(); i++) {
            output += card.get(i) + "\n";
        }
        return output;
    }
    
    @Override
    public abstract String toString();
    
}
