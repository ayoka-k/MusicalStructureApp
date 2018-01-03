package com.example.alena.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class WorkoutActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ArrayList<Song> workoutSongs = new ArrayList<>();
        workoutSongs.add(new Song("Used To Have It All", "Fais"));
        workoutSongs.add(new Song("Find Me", "Sigma"));
        workoutSongs.add(new Song("Sweet Lovin\'", "Sigala"));
        workoutSongs.add(new Song("Blame", "Zeds Dead"));
        workoutSongs.add(new Song("All The Way Up", "Fat Joe"));
        workoutSongs.add(new Song("Lost & Found", "Borgeous"));
        workoutSongs.add(new Song("Run Wild", "Hardwell"));
        workoutSongs.add(new Song("Places", "Martin Solveig"));
        workoutSongs.add(new Song("Come Get It Bae", "Pharrell Williams"));
        workoutSongs.add(new Song("ILYSM", "Steve Aoki & Autoerotique"));
        workoutSongs.add(new Song("Snake Eyes", "Feint"));
        workoutSongs.add(new Song("Thunder", "Imagine Dragons"));
        workoutSongs.add(new Song("Outside", "Calvin Harris"));
        workoutSongs.add(new Song("Can\'t Hold Us", "Macklemore & Ryan Lewis"));
        workoutSongs.add(new Song("Hot Right Now", "DJ Fresh"));

        SongAdapter adapter = new SongAdapter(this, workoutSongs);
        ListView listView = findViewById(R.id.list_view_layout);
        listView.setAdapter(adapter);
    }
}
