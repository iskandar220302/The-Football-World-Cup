package com.example.the_football_world_cup;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.the_football_world_cup.champ.championship_Activity;
import com.example.the_football_world_cup.match.Match_Activity;
import com.example.the_football_world_cup.table.table_Activity;
import com.example.the_football_world_cup.team.team_Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        boolean isFirstLaunch = prefs.getBoolean("isFirstLaunch", true);

        if (isFirstLaunch) {
            // Запоминаем, что авторизация уже была
            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("isFirstLaunch", false);
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD) {
                editor.apply();
            }

            // Запуск LoginActivity
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish(); // Закрываем текущую MainActivity
            return;   // Выходим из метода, чтобы setContentView не сработал
        }

        setContentView(R.layout.activity_main); // Показываем основное меню
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