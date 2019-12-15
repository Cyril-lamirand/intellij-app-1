package com.lamirandcyril.model;

public class SpecialNum {

    private double randomNumber = Math.random();
    private String roundNumber = String.valueOf(randomNumber);

    public String SpecialNum() {
        return roundNumber;
    }

    public String getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(String roundNumber) {
        this.roundNumber = roundNumber;
    }
}
