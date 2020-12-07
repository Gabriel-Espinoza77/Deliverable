/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author Gabriel Espinoza Nov 2020
 */
public abstract class Game extends Player{

    private final String gameName;//the title of the game
    private ArrayList<Player> players;// the players of the game
    private int team1Score = 0;
    private int team2Score = 0;

    public Game(String name) {
        this.gameName = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getGameName() {
        return gameName;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param player
     */
    public void setPlayers(Player player) {
        this.players.add(player);
    }
    
    public void addteam1Score(int score){
        this.team1Score += score;
    }
    
    public void addteam2Score(int score){
        this.team2Score += score;
    }

    /**
     * Play the game. This might be one method or many method calls depending on your game.
     */
    public abstract void play();

    /**
     * When the game is over, use this method to declare and display a winning player.
     */
    public abstract void declareWinner();

}//end class
