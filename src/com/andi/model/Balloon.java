package com.andi.model;

import com.andi.controller.ScoreAlgoBase;

public class Balloon implements ScoreAlgoBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}

