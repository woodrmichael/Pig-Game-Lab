/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Michael Wood
 * Created: 11/16/2023
 */
package woodm;

/**
 * A DumbAIPlayer is an AIPlayer that has a 50% chance of holding.
 */
public class DumbAIPlayer extends AIPlayer {
    private final Die coin;

    /**
     * Creates a DumbAIPlayer that has a coin with numSides 2.
     */
    public DumbAIPlayer() {
        this.coin = new Die(2);
    }

    @Override
    public boolean chooseToHold(int turnScore) {
        this.coin.roll();
        return this.coin.getSideUp() == 1;
    }
}
