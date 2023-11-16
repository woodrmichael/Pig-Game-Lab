/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Michael Wood
 * Created: 11/16/2023
 */
package woodm;

import java.util.Random;

/**
 * A Die that has a set number of sides and can roll one of those sides at random.
 */
public class Die {
    private static final int MIN_SIDES = 2;
    private static final int MAX_SIDES = 100;
    private static final int DEFAULT_SIDES = 6;
    private static final Random GENERATOR = new Random();
    private final int numSides;
    private int currentValue;

    /**
     * Creates a Die with the Default Sides 6.
     */
    public Die() {
        this.numSides = DEFAULT_SIDES;
    }

    /**
     * Creates a Die with sides numSides,
     * as long as it is greater than MIN_SIDES and less than MAX_SIDES.
     * @param numSides The number of sides the Die will have.
     */
    public Die(int numSides) {
        if(numSides < MIN_SIDES || numSides > MAX_SIDES) {
            this.numSides = DEFAULT_SIDES;
        } else {
            this.numSides = numSides;
        }
    }

    public int getSideUp() {
        return this.currentValue;
    }

    /**
     * Rolls the Die and sets currentValue to a random value between 1 and numSides.
     */
    public void roll() {
        this.currentValue = GENERATOR.nextInt(this.numSides) + 1;
    }
}
