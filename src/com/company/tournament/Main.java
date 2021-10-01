package com.company.tournament;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
      static Map<Integer,Player> map=new HashMap<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-------CHESS TOURNAMENT--------");
        System.out.println("Enter the No.of Participants");
        int participants = in.nextInt();
        System.out.println("Enter the No of Matches");
        int matches = in.nextInt();
        int i = 1;
        List player = CreateTeam.createPlayers(participants);
        while (i <= matches) {
            System.out.println("Round "+i);
            List list = CreateTeam.setMatch(player);
            CreateTeam.poolMatch(list);
            GeneratePoints.generatePoints(list);
            i++;
        }
    }
}
