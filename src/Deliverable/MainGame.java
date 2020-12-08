/*
 * Name: Gabriel Espinoza
 * Date: Current Date
 * Assignment: ...
 * Description: Assignment Description
 */

package Deliverable;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class MainGame extends PlayingStage {
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PlayingStage game = new PlayingStage();
        playersName(game);
        
        Player player1 = new Player();
        player1.setName(game.getPlayerName(0));
        
        Player player2 = new Player();
        player2.setName(game.getPlayerName(1));
        
        Player player3 = new Player();
        player3.setName(game.getPlayerName(2));
        
        Player player4 = new Player();
        player4.setName(game.getPlayerName(3));
        
        System.out.println("Each player now gets 13 cards");
        
        playerCards(player1);
        playerCards(player2);
        playerCards(player3);
        playerCards(player4);
        
        playerCardValues(player1);

    }
    
    public static boolean checkName(String name){
        if (name.length() >= 5) {
            return true;
        } 
        return false;
    }
    
    public static void playersName(PlayingStage stage){
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            boolean valid = false;
            do {                
                System.out.printf("What is player %d's name\n", i);
                String player = input.next();
                checkName(player);
                if (checkName(player)) {
                    valid = true;
                    stage.addPlayer(player);
                }
            } while (!valid);
           
        }  
    }
    
    public static void playerCards(Player player){
        player.setRandomArrayList();
        System.out.println(player.toString());
    }
    
    public static void playerCardValues(Player player){
        player.setCardValue();
        System.out.println(player.getValue(0));
    }
    
    public static void Fattiyeh(Player player1, Player player2, Player player3, Player player4){
        for (int i = 1; i < 14; i++) {
            
        }
    }
 
}
