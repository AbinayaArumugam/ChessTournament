package com.company.tournament;

import java.util.*;

public class GeneratePoints {
    public static void generatePoints(List<Map.Entry<Integer,Player>> list) {
     float totalPoint=0;
     float oppTotal=0;
      Map<Integer,Player> map1=new HashMap<>();
        Random random = new Random();
        //  System.out.println(num);
        if(list.size()%2==0) {
            for (int i = 0; i < list.size(); i += 2) {
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
                totalPoint+=player.getPoint();
                oppTotal+=opponent.getPoint();
                player.setCurrentRating(totalPoint);
                opponent.setCurrentRating(oppTotal);
                map1.put(player.getPlayerId(),player);
                map1.put(opponent.getPlayerId(),opponent);
                System.out.println(list.get(i)+" ("+player.getPoint()+" : "+opponent.getPoint()+") "+list.get(i+1));
            }
        } else {
            for (int i = 0; i < list.size()-1; i += 2) {
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
                 totalPoint+=player.getPoint();
                oppTotal+=opponent.getPoint();
                player.setCurrentRating(totalPoint);
                opponent.setCurrentRating(oppTotal);
                map1.put(player.getPlayerId(),player);
                map1.put(opponent.getPlayerId(),opponent);
                System.out.println(list.get(i)+" ("+player.getPoint()+" : "+opponent.getPoint()+") "+list.get(i+1));
            }
            Player player=list.get(list.size()-1).getValue();
            player.setPoint(1);
            totalPoint+=player.getPoint();
            player.setCurrentRating(totalPoint);
            map1.put(player.getPlayerId(),player);
            System.out.println(list.get(list.size()-1)+" ("+player.getPoint()+" : "+"0"+ " )"+ "Bye");
        }
        List<Map.Entry<Integer,Player>> newList=new ArrayList<>(map1.entrySet());
        Main.map=map1;
    }
}
