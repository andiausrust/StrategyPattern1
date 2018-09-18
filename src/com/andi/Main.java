package com.andi;

import com.andi.controller.ScoreBoard;
import com.andi.model.Balloon;
import com.andi.model.Clown;
import com.andi.model.SquareBalloon;

public class Main {

    public static void main(String[] args) {

        ScoreBoard scoreBoard = new ScoreBoard(new Balloon());
        System.out.print("Balloon: ");
        scoreBoard.showScore(10,5);

        ScoreBoard scoreBoard1 = new ScoreBoard(new Clown());
        System.out.print("Clown: ");
        scoreBoard.showScore(10,5);

        ScoreBoard scoreBoard2 = new ScoreBoard(new SquareBalloon());
        System.out.print("SqaureBalloon: ");
        scoreBoard.showScore(10,5);
    }
}
