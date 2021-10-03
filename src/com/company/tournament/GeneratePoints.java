package com.company.tournament;

import java.util.*;

public class GeneratePoints {
    CacheLayer cache=new CacheLayer();
    float totalPoint=0;
    float oppTotal=0;
    Map<Integer,Player> map1=new HashMap<>();
    Random random = new Random();
    public List<Map.Entry<Integer,Player>> generatePoints(List<Map.Entry<Integer,Player>> list) {
        if(list==null){
            return null;
        }
        int size=list.size();
        if(size%2==0) {
            points(list,size);
        } else {
            points(list,size-1);
            Player player=list.get(size-1).getValue();
            player.setPoint(1);
            totalPoint=player.getCurrentRating()+player.getPoint();
            player.setCurrentRating(totalPoint);
            map1.put(player.getPlayerId(),player);
            System.out.println(player+" ("+player.getPoint()+" : "+"0.0"+ " )"+ "Bye");
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
            if (num == 0) {
                player.setPoint(0);
                opponent.setPoint(1);
            } else if (num == 1) {
                player.setPoint(1);
                opponent.setPoint(0);
            } else {
                player.setPoint(0.5F);
                opponent.setPoint(0.5F);
            }
            totalPoint=player.getCurrentRating()+player.getPoint();
            oppTotal=opponent.getCurrentRating()+opponent.getPoint();
            player.setCurrentRating(totalPoint);
            opponent.setCurrentRating(oppTotal);
            map1.put(player.getPlayerId(),player);
            map1.put(opponent.getPlayerId(),opponent);
            System.out.println(player+" ("+player.getPoint()+" : "+opponent.getPoint()+") "+opponent);
        }
    }
}
