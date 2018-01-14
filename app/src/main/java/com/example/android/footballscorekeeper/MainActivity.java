package com.example.android.footballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA = 0;          //goals for team A
    int scoreForTeamB = 0;          //goals for team B
    int yellowCardsForTeamA = 0;    //yellow cards for team A
    int yellowCardsForTeamB = 0;    //yellow cards for team B
    int redCardsForTeamA = 0;       //red cards for team A
    int redCardsForTeamB = 0;       //red cards for team B
    int foulsForTeamA = 0;          //fouls for team A
    int foulsForTeamB = 0;          //fouls for team B

    // constants for save app state during rotation
    private static final String SCORE_FOR_TEAM_A = "scoreForTeamA";
    private static final String SCORE_FOR_TEAM_B = "scoreForTeamB";
    private static final String YELLOW_CARDS_FOR_TEAM_A = "yellowCardsForTeamA";
    private static final String YELLOW_CARDS_FOR_TEAM_B = "yellowCardsForTeamB";
    private static final String RED_CARDS_FOR_TEAM_A = "redCardsForTeamA";
    private static final String RED_CARDS_FOR_TEAM_B = "redCardsForTeamB";
    private static final String FOULS_FOR_TEAM_A = "foulsForTeamA";
    private static final String FOULS_FOR_TEAM_B = "foulsForTeamB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // remove app title bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        // restore the score after rotating the screen
        if (savedInstanceState != null) {
            scoreForTeamA = savedInstanceState.getInt(SCORE_FOR_TEAM_A, 0);
            scoreForTeamB = savedInstanceState.getInt(SCORE_FOR_TEAM_B, 0);
            yellowCardsForTeamA = savedInstanceState.getInt(YELLOW_CARDS_FOR_TEAM_A, 0);
            yellowCardsForTeamB = savedInstanceState.getInt(YELLOW_CARDS_FOR_TEAM_B, 0);
            redCardsForTeamA = savedInstanceState.getInt(RED_CARDS_FOR_TEAM_A, 0);
            redCardsForTeamB = savedInstanceState.getInt(RED_CARDS_FOR_TEAM_B, 0);
            foulsForTeamA = savedInstanceState.getInt(FOULS_FOR_TEAM_A, 0);
            foulsForTeamB = savedInstanceState.getInt(FOULS_FOR_TEAM_B, 0);
        }

        // Displaying the score after rotating the screen
        display(R.id.score_team_a, scoreForTeamA);
        display(R.id.score_team_b, scoreForTeamB);
        display(R.id.yellow_cards_a, yellowCardsForTeamA);
        display(R.id.yellow_cards_b, yellowCardsForTeamB);
        display(R.id.red_cards_a, redCardsForTeamA);
        display(R.id.red_cards_b, redCardsForTeamB);
        display(R.id.fouls_team_a, foulsForTeamA);
        display(R.id.fouls_team_b, foulsForTeamB);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // call the super method so that the states of our views are saved
        super.onSaveInstanceState(outState);
        // Save the app state
        outState.putInt(SCORE_FOR_TEAM_A, scoreForTeamA);
        outState.putInt(SCORE_FOR_TEAM_B, scoreForTeamB);
        outState.putInt(YELLOW_CARDS_FOR_TEAM_A, yellowCardsForTeamA);
        outState.putInt(YELLOW_CARDS_FOR_TEAM_B, yellowCardsForTeamB);
        outState.putInt(RED_CARDS_FOR_TEAM_A, redCardsForTeamA);
        outState.putInt(RED_CARDS_FOR_TEAM_B, redCardsForTeamB);
        outState.putInt(FOULS_FOR_TEAM_A, foulsForTeamA);
        outState.putInt(FOULS_FOR_TEAM_B, foulsForTeamB);

    }

    /*
     * add one goal for team A
     */
    public void addOneForTeamA(View view) {
        scoreForTeamA += 1;
        display(R.id.score_team_a, scoreForTeamA);
        TextView txt = findViewById(R.id.score_team_a);
        txt.setText(String.valueOf(scoreForTeamA));
    }

    /*
    * add one goal for team B
    */
    public void addOneForTeamB(View view) {
        scoreForTeamB += 1;
        display(R.id.score_team_b, scoreForTeamB);
    }

    /*
     * add one yellow card for team A
     */
    public void addYellowCardForTeamA(View view) {
        yellowCardsForTeamA += 1;
        display(R.id.yellow_cards_a, yellowCardsForTeamA);
    }

    /*
     * add one yellow card for team B
     */
    public void addYellowCardForTeamB(View view) {
        yellowCardsForTeamB += 1;
        display(R.id.yellow_cards_b, yellowCardsForTeamB);
    }
    /*
     * add one red card for team A
     */

    public void addRedCardForTeamA(View view) {
        redCardsForTeamA += 1;
        display(R.id.red_cards_a, redCardsForTeamA);
    }

    /*
     * add one red card for team B
     */
    public void addRedCardForTeamB(View view) {
        redCardsForTeamB += 1;
        display(R.id.red_cards_b, redCardsForTeamB);
    }

    /*
     * add one foul for team A
     */

    public void addFoulForTeamA(View view) {
        foulsForTeamA += 1;
        display(R.id.fouls_team_a, foulsForTeamA);
    }

    /*
     * add one foul for team B
     */
    public void addFoulForTeamB(View view) {
        foulsForTeamB += 1;
        display(R.id.fouls_team_b, foulsForTeamB);
    }

    /*
     * display score
     * @param textViewId id for the text view
     * @param numberToBeDisplayed number to be displayed
     */
    private void display(int textViewId, int numberToBeDisplayed) {
        TextView txt = findViewById(textViewId);
        txt.setText(String.valueOf(numberToBeDisplayed));
    }

    /*
     * reset all scores
     */
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
