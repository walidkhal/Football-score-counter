package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA = 0;
    int scoreForTeamB = 0;
    int yellowCardsForTeamA = 0;
    int yellowCardsForTeamB = 0;
    int redCardsForTeamA = 0;
    int redCardsForTeamB = 0;
    int foulsForTeamA = 0;
    int foulsForTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamA(View view){
        scoreForTeamA += 1;
        display(R.id.score_team_a, scoreForTeamA);
        TextView txt = findViewById(R.id.score_team_a);
        txt.setText(String.valueOf(scoreForTeamA));
    }

    public void addOneForTeamB(View view){
        scoreForTeamB += 1;
        display(R.id.score_team_b, scoreForTeamB);
    }

    public void addYellowCardForTeamA(View view){
        yellowCardsForTeamA += 1;
        display(R.id.yellow_cards_a, yellowCardsForTeamA);
    }

    public void addYellowCardForTeamB(View view){
        yellowCardsForTeamB += 1;
        display(R.id.yellow_cards_b, yellowCardsForTeamB);
    }

    public void addRedCardForTeamA(View view){
        redCardsForTeamA += 1;
        display(R.id.red_cards_a, redCardsForTeamA);
    }

    public void addRedCardForTeamB(View view){
        redCardsForTeamB += 1;
        display(R.id.red_cards_b, redCardsForTeamB);
    }

    public void addFoulForTeamA(View view){
        foulsForTeamA += 1;
        display(R.id.fouls_team_a, foulsForTeamA);
    }

    public void addFoulForTeamB(View view){
        foulsForTeamB += 1;
        display(R.id.fouls_team_b, foulsForTeamB);
    }

    private void display(int textViewId, int numberToBeDisplayed){
        TextView txt = findViewById(textViewId);
        txt.setText(String.valueOf(numberToBeDisplayed));
    }

    public void reset(View view) {
        scoreForTeamA = 0;
        display(R.id.score_team_a, scoreForTeamA);
        scoreForTeamB = 0;
        display(R.id.score_team_b, scoreForTeamB);
        yellowCardsForTeamA = 0;
        display(R.id.yellow_cards_a, yellowCardsForTeamA);
        yellowCardsForTeamB = 0;
        display(R.id.yellow_cards_b, yellowCardsForTeamB);
        redCardsForTeamA = 0;
        display(R.id.red_cards_a, redCardsForTeamA);
        redCardsForTeamB = 0;
        display(R.id.red_cards_b, redCardsForTeamB);
        foulsForTeamA = 0;
        display(R.id.fouls_team_a, foulsForTeamA);
        foulsForTeamB = 0;
        display(R.id.fouls_team_b, foulsForTeamB);
    }
}
