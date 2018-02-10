package com.example.android.chessscore;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.chessscore.R;

public class MainActivity extends AppCompatActivity {
    int scoreWhite = 39;
    int scoreBlack = 39;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }


    public void displayForWhite(int score) {
        TextView scoreView = (TextView) findViewById(R.id.white_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForBlack(int score) {
        TextView scoreView = (TextView) findViewById(R.id.black_score);
        scoreView.setText(String.valueOf(score));
    }

    public void white_pawn(View view) {
        if (scoreWhite > 0) {
            scoreWhite = scoreWhite - 1;
            displayForWhite(scoreWhite);
        }
    }

    public void white_knight(View view) {
        if (scoreWhite > 0) {
            scoreWhite = scoreWhite - 3;
            displayForWhite(scoreWhite);
        }
    }

    public void white_bishop(View view) {
        if (scoreWhite > 0) {
            scoreWhite = scoreWhite - 3;
            displayForWhite(scoreWhite);
        }
    }

    public void white_rook(View view) {
        if (scoreWhite > 0) {
            scoreWhite = scoreWhite - 5;
            displayForWhite(scoreWhite);
        }
    }

    public void white_queen(View view) {
        if (scoreWhite > 0) {
            scoreWhite = scoreWhite - 9;
            displayForWhite(scoreWhite);
        }
    }

    public void black_pawn(View view) {
        if (scoreBlack > 0) {
            scoreBlack = scoreBlack - 1;
            displayForBlack(scoreBlack);
        }
    }

    public void black_knight(View view) {
        if (scoreBlack > 0) {
            scoreBlack = scoreBlack - 3;
            displayForBlack(scoreBlack);
        }
    }

    public void black_bishop(View view) {
        if (scoreBlack > 0) {
            scoreBlack = scoreBlack - 3;
            displayForBlack(scoreBlack);
        }
    }

    public void black_rook(View view) {
        if (scoreBlack > 0) {
            scoreBlack = scoreBlack - 5;
            displayForBlack(scoreBlack);
        }
    }

    public void black_queen(View view) {
        if (scoreBlack > 0) {
            scoreBlack = scoreBlack - 9;
            displayForBlack(scoreBlack);
        }
    }

    public void button_reset(View view) {
        scoreWhite = 39;
        displayForWhite(scoreWhite);
        scoreBlack = 39;
        displayForBlack(scoreBlack);
    }

    public void button_white_advance(View view) {
        scoreWhite = scoreWhite + 1;
        displayForWhite(scoreWhite);
    }

    public void button_black_advance(View view) {
        scoreBlack = scoreBlack + 1;
        displayForBlack(scoreBlack);
    }

}
