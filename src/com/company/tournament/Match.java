package com.company.tournament;

public class Match {
    private String  opponentName;
    private String result;
    private  float matchPoint;
    private float opponentPoint;

    public String getOpponentName() {
        return opponentName;
    }

    public void setOpponentName(String opponentName) {
        this.opponentName = opponentName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public float getMatchPoint() {
        return matchPoint;
    }

    public void setMatchPoint(float matchPoint) {
        this.matchPoint = matchPoint;
    }

    public float getOpponentPoint() {
        return opponentPoint;
    }

    public void setOpponentPoint(float opponentPoint) {
        this.opponentPoint = opponentPoint;
    }
    public String toString(){
       return "Match{" +"result= "+result+'\''+", opponentPoint="+opponentPoint+", opponentName='"+opponentName+'\''+'}';
    }
}
