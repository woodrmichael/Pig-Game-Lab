/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Michael Wood
 * Created: 11/16/2023
 */
package woodm;

/**
 * An AI Player is a computer Controlled Player.
 */
public abstract class AIPlayer extends Player {
    private static int numberOfAIPlayers = 0;

    /**
     * Creates an AI Player with a Name BOT# + numberOfAIPlayers.
     */
    public AIPlayer() {
        super("BOT#" + numberOfAIPlayers);
        numberOfAIPlayers++;
    }
}
