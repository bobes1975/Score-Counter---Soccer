package com.example.android.scorekeeperappfoolball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    static final String stateScoreTeam1 = "team1Score";
    static final String stateNumbersOfPlayersTeam1 = "playerTeam1";
    static final String stateYellowCardTeam1 = "yellowCardTeam1";
    static final String stateRedCardTeam1 = "redCardTeam1";
    static final String stateScoreTeam2 = "team2Score";
    static final String stateNumbersOfPlayersTeam2 = "playerTeam2";
    static final String stateYellowCardTeam2 = "yellowCardTeam2";
    static final String stateRedCardTeam2 = "redCardTeam2";
    int team1Score = 0;
    int playerTeam1 = 11;
    int yellowCardTeam1 = 0;
    int redCardTeam1 = 0;
    int team2Score = 0;
    int playerTeam2 = 11;
    int yellowCardTeam2 = 0;
    int redCardTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * save and restore game data after display rotation
     */

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the current game state
        savedInstanceState.putInt(stateScoreTeam1, team1Score);
        savedInstanceState.putInt(stateNumbersOfPlayersTeam1, playerTeam1);
        savedInstanceState.putInt(stateYellowCardTeam1, yellowCardTeam1);
        savedInstanceState.putInt(stateRedCardTeam1, redCardTeam1);

        savedInstanceState.putInt(stateScoreTeam2, team2Score);
        savedInstanceState.putInt(stateNumbersOfPlayersTeam2, playerTeam2);
        savedInstanceState.putInt(stateYellowCardTeam2, yellowCardTeam2);
        savedInstanceState.putInt(stateRedCardTeam2, redCardTeam2);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);

        // Restore state members from saved instance
        team1Score = savedInstanceState.getInt(stateScoreTeam1);
        playerTeam1 = savedInstanceState.getInt(stateNumbersOfPlayersTeam1);
        yellowCardTeam1 = savedInstanceState.getInt(stateYellowCardTeam1);
        redCardTeam1 = savedInstanceState.getInt(stateRedCardTeam1);

        team2Score = savedInstanceState.getInt(stateScoreTeam2);
        playerTeam2 = savedInstanceState.getInt(stateNumbersOfPlayersTeam2);
        yellowCardTeam2 = savedInstanceState.getInt(stateYellowCardTeam2);
        redCardTeam2 = savedInstanceState.getInt(stateRedCardTeam2);

        displayScoreTeam1(team1Score);
        displayNumbersOfPlayersTeam1(playerTeam1);
        displayYellowCardTeam1(yellowCardTeam1);
        displayRedCardTeam1(redCardTeam1);

        displayScoreTeam2(team2Score);
        displayNumbersOfPlayersTeam2(playerTeam2);
        displayYellowCardTeam2(yellowCardTeam2);
        displayRedCardTeam2(redCardTeam2);
    }

    /**
     * Displays the given score for Team 1 and 2.
     */
    public void displayScoreTeam1(int score) {
        TextView team1Score = findViewById(R.id.team1Score);
        team1Score.setText(String.valueOf(score));
    }

    public void displayScoreTeam2(int score) {
        TextView team2Score = findViewById(R.id.team2Score);
        team2Score.setText(String.valueOf(score));
    }

    /**
     * Displays numbers of players for Team 1 and 2.
     */
    public void displayNumbersOfPlayersTeam1(int players) {
        TextView playerTeam1 = findViewById(R.id.playerTeam1);
        playerTeam1.setText(String.valueOf(players));
    }

    public void displayNumbersOfPlayersTeam2(int players) {
        TextView playerTeam2 = findViewById(R.id.playerTeam2);
        playerTeam2.setText(String.valueOf(players));
    }

    /**
     * Displays yellow card for Team 1 and 2.
     */
    public void displayYellowCardTeam1(int yellow) {
        TextView yellowCardTeam1 = findViewById(R.id.yellowCardTeam1);
        yellowCardTeam1.setText(String.valueOf(yellow));
    }

    public void displayYellowCardTeam2(int yellow) {
        TextView yellowCardTeam2 = findViewById(R.id.yellowCardTeam2);
        yellowCardTeam2.setText(String.valueOf(yellow));
    }

    /**
     * Displays red card for Team 1 and 2.
     */
    public void displayRedCardTeam1(int red) {
        TextView redCardTeam1 = findViewById(R.id.redCardTeam1);
        redCardTeam1.setText(String.valueOf(red));
    }

    public void displayRedCardTeam2(int red) {
        TextView redCardTeam2 = findViewById(R.id.redCardTeam2);
        redCardTeam2.setText(String.valueOf(red));
    }

    /**
     * Count score for team 1.
     */
    public void goalTeamA(View v) {
        team1Score = team1Score + 1;
        displayScoreTeam1(team1Score);
    }

    public void goalTeamB(View v) {
        team2Score = team2Score + 1;
        displayScoreTeam2(team2Score);
    }

    /**
     * Count players for team 1 and 2.
     *
     * @param redCardTeam1 only 4 red cards are possible
     */
    public void numbersOfPlayerTeam1(int redCardTeam1) {
        playerTeam1 = playerTeam1 - 1;
        displayNumbersOfPlayersTeam1(playerTeam1);
    }

    /**
     * Count players for team 2.
     *
     * @param redCardTeam2 only 4 red cards are possible
     */
    public void numbersOfPlayerTeam2(int redCardTeam2) {
        playerTeam2 = playerTeam2 - 1;
        displayNumbersOfPlayersTeam2(playerTeam2);
    }


    /**
     * Count yellow cards for team 1 and 2.
     */
    public void yellowCardTeam1(View v) {
        yellowCardTeam1 = yellowCardTeam1 + 1;
        displayYellowCardTeam1(yellowCardTeam1);
    }

    public void yellowCardTeam2(View v) {
        yellowCardTeam2 = yellowCardTeam2 + 1;
        displayYellowCardTeam2(yellowCardTeam2);
    }

    /**
     * Count yellow cards for team 1 and 2.
     */
    public void redCardTeam1(View v) {
        redCardTeam1 = redCardTeam1 + 1;

        //based on the soccer rules team can play only with minimum 7 players,
        // there for max red cards number is 4

        if (redCardTeam1 == 5) {

            //message Game Over due to minimum 7 players rules
            String message = getString(R.string.messagePart1) + "\n" + getString(R.string.messagePart2) + "\n" + getString(R.string.messagePart3);

            Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);

            LinearLayout layout = (LinearLayout) toast.getView();

            if (layout.getChildCount() > 0) {
                TextView tv = (TextView) layout.getChildAt(0);
                tv.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            }
            toast.show();

            redCardTeam1 = 4;
            playerTeam1 = 8;
        }

        displayRedCardTeam1(redCardTeam1);
        numbersOfPlayerTeam1(playerTeam1);
    }

    public void redCardTeam2(View v) {
        redCardTeam2 = redCardTeam2 + 1;

        //based on the soccer rules team can play only with minimum 7 players,
        // there for max red cards number is 4

        if (redCardTeam2 == 5) {

            //message Game Over due to minimum 7 players rules
            String message = getString(R.string.messagePart1) + "\n" + getString(R.string.messagePart2) + "\n" + getString(R.string.messagePart3);

            Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);

            LinearLayout layout = (LinearLayout) toast.getView();

            if (layout.getChildCount() > 0) {
                TextView tv = (TextView) layout.getChildAt(0);
                tv.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
            }
            toast.show();

            redCardTeam2 = 4;
            playerTeam2 = 8;
        }

        displayRedCardTeam2(redCardTeam2);
        numbersOfPlayerTeam2(playerTeam2);
    }

    /**
     * Reset all displayed values.
     */
    public void reset(View v) {

        team1Score = 0;
        playerTeam1 = 11;
        yellowCardTeam1 = 0;
        redCardTeam1 = 0;

        team2Score = 0;
        playerTeam2 = 11;
        yellowCardTeam2 = 0;
        redCardTeam2 = 0;

        displayScoreTeam1(team1Score);
        displayNumbersOfPlayersTeam1(playerTeam1);
        displayYellowCardTeam1(yellowCardTeam1);
        displayRedCardTeam1(redCardTeam1);

        displayScoreTeam2(team2Score);
        displayNumbersOfPlayersTeam2(playerTeam2);
        displayYellowCardTeam2(yellowCardTeam2);
        displayRedCardTeam2(redCardTeam2);
    }
}
