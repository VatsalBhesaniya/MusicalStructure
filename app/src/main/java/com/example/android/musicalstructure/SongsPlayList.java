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

public class SongsPlayList extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.songs_grid, container, false);
        //Create an array of playlists
        final ArrayList<Song> playlists = new ArrayList<Song>();
        playlists.add(new Song(R.drawable.arijit_singh, getString(R.string.arijit_singh)));
        playlists.add(new Song(R.drawable.justin_bieber, getString(R.string.justin_bieber)));
        playlists.add(new Song(R.drawable.taylor_swift, getString(R.string.taylor_swift)));
        playlists.add(new Song(R.drawable.jennifer_lopez, getString(R.string.jennifer_lopez)));
        playlists.add(new Song(R.drawable.ed_sheeran, getString(R.string.ed_sheeran)));
        playlists.add(new Song(R.drawable.rahat_fateh_ali_khan, getString(R.string.rahat_fateh_ali_khan)));
        playlists.add(new Song(R.drawable.love_songs, getString(R.string.love_songs)));
        playlists.add(new Song(R.drawable.super_hits, getString(R.string.super_hits)));
        playlists.add(new Song(R.drawable.dj_songs, getString(R.string.dj_songs)));
        //Create instance of AlbumAdapter and set it to gridview
        AlbumAdapter adapter = new AlbumAdapter(getActivity(), playlists);
        GridView gridView = (GridView) view.findViewById(R.id.grid);
        gridView.setAdapter(adapter);
        //Create gridview item onclicklistener
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Song playlist = playlists.get(i);
                //Get the playlist name of gridview item clicked
                String playlistName = playlist.getSongTitle();
                //Get songs of playlist from PlaylistArrays class
                PlaylistArrays playlistArrays = new PlaylistArrays();
                //Create arraylist of type song and get songs of the playlist clicked from PlaylistArrays class
                ArrayList<Song> songPlaylist;
                songPlaylist = playlistArrays.getPlaylistSongs(playlistName);
                //Create a new intent to open the AlbumListActivity
                Intent numbersIntent = new Intent(getContext(), AlbumListActivity.class);
                numbersIntent.putExtra("albumArray", songPlaylist);
                numbersIntent.putExtra("albumImage", playlist.getImage());
                numbersIntent.putExtra("albumTitle", playlist.getSongTitle());
                //Start the new activity
                startActivity(numbersIntent);
            }
        });
        return view;
    }
}