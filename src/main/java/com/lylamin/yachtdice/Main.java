package com.lylamin.yachtdice;

import com.lylamin.yachtdice.application.GameService;

public class Main {
    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.play();
    }
}
