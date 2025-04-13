package com.example.the_football_world_cup;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // XML с двумя кнопками

        Button userButton = findViewById(R.id.btnUser);
        Button moderatorButton = findViewById(R.id.btnModerator);

        userButton.setOnClickListener(v -> loginAs("user"));
        moderatorButton.setOnClickListener(v -> loginAs("moderator"));
    }

    private void loginAs(String role) {
        SharedPreferences prefs = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("userRole", role);
        editor.apply();

        // Переход в главное меню
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
