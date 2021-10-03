package com.company.tournament;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheLayer {
      private Map<Integer,Player> map=new HashMap<>();
    public  void createMap(List<Player> players){
        if(players!=null) {
            for (Player player : players) {
                map.put(player.getPlayerId(), player);
            }
        }
    }
    public Map<Integer,Player> getMap(){
        return map;
    }
}
