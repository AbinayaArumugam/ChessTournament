package com.company.tournament;

public class Player {
    static int playerCount = 0;
    private int playerId;
    private String name;
    private int noOfMatches;
    private String win;
    private String  lose;
    private String  draw;
    private float point;
    private float currentRating;
    public Player(String name){
        this.name=name;
        playerCount+=1;
        playerId=playerCount;
        this.noOfMatches=0;
        this.win="";
        this.lose="";
        this.draw="";
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

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public String getLose() {
        return lose;
    }

    public void setLose(String lose) {
        this.lose = lose;
    }

    public String getDraw() {
        return draw;
    }

    public void setDraw(String draw) {
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
