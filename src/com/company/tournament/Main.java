package com.company.tournament;

import java.util.*;

public class Main {
      static Map<Integer,Player> map=new HashMap<>();
      static List list=new ArrayList();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-------CHESS TOURNAMENT--------");
        System.out.println("Enter the No.of Participants");
        int participants = in.nextInt();
        System.out.println("Enter the No of Matches");
        int matches = in.nextInt();
        int i = 1;
        List player = CreateTeam.createPlayers(participants);
        list = CreateTeam.setMatch(player);
        while (i <= matches) {
            System.out.println("Round "+i);
            CreateTeam.poolMatch(list);
            List list1=GeneratePoints.generatePoints(list);
            System.out.println("Points After Round "+i);
            list=TotalPoints.displayTotalPoints(list1);
            System.out.println("newList "+list);
            i++;
        }
    }
}
