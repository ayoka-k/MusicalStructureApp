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
        workoutSongs.add(new Song("Used To Have It All", "Fais", R.drawable.play_icon));
        workoutSongs.add(new Song("Find Me", "Sigma", R.drawable.play_icon));
        workoutSongs.add(new Song("Sweet Lovin\'", "Sigala", R.drawable.play_icon));
        workoutSongs.add(new Song("Blame", "Zeds Dead", R.drawable.play_icon));
        workoutSongs.add(new Song("All The Way Up", "Fat Joe", R.drawable.play_icon));
        workoutSongs.add(new Song("Lost & Found", "Borgeous", R.drawable.play_icon));
        workoutSongs.add(new Song("Run Wild", "Hardwell", R.drawable.play_icon));
        workoutSongs.add(new Song("Places", "Martin Solveig", R.drawable.play_icon));
        workoutSongs.add(new Song("Come Get It Bae", "Pharrell Williams", R.drawable.play_icon));
        workoutSongs.add(new Song("ILYSM", "Steve Aoki & Autoerotique", R.drawable.play_icon));
        workoutSongs.add(new Song("Snake Eyes", "Feint", R.drawable.play_icon));
        workoutSongs.add(new Song("Thunder", "Imagine Dragons", R.drawable.play_icon));
        workoutSongs.add(new Song("Outside", "Calvin Harris", R.drawable.play_icon));
        workoutSongs.add(new Song("Can\'t Hold Us", "Macklemore & Ryan Lewis", R.drawable.play_icon));
        workoutSongs.add(new Song("Hot Right Now", "DJ Fresh", R.drawable.play_icon));

        SongAdapter adapter = new SongAdapter(this, workoutSongs);
        ListView listView = findViewById(R.id.list_view_layout);
        listView.setAdapter(adapter);
    }
}
