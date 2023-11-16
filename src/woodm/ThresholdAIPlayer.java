/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Michael Wood
 * Created: 11/16/2023
 */
package woodm;

/**
 * A ThresholdAIPlayer is an AIPlayer with a threshold that determines if they will hold.
 */
public class ThresholdAIPlayer extends AIPlayer {
    private final int threshold;

    /**
     * Creates a ThresholdAIPlayer with a set threshold.
     * @param threshold the score that determines if a ThresholdAIPlayer will hold
     */
    public ThresholdAIPlayer(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean chooseToHold(int turnScore) {
        return turnScore >= this.threshold;
    }
}
