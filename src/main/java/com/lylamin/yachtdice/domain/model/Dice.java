package com.lylamin.yachtdice.domain.model;

/**
 * Dice
 */
public class Dice 
{
    public static int roll() {
        return (int) (Math.random() * 6) + 1;
    }

    public static int[] rollFive() {
        int[] dices = new int[5];

        for (int i = 0; i < 5; i++) {
            dices[i] = roll();
        }

        return dices;
    }
}
