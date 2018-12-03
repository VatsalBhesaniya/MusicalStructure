package com.example.android.musicalstructure;

import java.io.Serializable;

//{@link Song} represents a vocabulary of the word that the user wants to learn.
//It contains a default translation and a miwok translation for that word.
public class Song implements Serializable {
    //Image view
    private int mImage;
    //Default translation for the word
    private String mSongTitle;
    //Miwok translation for the word
    private String mSongDescription;
    //Audio resource ID for the song
    private int mAudioResourceId;

    /*Create a new song object for song albums and playlists.
     * @param iamge is the image of the song.
     * @param songTitle is the Title of the song.*/
    public Song(int image, String songTitle) {
        mImage = image;
        mSongTitle = songTitle;
    }

    /*Create a new song object for the list of songs.
     * @param iamge is the image of the song.
     * @param songTitle is the Title of the song.
     * @param songDescription is the Description of the song.
     * @param audioResourceId is the Audio file of the song.*/
    public Song(int image, String songTitle, String songDescription, int audioResourceId) {
        mImage = image;
        mSongTitle = songTitle;
        mSongDescription = songDescription;
        mAudioResourceId = audioResourceId;
    }

    //Get Image of the song
    public int getImage() {
        return mImage;
    }

    //Get the default translation of the word
    public String getSongTitle() {
        return mSongTitle;
    }

    //Get the english translation of the word
    public String getSongDescription() {
        return mSongDescription;
    }

    //Get the audio file of the song
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
