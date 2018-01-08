package com.example.alena.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NorwegianActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Song> norwegianSongs = new ArrayList<>();
        norwegianSongs.add(new Song("Hagal", "Wardruna", R.drawable.play_icon));
        norwegianSongs.add(new Song("Bjarkan", "Wardruna", R.drawable.play_icon));
        norwegianSongs.add(new Song("Heimta Thurs", "Wardruna", R.drawable.play_icon));
        norwegianSongs.add(new Song("Thurs", "Wardruna", R.drawable.play_icon));
        norwegianSongs.add(new Song("Jara", "Wardruna", R.drawable.play_icon));
        norwegianSongs.add(new Song("Laukr", "Wardruna", R.drawable.play_icon));
        norwegianSongs.add(new Song("Kauna", "Wardruna", R.drawable.play_icon));
        norwegianSongs.add(new Song("Algir - Stien klarnar", "Wardruna", R.drawable.play_icon));
        norwegianSongs.add(new Song("Dagr", "Wardruna", R.drawable.play_icon));
        norwegianSongs.add(new Song("Tyr", "Wardruna", R.drawable.play_icon));
        norwegianSongs.add(new Song("UruR", "Wardruna", R.drawable.play_icon));
        norwegianSongs.add(new Song("Isa", "Wardruna", R.drawable.play_icon));
        norwegianSongs.add(new Song("Wunjo", "Wardruna", R.drawable.play_icon));

        SongAdapter adapter = new SongAdapter(this, norwegianSongs);
        ListView listView = findViewById(R.id.list_view_layout);
        listView.setAdapter(adapter);

    }
}
