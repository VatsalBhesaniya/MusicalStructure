package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumListActivity extends AppCompatActivity {
    private ArrayList<Song> mSongs = new ArrayList<Song>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_list);
        ImageView albumCover = (ImageView) findViewById(R.id.album_image);
        ImageView btnBack = (ImageView) findViewById(R.id.btn_back);
        TextView albumTitle = (TextView) findViewById(R.id.album_title);
        //Get the intent
        Intent intent = getIntent();
        //Get the array of song from intent
        mSongs = (ArrayList<Song>) intent.getSerializableExtra("albumArray");
        //Get the album image from intent and set it to imageview
        int imageId = intent.getIntExtra("albumImage", 0);
        albumCover.setImageResource(imageId);
        //Get the album title from intent and set it to textview
        String titleAlbum = intent.getExtras().getString("albumTitle");
        albumTitle.setText(titleAlbum);
        //Create instance of SongAdapter and set it to listview
        SongAdapter adapter = new SongAdapter(AlbumListActivity.this, mSongs);
        final ListView listView = (ListView) findViewById(R.id.album_list);
        listView.setAdapter(adapter);
        //Create listview item onclicklistener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Song album = mSongs.get(i);
                Intent numbersIntent = new Intent(AlbumListActivity.this, NowPlayingActivity.class);
                numbersIntent.putExtra("songIndex", i);
                numbersIntent.putExtra("songsArray", mSongs);
                numbersIntent.putExtra("songImage", album.getImage());
                numbersIntent.putExtra("songTitle", album.getSongTitle());
                numbersIntent.putExtra("songAudio", album.getAudioResourceId());
                startActivity(numbersIntent);
            }
        });
        setListViewHeightBasedOnChildren(listView);
        listView.setFocusable(false);
        //Onclicklistener for back button
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    /*Method for Setting the Height of the ListView dynamically and to fix the issue of
    not showing all the items of the ListView when placed inside a ScrollView*/
    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            return;
        }
        int totalHeight = 0;
        for (int i = 0, len = listAdapter.getCount(); i < len; i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
    }
}
