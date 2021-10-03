package com.company.tournament;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Map.Entry<Integer,Player>> list;
        Scanner in = new Scanner(System.in);
        System.out.println("-------CHESS TOURNAMENT--------");
        System.out.println("Enter the No.of Participants");
        int participants = in.nextInt();
        System.out.println("Enter the No of Matches");
        int matches = in.nextInt();
        int i = 1;
        CreateTeam team=new CreateTeam();
        GeneratePoints points=new GeneratePoints();
        List<Player> player = team.createPlayers(participants);
        while (i <= matches) {
            System.out.println("Round "+i);
            list= team.setMatch();
            team.poolMatch(list);
            list=points.generatePoints(list);
            System.out.println("Points After Round "+i);
            list=team.setMatch();
            team.displayTotalPoints(list);
            i++;
        }
    }
}
