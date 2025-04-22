package com.example.the_football_world_cup.table;

public class TeamTable {
    private int place;
    private String teamName;
    private int wins;
    private int losses;
    private int points;

    public TeamTable(int place, String teamName, int wins, int losses, int points) {
        this.place = place;
        this.teamName = teamName;
        this.wins = wins;
        this.losses = losses;
        this.points = points;
    }

    public int getPlace() {
        return place;
    }

    public String getTeamName() {
        return teamName;
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
