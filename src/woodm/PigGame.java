/*
 * Course: CSC1110 - 111
 * Fall 2023
 * Lab 12 - The Game of Pig
 * Name: Michael Wood
 * Created: 11/16/2023
 */
package woodm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Game of Pig. The first player to obtain 100 points wins.
 */
public class PigGame {
    private final Die die;
    private final List<Player> players;

    /**
     * Creates a Pig Game with an ArrayList of the players.
     * Initializes a Die with the default number of sides of 6.
     */
    public PigGame() {
        this.players = new ArrayList<>();
        this.die = new Die();
    }

    /**
     * Adds a player to the ArrayList of players.
     * @param player The player that is being added to the game.
     */
    public void addPlayer(Player player) {
        this.players.add(player);
    }

    /**
     * Plays the game.
     * @return The winner of the game.
     */
    public Player playGame() {
        Collections.shuffle(this.players);
        boolean hasWon = false;
        final int winningScore = 100;
        Player winner = null;
        do {
            for (Player player : this.players) {
                if (winner == null) {
                    this.takeTurn(player);
                    if (player.getScore() >= winningScore) {
                        hasWon = true;
                        winner = player;
                    }
                }
            }
        } while(!hasWon);
        return winner;
    }

    /**
     * Returns a formatted string of the scoreboard.
     * @return The scoreboard of the current game.
     */
    public String toString() {
        String str = "";
        for(int i = 0; i < this.players.size(); i++) {
            str += players.get(i);
            if(i != this.players.size() - 1) {
                str += "\n";
            }
        }
        return str;
    }

    private void takeTurn(Player player) {
        boolean holding = false;
        int turnScore = 0;
        System.out.println(this);
        do {
            die.roll();
            System.out.println(player.getName() + " rolled a " + die.getSideUp());
            if(die.getSideUp() == 1) {
                System.out.println(player.getName() + " busts.");
                holding = true;
            } else {
                turnScore += die.getSideUp();
                if(player.chooseToHold(turnScore)) {
                    System.out.println(player.getName() + " holds.");
                    player.addToScore(turnScore);
                    holding = true;
                }
            }
        } while(!holding);
    }
}