package com.example.android.musicalstructure;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Song currentSong = getItem(position);
        //Set image of the song
        ImageView songImage = (ImageView) listItemView.findViewById(R.id.song_image);
        songImage.setImageResource(currentSong.getImage());
        //Set the song title
        TextView songTitle = (TextView) listItemView.findViewById(R.id.song_title);
        songTitle.setText(currentSong.getSongTitle());
        //Set the song description
        TextView songDescription = (TextView) listItemView.findViewById(R.id.song_description);
        songDescription.setText(currentSong.getSongDescription());
        return listItemView;
    }
}
