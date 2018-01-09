package com.example.alena.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class WorkoutActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.song_list);
    ArrayList<Song> workoutSongs = new ArrayList<>();
    workoutSongs.add(new Song(getString(R.string.workout_song1),
        getString(R.string.workout_artist1),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song2),
        getString(R.string.workout_artist2),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song3),
        getString(R.string.workout_artist3),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song4),
        getString(R.string.workout_artist4),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song5),
        getString(R.string.workout_artist5),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song6),
        getString(R.string.workout_artist6),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song7),
        getString(R.string.workout_artist7),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song8),
        getString(R.string.workout_artist8),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song9),
        getString(R.string.workout_artist9),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song10),
        getString(R.string.workout_artist10),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song11),
        getString(R.string.workout_artist11),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song12),
        getString(R.string.workout_artist12),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song13),
        getString(R.string.workout_artist13),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song14),
        getString(R.string.workout_artist14),
        R.drawable.play_icon));
    workoutSongs.add(new Song(getString(R.string.workout_song15),
        getString(R.string.workout_artist15),
        R.drawable.play_icon));

    SongAdapter adapter = new SongAdapter(this, workoutSongs);
    ListView listView = findViewById(R.id.list_view_layout);

    //Create new text view
    TextView returnToLibrary = new TextView(this);
    returnToLibrary.setText(R.string.returnToMainPage);
    returnToLibrary.setTextAppearance(this, android.R.style.TextAppearance_Large);

    //Set OnClickListener on the returnToLibrary text view
    returnToLibrary.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent mainPage = new Intent(WorkoutActivity.this, MainActivity.class);
        startActivity(mainPage);
      }
    });

    //Set the returnToLibrary text view to be a footer view
    listView.addFooterView(returnToLibrary);
    listView.setAdapter(adapter);
  }
}
