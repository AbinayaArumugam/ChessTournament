package com.company.tournament;

public class Player {
    static int playerCount = 0;
    private int playerId;
    private String name;
    private int noOfMatches;
    private int win;
    private int  lose;
    private int  draw;
    private float point;
    private float currentRating;
    public Player(String name){
        this.name=name;
        playerCount+=1;
        playerId=playerCount;
        this.noOfMatches=0;
        this.win=0;
        this.lose=0;
        this.draw=0;
        this.currentRating=0;
        this.point=0;
    }

    public static int getPlayerCount() {
        return playerCount;
    }

    public static void setPlayerCount(int playerCount) {
        Player.playerCount = playerCount;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfMatches() {
        return noOfMatches;
    }

    public void setNoOfMatches(int noOfMatches) {
        this.noOfMatches = noOfMatches;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public float getCurrentRating() {
        return currentRating;
    }

    public void setCurrentRating(float currentRating) {
        this.currentRating = currentRating;
    }

    public String toString(){
        return name;
   }


}
