package com.andi.controller;

public class ScoreBoard {

    public ScoreAlgoBase algoBase;

    public void showScore(int taps, int multiplier) {
        System.out.println(algoBase.calculateScore(taps, multiplier));
    }

    public ScoreBoard(ScoreAlgoBase algoBase) {
        this.algoBase = algoBase;
    }
}
