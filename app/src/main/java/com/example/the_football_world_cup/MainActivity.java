package com.example.the_football_world_cup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.the_football_world_cup.ui.champ.championship_Activity;
import com.example.the_football_world_cup.ui.match.Match_Activity;
import com.example.the_football_world_cup.ui.table.table_Activity;
import com.example.the_football_world_cup.ui.team.team_Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void championshipActivity(View v) {
        Intent champIntent = new Intent(this, championship_Activity.class);
        startActivity(champIntent);
    }

    public void teamsActivity(View v) {
        Intent teamsIntent = new Intent(this, team_Activity.class);
        startActivity(teamsIntent);
    }

    public void tableActivity(View v) {
        Intent tableIntent = new Intent(this, table_Activity.class);
        startActivity(tableIntent);
    }

    public void matchActivity(View v) {
        Intent matchIntent = new Intent(this, Match_Activity.class);
        startActivity(matchIntent);
    }
}