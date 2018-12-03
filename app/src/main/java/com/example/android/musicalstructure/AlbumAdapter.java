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

public class AlbumAdapter extends ArrayAdapter<Song> {
    AlbumAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.grid_item, parent, false);
        }
        Song currentSong = getItem(position);
        //Set image of the song
        ImageView songImage = (ImageView) gridItemView.findViewById(R.id.song_image);
        songImage.setImageResource(currentSong != null ? currentSong.getImage() : 0);
        //Set the song title
        TextView songTitle = (TextView) gridItemView.findViewById(R.id.song_title);
        songTitle.setText(currentSong != null ? currentSong.getSongTitle() : null);
        return gridItemView;
    }
}
