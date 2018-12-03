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
import android.widget.ListView;

import java.util.ArrayList;

public class SongsList extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.songs_list, container, false);
        //Create an array of songs
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(R.drawable.dangal, getString(R.string.dangal_naina),
                getString(R.string.arijit_singh), R.raw.dangal_naina));
        songs.add(new Song(R.drawable.furious_seven, getString(R.string.see_you_again_feat_charlie_puth),
                getString(R.string.charlie_puth), R.raw.see_you_again_feat_charlie_puth));
        songs.add(new Song(R.drawable.padmaavat, getString(R.string.ghoomar_padmaavat),
                getString(R.string.shreya_ghoshal), R.raw.padmaavat_ghoomar));
        songs.add(new Song(R.drawable.love_me_like_you_do, getString(R.string.ellie_goulding_love_me_like_you_do),
                getString(R.string.ellie_goulding), R.raw.ellie_goulding_love_me_like_you_do));
        songs.add(new Song(R.drawable.delicate, "Delicate",
                getString(R.string.taylor_swift), R.raw.taylor_swift_delicate));
        songs.add(new Song(R.drawable.badrinathkidulhania, getString(R.string.badrikidulhania_roke_na_nuke_naina),
                getString(R.string.arijit_singh), R.raw.badrikidulhania_roke_na_nuke_naina));
        songs.add(new Song(R.drawable.padman, getString(R.string.padman_aaj_se_teri),
                getString(R.string.arijit_singh), R.raw.padman_aaj_se_teri));
        songs.add(new Song(R.drawable.diamonds, getString(R.string.rihanna_diamonds),
                getString(R.string.rihanna), R.raw.rihanna_diamonds));
        songs.add(new Song(R.drawable.raid, getString(R.string.raid_nit_khair_manga),
                getString(R.string.rahat_fateh_ali_khan), R.raw.raid_nit_khair_manga));
        songs.add(new Song(R.drawable.the_shape_of_water, getString(R.string.ed_sheeran_shape_of_you),
                getString(R.string.ed_sheeran), R.raw.ed_sheeran_shape_of_you));
        songs.add(new Song(R.drawable.raazi, getString(R.string.raazi_dilbaro),
                getString(R.string.harshdeep_kaur), R.raw.raazi_dilbaro));
        songs.add(new Song(R.drawable.befikre, getString(R.string.befikre_nashe_si_chadh_gayi),
                getString(R.string.arijit_singh), R.raw.befikre_nashe_si_chadh_gayi));
        songs.add(new Song(R.drawable.sonuketitukisweety, getString(R.string.sonuketitukisweety_bom_diggy_diggy),
                getString(R.string.zack_knight_jasmin_walia), R.raw.sonuketitukisweety_bom_diggy_diggy));
        songs.add(new Song(R.drawable.veerediwedding, getString(R.string.veerediwedding_tareefan),
                getString(R.string.badshah), R.raw.veerediwedding_tareefan));
        songs.add(new Song(R.drawable.baadshaho, getString(R.string.baadshaho_mere_rashke_qamar),
                getString(R.string.rahat_fateh_ali_khan), R.raw.baadshaho_mere_rashke_qamar));
        //Create instance of SongAdapter and set it to listview
        SongAdapter adapter = new SongAdapter(getActivity(), songs);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);
        //Create listview item onclicklistener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Song song = songs.get(i);
                //Create a new intent to open the NumbersActivity
                Intent numbersIntent = new Intent(getActivity(), NowPlayingActivity.class);
                numbersIntent.putExtra("songIndex", i);
                numbersIntent.putExtra("songsArray", songs);
                numbersIntent.putExtra("songImage", song.getImage());
                numbersIntent.putExtra("songTitle", song.getSongTitle());
                numbersIntent.putExtra("songAudio", song.getAudioResourceId());
                //Start the new activity
                startActivity(numbersIntent);
            }
        });
        return view;
    }
}
