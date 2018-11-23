package com.retailbank.creditcheckservice;

public class CreditResponse {
    String score;

    public CreditResponse() {
    }

    public CreditResponse(String score) {
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
