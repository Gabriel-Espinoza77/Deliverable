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
public class PlayingStage {
    
    private ArrayList<String> players = new ArrayList<String>();
    private int team1Score = 0;
    private int team2Score = 0;
    
    public PlayingStage(){
    }
    
    
    public ArrayList<String> getPlayers() {
        return players;
    }

  
    public void addPlayer(String player) {
        players.add(player);
    }
    
    public String getPlayerName(int index){
        return players.get(index);
    }
    
    public void addteam1Score(int score){
        team1Score += score;
    }
    
    public void addteam2Score(int score){
        team2Score += score;
    }
    
}
