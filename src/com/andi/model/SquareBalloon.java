package com.andi.model;

import com.andi.controller.ScoreAlgoBase;

public class SquareBalloon implements ScoreAlgoBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) +40;
    }
}
