package com.codecool.barazutti.demo;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String Name;
    private int points;
    private List<Player> members = new ArrayList<>();

    public Team(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public int getPoints(){
        return this.points;
    }

    public boolean addPlayer(Player player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " is successfully added");
            return true;
        }
    }

}
