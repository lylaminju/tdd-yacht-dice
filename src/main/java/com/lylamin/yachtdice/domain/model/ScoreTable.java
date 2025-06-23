package com.lylamin.yachtdice.domain.model;

import java.util.List;

public class ScoreTable {
    private final List<String> players;

    public ScoreTable(Player p1, Player p2) {
        this.players = List.of(p1.getName(), p2.getName());
    }

    public void print() {
        System.out.printf("%-15s", "");

        for (String player : players) {
            System.out.printf("%-8s", player);
        }

        System.out.println();
    }
}
