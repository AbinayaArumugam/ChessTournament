package com.company.tournament;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class TotalPoints {
    public static List displayTotalPoints(List<Map.Entry<Integer,Player>> list){
        Collections.sort(list, new Comparator<Map.Entry<Integer, Player>>() {
            @Override
            public int compare(Map.Entry<Integer, Player> p1, Map.Entry<Integer, Player> p2) {
                float num1=p1.getValue().getCurrentRating();
                float num2=p2.getValue().getCurrentRating();
                if (num1>num2){
                    return -1;
                }else if (num1>num2){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        for (int i=0;i<list.size();i++){
            Player player=list.get(i).getValue();
            System.out.println(player.getName()+ "("+player.getCurrentRating()+")");
        }
        return list;
    }
}
