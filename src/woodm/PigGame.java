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

public class PigGame {
    private final Die die;
    private final List<Player> players;

    public PigGame() {
        this.players = new ArrayList<>();
        this.die = new Die();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public Player playGame() {
        Collections.shuffle(this.players);
        boolean hasWon = false;
        final int winningScore = 100;
        Player currentPlayer = null;
        Player winner = null;
        do {
            for(int i = 0; i < this.players.size(); i++) {
                if(winner == null) {
                    currentPlayer = this.players.get(i);
                    this.takeTurn(currentPlayer);
                    if(currentPlayer.getScore() >= winningScore) {
                        hasWon = true;
                        winner = currentPlayer;
                    }
                }
            }
        } while(!hasWon);
        return winner;
    }

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