package com.example.the_football_world_cup.table;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.the_football_world_cup.R;

import java.util.ArrayList;
import java.util.List;

public class table_Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    TableAdapter adapter;
    List<TeamTable> tableList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String role = prefs.getString("userRole", "moderator");

        Button btnAddTeam = findViewById(R.id.btnAddTeam);

        if (role.equals("moderator") || role.equals("journalist")) {
            btnAddTeam.setVisibility(View.VISIBLE);
        }

        recyclerView = findViewById(R.id.recyclerTable);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        tableList = new ArrayList<>();
        tableList.add(new TeamTable(1, "Аргентина", 3, 0, 9));
        tableList.add(new TeamTable(2, "Франция", 2, 1, 6));
        tableList.add(new TeamTable(3, "Бразилия", 1, 2, 3));
        tableList.add(new TeamTable(4, "Германия", 0, 3, 0));

        adapter = new TableAdapter(tableList);
        recyclerView.setAdapter(adapter);
    }
}
