package com.example.alena.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PartyActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> partySongs = new ArrayList<>();
        partySongs.add(new Song("Feel It Still", "Portugal. The Man", R.drawable.play_icon));
        partySongs.add(new Song("Lights", "Hurts", R.drawable.play_icon));
        partySongs.add(new Song("Wherever I Go", "OneRepublic", R.drawable.play_icon));
        partySongs.add(new Song("Good Grief", "Bastille", R.drawable.play_icon));
        partySongs.add(new Song("Despacito", "Luis Fonsi", R.drawable.play_icon));
        partySongs.add(new Song("Shape of You", "Ed Sheeran", R.drawable.play_icon));
        partySongs.add(new Song("Sugar", "Maroon 5", R.drawable.play_icon));
        partySongs.add(new Song("Can\'t Stop", "Red Hot Chili Peppers", R.drawable.play_icon));
        partySongs.add(new Song("Lean On", "Major Lazer", R.drawable.play_icon));
        partySongs.add(new Song("Don\'t Worry", "Madcon", R.drawable.play_icon));
        partySongs.add(new Song("I\'m Gonna Be(500 Miles)", "The Proclaimers", R.drawable.play_icon));

        SongAdapter adapter = new SongAdapter(this, partySongs);
        ListView listView = findViewById(R.id.list_view_layout);
        listView.setAdapter(adapter);
    }
}
