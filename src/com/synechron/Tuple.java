package com.synechron;

public class Tuple {
    private int userId;
    private int score;
    private String username;

    public Tuple(int userId, int score) {
        this.userId = userId;
        this.score = score;
    }

    public Tuple(int score, String username) {
        this.username = username;
        this.score = score;
    }

    public String getUserName() {
        return username;
    }
    public int getUserId() {
        return userId;
    }

    public int getScore() {
        return score;
    }
}


