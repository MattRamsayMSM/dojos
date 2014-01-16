package com.moneysupermarket.bowling.model;

public class Game {
    private int currentFrameIndex;
    private Frame[] frames;

    public Game() {
        currentFrameIndex = 0;
        frames = new Frame[10];

        for(int i=0; i < frames.length; i++) {
            frames[i] = new Frame();
        }
    }

    public int getNumberOfFrames() {
        return frames.length;
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < 10; i++) {
            score += getFrameScore(i);
        }
        return score;
    }

    public int getFrameScore(int frameIndex) {
        Frame frame = getFrame(frameIndex);
        int frameScore = frame.getScoreForRoll(0) + frame.getScoreForRoll(1) + frame.getScoreForRoll(2);
        if (frameIndex < 9) {
            if (frame.isSpare() || frame.isStrike()) {
                Frame nextFrame = getFrame(frameIndex + 1);
                frameScore += nextFrame.getScoreForRoll(0);
                if (frame.isStrike()) {
                    if (frameIndex + 1 < 9 && nextFrame.isStrike()) {
                        nextFrame = getFrame(frameIndex + 2);
                        frameScore += nextFrame.getScoreForRoll(0);
                    } else {
                        frameScore += nextFrame.getScoreForRoll(1);
                    }
                }
            }
        }
        return frameScore;
    }

    public void roll(int pins) {
        getCurrentFrame().roll(pins);

        if (currentFrameIndex < 9) {
            if (getCurrentFrame().isStrike() || getCurrentFrame().getRoll() == 2) {
                currentFrameIndex++;
            }
        }
    }

    public int getFrameNo() {
        return currentFrameIndex + 1;
    }

    private Frame getCurrentFrame() {
        return frames[currentFrameIndex];
    }

    private Frame getFrame(int frameIndex) {
        return frames[frameIndex];
    }
}
