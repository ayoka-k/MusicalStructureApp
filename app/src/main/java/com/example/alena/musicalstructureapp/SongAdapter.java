package com.example.alena.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, List<Song> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView songTextView = listItemView.findViewById(R.id.song_text_view);
        // Get the version name from the current Song object and
        // set this text on the name TextView
        songTextView.setText(currentSong.getSong());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        // Get the version name from the current Song object and
        // set this text on the name TextView
        artistTextView.setText(currentSong.getArtist());

        return listItemView;
    }
}
