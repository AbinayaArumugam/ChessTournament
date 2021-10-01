package com.company.tournament;

import java.util.*;

import static java.util.Collections.*;

public class CreateTeam {
   static List<Player> players=new ArrayList<>();
    public static List createPlayers(int noOfPlayers){
        for(int i=1;i<=noOfPlayers;i++){
            Player play =new Player("Player "+i);
            Main.map.put(play.getPlayerId(), play);
            players.add(play);
        }
        System.out.println(Main.map);
        return players;
    }
   public static List setMatch(List<Player> players){
        List<Map.Entry<Integer,Player>> list=new ArrayList<>(Main.map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Player>>() {
            @Override
            public int compare(Map.Entry<Integer, Player> p1, Map.Entry<Integer, Player> p2) {
                float num1=p1.getValue().getPoint();
                float num2=p2.getValue().getPoint();
                if (num1>num2){
                    return -1;
                }else if (num1>num2){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
       return list;
    }
    public static void poolMatch(List<Map.Entry<Integer,Player>> list){
        for (int i=1;i<list.size();i+=2){
            System.out.println(list.get(i)+" vs "+list.get(i+1));
        }
    }

}
