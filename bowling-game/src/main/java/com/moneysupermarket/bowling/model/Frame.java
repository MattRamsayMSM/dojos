package com.moneysupermarket.bowling.model;

/**
 * Created by matt on 10/01/14.
 */
public class Frame {

    private int roll;
    private int[] scores;

    public Frame() {
        this.scores = new int[3];
        this.roll = 0;
    }

    public void roll(int pins) {
        scores[roll] = pins;
        roll++;
    }

    public int getRoll() {
        return roll;
    }

    public int getScoreForRoll(int roll) {
        return scores[roll];
    }

    public boolean isStrike() {
        return scores[0] == 10;
    }

    public boolean isSpare() {
        return isStrike() ? false : scores[0] + scores[1] == 10;
    }
}
