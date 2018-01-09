package com.example.alena.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class PartyActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.song_list);

    ArrayList<Song> partySongs = new ArrayList<>();
    partySongs.add(new Song(getString(R.string.party_song1),
        getString(R.string.party_artist1),
        R.drawable.play_icon));
    partySongs.add(new Song(getString(R.string.party_song2),
        getString(R.string.party_artist2),
        R.drawable.play_icon));
    partySongs.add(new Song(getString(R.string.party_song3),
        getString(R.string.party_artist3),
        R.drawable.play_icon));
    partySongs.add(new Song(getString(R.string.party_song4),
        getString(R.string.party_artist4),
        R.drawable.play_icon));
    partySongs.add(new Song(getString(R.string.party_song5),
        getString(R.string.party_artist5),
        R.drawable.play_icon));
    partySongs.add(new Song(getString(R.string.party_song6),
        getString(R.string.party_artist6),
        R.drawable.play_icon));
    partySongs.add(new Song(getString(R.string.party_song7),
        getString(R.string.party_artist7),
        R.drawable.play_icon));
    partySongs.add(new Song(getString(R.string.party_song8),
        getString(R.string.party_artist8),
        R.drawable.play_icon));
    partySongs.add(new Song(getString(R.string.party_song9),
        getString(R.string.party_artist9),
        R.drawable.play_icon));
    partySongs.add(new Song(getString(R.string.party_song10),
        getString(R.string.party_artist10),
        R.drawable.play_icon));
    partySongs.add(new Song(getString(R.string.party_song11),
        getString(R.string.party_artist11),
        R.drawable.play_icon));

    SongAdapter adapter = new SongAdapter(this, partySongs);
    ListView listView = findViewById(R.id.list_view_layout);

    //Create new text view
    TextView returnToLibrary = new TextView(this);
    returnToLibrary.setText(R.string.returnToMainPage);
    returnToLibrary.setTextAppearance(this, android.R.style.TextAppearance_Large);

    //Set OnClickListener on the returnToLibrary text view
    returnToLibrary.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent mainPage = new Intent(PartyActivity.this, MainActivity.class);
        startActivity(mainPage);
      }
    });

    //Set the returnToLibrary text view to be a footer view
    listView.addFooterView(returnToLibrary);
    listView.setAdapter(adapter);
  }
}
