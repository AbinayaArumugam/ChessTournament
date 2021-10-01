package com.company.tournament;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    static HashMap<Integer,Player> map=new HashMap<>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("-------CHESS TOURNAMENT--------");
        System.out.println("Enter the No.of Participants");
        int participants=in.nextInt();
        System.out.println("Enter the No of Matches");
        int matches=in.nextInt();
        List player=CreateTeam.createPlayers(participants);
        List list=CreateTeam.setMatch(player);
        CreateTeam.poolMatch(list);
    }
}
