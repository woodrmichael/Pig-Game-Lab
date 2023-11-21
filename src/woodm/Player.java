/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Michael Wood
 * Created: 11/16/2023
 */
package woodm;

/**
 * A player in the Game of Pig.
 */
public abstract class Player {
    private final String name;
    private int score;

    /**
     * Creates a player with a set name.
     * @param name The name of the player.
     */
    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    /**
     * Adds the score the player earned during their turn to their total score.
     * @param turnScore The score the player earned during their turn.
     */
    public void addToScore(int turnScore) {
        this.score += turnScore;
    }

    /**
     * Used to determine whether the player will hold.
     * @param turnScore The score the player earned during their turn.
     * @return true if the player is holding, false if the player isn't holding.
     */
    public abstract boolean chooseToHold(int turnScore);

    /**
     * Returns a formatted String which includes the players name and their score.
     * @return A formatted String of the players name and their score.
     */
    public String toString() {
        return "    " + this.getName() + " :   " + this.getScore();
    }
}
