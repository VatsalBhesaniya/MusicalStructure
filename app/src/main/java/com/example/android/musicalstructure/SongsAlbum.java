package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class SongsAlbum extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.songs_grid, container, false);
        //Create an array of albums
        final ArrayList<Song> albums = new ArrayList<Song>();
        albums.add(new Song(R.drawable.dangal, getString(R.string.dangal)));
        albums.add(new Song(R.drawable.padmaavat, getString(R.string.padmaavat)));
        albums.add(new Song(R.drawable.badrinathkidulhania, getString(R.string.badrinathkidulhania)));
        albums.add(new Song(R.drawable.padman, getString(R.string.padman)));
        albums.add(new Song(R.drawable.raid, getString(R.string.raid)));
        albums.add(new Song(R.drawable.raazi, getString(R.string.raazi)));
        albums.add(new Song(R.drawable.befikre, getString(R.string.befikre)));
        albums.add(new Song(R.drawable.sonuketitukisweety, getString(R.string.sonuketitukisweety)));
        albums.add(new Song(R.drawable.veerediwedding, getString(R.string.veerediwedding)));
        albums.add(new Song(R.drawable.baadshaho, getString(R.string.baadshaho)));
        //Create instance of AlbumAdapter and set it to gridview
        AlbumAdapter adapter = new AlbumAdapter(getActivity(), albums);
        GridView gridView = (GridView) view.findViewById(R.id.grid);
        gridView.setAdapter(adapter);
        //Create gridview item onclicklistener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Song album = albums.get(i);
                //Get the album name of gridview item clicked
                String albumName = album.getSongTitle();
                //Get songs of album from AlbumArrays class
                AlbumArrays albumArrays = new AlbumArrays();
                //Create arraylist of type song and get songs of the album clicked from AlbumArrays class
                ArrayList<Song> songAlbum;
                songAlbum = albumArrays.getAlbumSongs(albumName);
                //Create a new intent to open the AlbumListActivity
                Intent numbersIntent = new Intent(getContext(), AlbumListActivity.class);
                numbersIntent.putExtra("albumArray", songAlbum);
                numbersIntent.putExtra("albumImage", album.getImage());
                numbersIntent.putExtra("albumTitle", album.getSongTitle());
                //Start the new activity
                startActivity(numbersIntent);
            }
        });
        return view;
    }
}
