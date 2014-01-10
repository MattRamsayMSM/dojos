package com.moneysupermarket.bowling.model;

/**
 * Created by matt on 10/01/14.
 */
public class Frame {

    private int numberOfPins;
    private int roll;
    private int[] scores;

    public Frame() {
        numberOfPins = 10;
        scores = new int[3];
        roll = 0;
    }

    public void roll(int numberOfPins) {
        scores[roll] = numberOfPins;
        roll++;
    }

    public int getRoll() {
        return roll;
    }

    public int getScoreForRoll(int roll) {
        return scores[roll];
    }
}
