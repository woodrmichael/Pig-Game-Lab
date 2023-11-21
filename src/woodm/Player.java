/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Michael Wood
 * Created: 11/16/2023
 */
package woodm;

public abstract class Player {
    private final String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public void addToScore(int turnScore) {
        this.score += turnScore;
    }

    public abstract boolean chooseToHold(int turnScore);

    public String toString() {
        return "    " + this.getName() + " :   " + this.getScore();
    }
}
