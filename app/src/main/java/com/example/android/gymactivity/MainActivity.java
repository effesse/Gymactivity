package com.example.android.gymactivity;


import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    static final String STATE_MINUTESTOT = "minutesTot";
    static final String STATE_KCALTOT = "kcalTot";

    int minutesTot = 0;
    int kcalTot = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        minutesTot = savedInstanceState.getInt(STATE_MINUTESTOT);
        kcalTot = savedInstanceState.getInt(STATE_KCALTOT);

        displayMinutes(minutesTot);
        displayKcal(kcalTot);

    }




    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
    savedInstanceState.putInt(STATE_MINUTESTOT , minutesTot);
    savedInstanceState.putInt(STATE_KCALTOT , kcalTot);
    super.onSaveInstanceState(savedInstanceState);
    }




    /**
     * Displays the minutes of gym.
     */
    public void displayMinutes(int minutesTot ) {
        TextView scoreView = (TextView) findViewById(R.id.tot_minutes);
        scoreView.setText(String.valueOf(minutesTot));
    }

    /**
     * Displays the kcal for gym.
     */
    public void displayKcal(int kcalTot) {
        TextView scoreView = (TextView) findViewById(R.id.tot_kcal);
        scoreView.setText(String.valueOf(kcalTot));
    }


    /**
     * Increase the minutes and kcal for TRX training.
     */
    public void addTrx(View v) {
        minutesTot = minutesTot + 30;
        kcalTot = kcalTot + 257;
        displayMinutes(minutesTot);
        displayKcal(kcalTot);
    }

    /**
     * Increase the minutes and kcal for Booty Barre.
     */
    public void addBootyBarre(View v) {
        minutesTot = minutesTot + 45;
        kcalTot = kcalTot + 235;
        displayMinutes(minutesTot);
        displayKcal(kcalTot);
    }


    /**
     * Increase the minutes and kcal for Grid.
     */
    public void addGrid(View v) {
        minutesTot = minutesTot + 30;
        kcalTot = kcalTot + 500;
        displayMinutes(minutesTot);
        displayKcal(kcalTot);
    }


    /**
     * Increase the minutes and kcal for Cross Cardio.
     */
    public void addCrossCardio(View v) {
        minutesTot = minutesTot + 45;
        kcalTot = kcalTot + 350;
        displayMinutes(minutesTot);
        displayKcal(kcalTot);
    }



    /**
     * Increase the minutes and kcal for Nike Fusion.
     */
    public void addNikeFusion(View v) {
        minutesTot = minutesTot + 45;
        kcalTot = kcalTot + 300;
        displayMinutes(minutesTot);
        displayKcal(kcalTot);
    }


    /**
     * Increase the minutes and kcal for Yoga.
     */
    public void addYoga(View v) {
        minutesTot = minutesTot + 45;
        kcalTot = kcalTot + 280;
        displayMinutes(minutesTot);
        displayKcal(kcalTot);
    }


    /**
     * Reset the score for minutes and kcal.
     */
    public void resetCounter(View v) {
        minutesTot = 0;
        displayMinutes(minutesTot);
        kcalTot = 0;
        displayKcal(kcalTot);
    }
}

