package com.example.the_football_world_cup.table;

public class table {
    private int place_table;
    private String name_team;
    private int wins;
    private int losses;
    private int points;

    public table(int place_table, String name_team, int wins, int losses, int points){
        this.place_table = place_table;
        this.name_team = name_team;
        this.wins = wins;
        this.losses = losses;
        this.points = points;
    }

    public int getPlace_table() {
        return place_table;
    }

    public String getName_team() {
        return name_team;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getPoints() {
        return points;
    }
}
