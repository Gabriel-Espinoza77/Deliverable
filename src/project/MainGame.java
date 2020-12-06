/*
 * Name: Gabriel Espinoza
 * Date: Current Date
 * Assignment: ...
 * Description: Assignment Description
 */

package project;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class MainGame {
    
    
    
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

    }
    
    public static void playersName(PlayingStage stage){
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.printf("What is player %d's name\n", i);
            String player = input.next();
            stage.addPlayer(player);
        }  
    }
 
}
