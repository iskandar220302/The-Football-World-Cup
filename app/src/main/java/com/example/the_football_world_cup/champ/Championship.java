package com.example.the_football_world_cup.champ;

public class Championship {
    private String year; // год проведения ЧМ
    private String country; // место проведения ЧМ
    private String winner; // победитель турнира

    public Championship(String year, String country, String winner){
        this.year = year;
        this.winner = winner;
        this.country = country;
    }

    public String getYear(){
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getWinner() {
        return winner;
    }
}
