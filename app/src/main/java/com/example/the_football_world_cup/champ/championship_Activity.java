package com.example.the_football_world_cup.champ;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_football_world_cup.R;

import java.util.ArrayList;
import java.util.List;

public class championship_Activity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ChampionshipAdapter adapter;
    private List<Championship> championshipList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_championship); // подключаем XML с RecyclerView

        recyclerView = findViewById(R.id.championshipRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        championshipList = getChampionships(); // загружаем данные

        adapter = new ChampionshipAdapter(championshipList);
        recyclerView.setAdapter(adapter);
    }

    private List<Championship> getChampionships() {
        List<Championship> list = new ArrayList<>();

        // Здесь добавь свои данные
        list.add(new Championship("2022", "Катар", "Аргентина"));
        list.add(new Championship("2018", "Россия", "Франция"));
        list.add(new Championship("2014", "Бразилия", "Германия"));
        list.add(new Championship("2010", "ЮАР", "Испания"));
        list.add(new Championship("2006", "Германия", "Италия"));

        return list;
    }
}