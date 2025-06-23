package com.lylamin.yachtdice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Unit test for Dice.
 */
class DiceTest 
{
    @Test
    void dice_number_is_between_1_and_6() {
        // given, when
        int result = Dice.roll();

        // then
        assertThat(result).isBetween(1, 6);
    }

    @Test
    void roll_five_dices() {
        // given, when
        int[] result = Dice.rollFive();

        // then
        assertThat(result).hasSize(5);
    }
}
