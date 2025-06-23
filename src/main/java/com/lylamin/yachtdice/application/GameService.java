package com.lylamin.yachtdice.application;

import java.util.Arrays;

import com.lylamin.yachtdice.domain.model.Dice;
import com.lylamin.yachtdice.domain.model.Player;
import com.lylamin.yachtdice.domain.model.ScoreTable;

public class GameService {
    private final Player player1 = new Player("P1");
    private final Player player2 = new Player("P2");
    
    public void play() {
        System.out.println("🎲 Yahtzee Game Start!\n");

        int[] diceRoll = Dice.rollFive();
        System.out.println("Rolled Dice: " + Arrays.toString(diceRoll));

        ScoreTable scoreTable = new ScoreTable(player1, player2);
        scoreTable.print();
    }
}
