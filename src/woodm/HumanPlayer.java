/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Michael Wood
 * Created: 11/16/2023
 */
package woodm;

import java.util.Scanner;

/**
 * A HumanPlayer is a Player which a real person can control.
 */
public class HumanPlayer extends Player {
    private final Scanner in;

    /**
     * Creates a HumanPlayer with a set name and has a Scanner.
     * @param name The name of the HumanPlayer.
     * @param in A Scanner used to take user input.
     */
    public HumanPlayer(String name, Scanner in) {
        super(name);
        this.in = in;
    }
    @Override
    public boolean chooseToHold(int turnScore) {
        String choice;
        do {
            System.out.println("Hold? [y/n]");
            choice = in.nextLine();
        } while(!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n"));
        return choice.equalsIgnoreCase("y");
    }
}
