package com.company;

public class GameOfLifeRun {

    public static void main(String[] args) {
        boolean[][] gameBoard = new boolean[10][10];
        GameOfLife gol = new GameOfLife(gameBoard);
        gol.setAlive(2,2, true);
        gol.print();
    }
}
