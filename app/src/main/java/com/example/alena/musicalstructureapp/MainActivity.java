package com.example.alena.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set onClickListener on the workout category text view
        TextView workoutTextView = findViewById(R.id.workout);
        workoutTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent workoutIntent = new Intent(MainActivity.this, WorkoutActivity.class);
                startActivity(workoutIntent);
            }
        });

        //Set onClickListener on the Norwegian category text view
        TextView norwegianTextView = findViewById(R.id.norwegian);
        norwegianTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent norwegianIntent = new Intent(MainActivity.this, NorwegianActivity.class);
                startActivity(norwegianIntent);
            }
        });

        //Set onClickListener on the party category text view
        TextView partyTextView = findViewById(R.id.party);
        partyTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent partyIntent = new Intent(MainActivity.this, PartyActivity.class);
                startActivity(partyIntent);
            }
        });
    }
}
