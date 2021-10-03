package com.company.tournament;

import java.util.*;

public class CreateTeam {
    CacheLayer cache=new CacheLayer();
    List<Player> players=new ArrayList<>();
    public List<Player> createPlayers(int noOfPlayers){
        for(int i=1;i<=noOfPlayers;i++){
            Player play =new Player("Player "+i);
            players.add(play);
        }
        cache.createMap(players);
        return players;
    }

   public List<Map.Entry<Integer,Player>> setMatch(){
       Map<Integer,Player> map1=cache.getMap();
       List<Map.Entry<Integer,Player>> list=new ArrayList<>(map1.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Player>>() {
            @Override
            public int compare(Map.Entry<Integer, Player> p1, Map.Entry<Integer, Player> p2) {
                float num1=p1.getValue().getCurrentRating();
                float num2=p2.getValue().getCurrentRating();
                if (num1>num2){
                    return -1;
                }else if (num1<num2){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
       return list;
    }
    public void poolMatch(List<Map.Entry<Integer,Player>> list){
        if (list!=null) {
            int size = list.size();
            if (size % 2 == 0) {
                match(list, size);
            } else {
                match(list, size - 1);
                System.out.println(list.get(list.size() - 1) + " vs " + "Bye");
            }
        }
    }
    public void match(List<Map.Entry<Integer,Player>> list, int size) {
        if (list!=null) {
            for (int i = 0; i < size; i += 2) {
                System.out.println(list.get(i) + " vs " + list.get(i + 1));
            }
        }
    }
    public void displayTotalPoints(List<Map.Entry<Integer,Player>> list){
        if(list!=null) {
            for (Map.Entry<Integer, Player> integerPlayerEntry : list) {
                Player player = integerPlayerEntry.getValue();
                System.out.println(player.getName() + "(" + player.getCurrentRating() + ")");
            }
        }
    }
    }


