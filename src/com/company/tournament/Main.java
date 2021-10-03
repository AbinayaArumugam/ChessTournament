package com.company.tournament;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Map.Entry<Integer, Player>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("-------CHESS TOURNAMENT--------");
        System.out.println("Enter the No.of Participants");
        int participants = in.nextInt();
        System.out.println("Enter the No of Matches");
        int matches = in.nextInt();
        int i = 1;
        CreateTeam team = new CreateTeam();
        GeneratePoints points = new GeneratePoints();
        List<Player> player = team.createPlayers(participants);
        while (i <= matches) {
            System.out.println("Round " + i);
            list = team.setMatch();
            team.poolMatch(list);
            List newList = points.generatePoints(list);
            System.out.println("Points After Round " + i);
            list = team.setMatch();
            team.displayTotalPoints(list);
            i++;
        }

        for (Map.Entry<Integer, Player> integerPlayerEntry : list) {
            Player play1 = integerPlayerEntry.getValue();
            List<Match> matchList = play1.getMatchList();
            for (Match match : matchList) {
                System.out.println(play1.getName() + match);
            }
        }
    }
}
