package com.company.tournament;

import java.util.*;

public class GeneratePoints {
    CacheLayer cache=new CacheLayer();
    Match match=new Match();
    Match oppMatch=new Match();
    float totalPoint=0;
    float oppTotal=0;
    Map<Integer,Player> map1=new HashMap<>();
    Random random = new Random();
    Player player=new Player();


    public List<Map.Entry<Integer,Player>> generatePoints(List<Map.Entry<Integer,Player>> list) {

        if(list==null){
            return null;
        }
        int size=list.size();
        if(size%2==0) {
            points(list,size);
        } else {
            points(list,size-1);
            Player play=list.get(size-1).getValue();
            List<Match> matchList=play.getMatchList();
            if (matchList==null){
                matchList=new ArrayList<>();
            }
             setBye(play);
            totalPoint=play.getCurrentRating()+play.getPoint();
            play.setCurrentRating(totalPoint);
            matchList.add(match);
            player.setMatchList(matchList);
            map1.put(play.getPlayerId(),play);
            System.out.println(play+" ("+play.getPoint()+" : "+"0.0"+ " )"+ "Bye");
        }
        List<Map.Entry<Integer,Player>> newList=new ArrayList<>(map1.entrySet());
        Map<Integer,Player> playerMap=cache.getMap();
        playerMap=map1;
        return newList;
    }
    public void points(List<Map.Entry<Integer,Player>> list,int size){
        for (int i = 0; i < size; i += 2) {
            int num = random.nextInt(3);
            Player player = list.get(i).getValue();
            Player opponent=list.get(i+1).getValue();
            List<Match> matchList=player.getMatchList();
            List<Match> matchList1=opponent.getMatchList();
            if (matchList==null){
                matchList=new ArrayList<>();
            }
            if (matchList1==null){
                matchList1=new ArrayList<>();
            }
            if (num == 0) {
              setWinner(player,opponent);
            } else if (num == 1) {
               setLoser(player,opponent);
            } else {
              setDraw(player,opponent);
            }
            oppMatch.setOpponentName(opponent.getName());
            totalPoint=player.getCurrentRating()+player.getPoint();
            oppTotal=opponent.getCurrentRating()+opponent.getPoint();
            player.setCurrentRating(totalPoint);
            opponent.setCurrentRating(oppTotal);
            matchList.add(match);
            matchList1.add(oppMatch);
            player.setMatchList(matchList);
            opponent.setMatchList(matchList1);
            map1.put(player.getPlayerId(),player);
            map1.put(opponent.getPlayerId(),opponent);
            System.out.println(player+" ("+player.getPoint()+" : "+opponent.getPoint()+") "+opponent);
        }
    }
    public void setWinner(Player player,Player opponent){
        player.setPoint(0);
        match.setMatchPoint(0);
        opponent.setPoint(1);
        match.setOpponentPoint(1);
        match.setResult("Lose");
        oppMatch.setMatchPoint(1);
        oppMatch.setOpponentPoint(0);
        oppMatch.setResult("Win");
        match.setOpponentName(opponent.getName());
        oppMatch.setOpponentName(player.getName());
    }
    public void setLoser(Player player,Player opponent){
        player.setPoint(1);
        match.setMatchPoint(1);
        oppMatch.setMatchPoint(0);
        opponent.setPoint(0);
        match.setOpponentPoint(0);
        oppMatch.setOpponentPoint(0);
        match.setResult("Win");
        oppMatch.setResult("Lose");
        match.setOpponentName(opponent.getName());
        oppMatch.setOpponentName(player.getName());
    }
    public void setDraw(Player player,Player opponent){
        player.setPoint(0.5F);
        match.setMatchPoint(0.5F);
        oppMatch.setMatchPoint(0.5F);
        opponent.setPoint(0.5F);
        match.setOpponentPoint(0.5F);
        oppMatch.setOpponentPoint(0.5F);
        match.setResult("Draw");
        oppMatch.setResult("Draw");
        match.setOpponentName(opponent.getName());
        oppMatch.setOpponentName(player.getName());
    }
    public void setBye(Player play){
        play.setPoint(1);
        match.setMatchPoint(1);
        match.setOpponentName("Bye");
        match.setOpponentPoint(0);
        match.setResult("win");
    }
}
