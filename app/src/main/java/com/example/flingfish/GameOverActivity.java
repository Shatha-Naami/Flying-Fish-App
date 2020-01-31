package com.example.flingfish;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GameOverActivity extends AppCompatActivity {

    Button startGameAgain;
    TextView displayScore;
    String score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        displayScore = findViewById(R.id.display_score);
        score = getIntent().getExtras().get("score").toString();

        startGameAgain = findViewById(R.id.play_again);
        startGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GameOverActivity.this, MainActivity.class));
            }
        });

        displayScore.setText("Total Score = " + score);
    }
}
