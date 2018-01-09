package com.example.alena.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class NorwegianActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.song_list);
    ArrayList<Song> norwegianSongs = new ArrayList<>();
    norwegianSongs.add(new Song(getString(R.string.norwegian_song1),
        getString(R.string.norwegian_artist),
        R.drawable.play_icon));
    norwegianSongs.add(new Song(getString(R.string.norwegian_song2),
        getString(R.string.norwegian_artist),
        R.drawable.play_icon));
    norwegianSongs.add(new Song(getString(R.string.norwegian_song3),
        getString(R.string.norwegian_artist),
        R.drawable.play_icon));
    norwegianSongs.add(new Song(getString(R.string.norwegian_song4),
        getString(R.string.norwegian_artist),
        R.drawable.play_icon));
    norwegianSongs.add(new Song(getString(R.string.norwegian_song5),
        getString(R.string.norwegian_artist),
        R.drawable.play_icon));
    norwegianSongs.add(new Song(getString(R.string.norwegian_song6),
        getString(R.string.norwegian_artist),
        R.drawable.play_icon));
    norwegianSongs.add(new Song(getString(R.string.norwegian_song7),
        getString(R.string.norwegian_artist),
        R.drawable.play_icon));
    norwegianSongs.add(new Song(getString(R.string.norwegian_song8),
        getString(R.string.norwegian_artist),
        R.drawable.play_icon));
    norwegianSongs.add(new Song(getString(R.string.norwegian_song9),
        getString(R.string.norwegian_artist),
        R.drawable.play_icon));
    norwegianSongs.add(new Song(getString(R.string.norwegian_song10),
        getString(R.string.norwegian_artist),
        R.drawable.play_icon));
    norwegianSongs.add(new Song(getString(R.string.norwegian_song11),
        getString(R.string.norwegian_artist),
        R.drawable.play_icon));
    norwegianSongs.add(new Song(getString(R.string.norwegian_song12),
        getString(R.string.norwegian_artist),
        R.drawable.play_icon));
    norwegianSongs.add(new Song(getString(R.string.norwegian_song13),
        getString(R.string.norwegian_artist),
        R.drawable.play_icon));

    SongAdapter adapter = new SongAdapter(this, norwegianSongs);
    ListView listView = findViewById(R.id.list_view_layout);

    //Create new text view
    TextView returnToLibrary = new TextView(this);
    returnToLibrary.setText(R.string.returnToMainPage);
    returnToLibrary.setTextAppearance(this, android.R.style.TextAppearance_Large);

    //Set OnClickListener on the returnToLibrary text view
    returnToLibrary.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent mainPage = new Intent(NorwegianActivity.this, MainActivity.class);
        startActivity(mainPage);
      }
    });

    //Set the returnToLibrary text view to be a footer view
    listView.addFooterView(returnToLibrary);
    listView.setAdapter(adapter);
  }
}
