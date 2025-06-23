package com.lylamin.yachtdice.application;

import java.util.Arrays;

import com.lylamin.yachtdice.Dice;

public class GameService {
    public void play() {
        System.out.println("🎲 Yahtzee Game Start!\n");

        int[] diceRoll = Dice.rollFive();
        System.out.println("Rolled Dice: " + Arrays.toString(diceRoll));
    }
}
