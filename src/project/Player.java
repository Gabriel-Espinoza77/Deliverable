/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author Gabriel Espinoza Nov 2020
 */
public class Player {

    private String name; //the unique name for this player

    /**
     * A constructor that allows you to set the player's unique ID
     */
    public Player() {
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
