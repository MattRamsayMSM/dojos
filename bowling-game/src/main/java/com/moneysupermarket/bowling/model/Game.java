package com.moneysupermarket.bowling.model;

public class Game {

    private int score;
    private int currentFrame;
    private Frame[] frames;

    public Game() {
        score = 0;
        currentFrame = 0;
        frames = new Frame[10];

        for(int i=0; i < frames.length; i++) {
            frames[i] = new Frame();
        }
    }

    public int getNumberOfFrames() {
        return frames.length;
    }

    public int getScore() {
        return score;
    }

    public void roll(int pins) {
        score += pins;
        frames[currentFrame].roll(pins);

        addSpareBonus(pins);
        addStrikeBonus(pins);

        if (pins == 10 && frames[currentFrame].getRoll() == 1 || frames[currentFrame].getRoll() == 2) {
            currentFrame++;
        }
    }

    public int getFrameNo() {
        return currentFrame + 1;
    }

    private void addSpareBonus(int pins) {
        if (currentFrame > 0) {
            Frame prevFrame = frames[currentFrame - 1];
            if (prevFrame.getScoreForRoll(0) < 10 && prevFrame.getScoreForRoll(0) + prevFrame.getScoreForRoll(1) == 10) {
                score += pins;
            }
        }
    }

    private void addStrikeBonus(int pins) {
        if (currentFrame > 0) {
            Frame prevFrame = frames[currentFrame - 1];
            if (prevFrame.getScoreForRoll(0) == 10) {
                score += pins;
            }
        }
    }


}
