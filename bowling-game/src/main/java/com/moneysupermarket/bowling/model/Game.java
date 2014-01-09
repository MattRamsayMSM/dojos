package com.moneysupermarket.bowling.model;

/**
 * Created with IntelliJ IDEA.
 * User: sully.rafiq
 * Date: 09/01/2014
 * Time: 13:45
 * To change this template use File | Settings | File Templates.
 */
public class Game {

    private int score;

    public Game() {
        score = 0;
    }

    public int getNumberOfFrames() {
        return 10;
    }

    public int getScore() {
        return score;
    }

    public void roll(int pins) {
        score += pins;
    }
}
