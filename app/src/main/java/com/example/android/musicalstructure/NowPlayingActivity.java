package com.example.android.musicalstructure;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class NowPlayingActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private ImageView songImage;
    private Toolbar toolbar;
    private ImageButton btnRepeat;
    private ImageButton btnShuffle;
    private ImageButton btnPlaylist;
    private ImageButton btnPlay;
    private ImageButton btnPrevious;
    private ImageButton btnNext;
    private TextView timePass;
    private TextView timeDuration;
    private SeekBar seekBar;
    private boolean isRepeat = false;
    private boolean isShuffle = false;
    private MediaPlayer mediaPlayer;
    private int currentPosition;
    private Handler handler;
    private Runnable mRunnable;
    private int currentSongIndex;
    private ArrayList<Song> mSongs = new ArrayList<Song>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        songImage = (ImageView) findViewById(R.id.song_image);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        btnRepeat = (ImageButton) findViewById(R.id.btn_repeat);
        btnShuffle = (ImageButton) findViewById(R.id.btn_shuffle);
        btnPlaylist = (ImageButton) findViewById(R.id.btn_playlist);
        btnPlay = (ImageButton) findViewById(R.id.btn_play);
        btnPrevious = (ImageButton) findViewById(R.id.btn_previous);
        btnNext = (ImageButton) findViewById(R.id.btn_next);
        timePass = (TextView) findViewById(R.id.time_pass);
        timeDuration = (TextView) findViewById(R.id.time_duration);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        //Setting up back button in toolbar
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                finish();
            }
        });
        //Setting repeat and shuffle button off
        isRepeat = false;
        isShuffle = false;
        //Get the intent
        Intent intent = getIntent();
        mSongs = (ArrayList<Song>) intent.getSerializableExtra("songsArray");
        currentSongIndex = intent.getIntExtra("songIndex", 0);
        //Get the song image from intent and set it to ImageView songImage
        int imageId = intent.getIntExtra("songImage", 0);
        songImage.setImageResource(imageId);
        //Get the song name from intent and set it as toolbar title
        String songTitle = intent.getStringExtra("songTitle");
        toolbar.setTitle(songTitle);
        //Get the song audio file
        final int songAudio = intent.getIntExtra("songAudio", 0);
        //Creating media player
        mediaPlayer = MediaPlayer.create(NowPlayingActivity.this, songAudio);
        //Calling method to get time deration
        getAudioStats();
        //OnClickListeners
        seekBar.setOnSeekBarChangeListener(this);
        //Creating onClickListener on play and pause button click to play and pause the song
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playSong(currentSongIndex);
            }
        });
        //OnClickListener on repeat button click to repeat the song
        btnRepeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isRepeat) {
                    isRepeat = false;
                    Toast.makeText(getApplicationContext(), "Repeat is OFF", Toast.LENGTH_SHORT).show();
                    btnRepeat.setBackgroundResource(R.drawable.ic_repeat_off_24dp);
                } else {
                    // make repeat to true
                    isRepeat = true;
                    Toast.makeText(getApplicationContext(), "Repeat is ON", Toast.LENGTH_SHORT).show();
                    // make shuffle to false
                    isShuffle = false;
                    btnRepeat.setBackgroundResource(R.drawable.ic_repeat_on_24dp);
                    btnShuffle.setBackgroundResource(R.drawable.ic_shuffle_off_24dp);
                }
            }
        });
        //OnClickListener on shuffle button click to shuffle the song
        btnShuffle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isShuffle) {
                    isShuffle = false;
                    Toast.makeText(getApplicationContext(), "Shuffle is OFF", Toast.LENGTH_SHORT).show();
                    btnShuffle.setBackgroundResource(R.drawable.ic_shuffle_off_24dp);
                } else {
                    // make repeat to true
                    isShuffle = true;
                    Toast.makeText(getApplicationContext(), "Shuffle is ON", Toast.LENGTH_SHORT).show();
                    // make shuffle to false
                    isRepeat = false;
                    btnShuffle.setBackgroundResource(R.drawable.ic_shuffle_on_24dp);
                    btnRepeat.setBackgroundResource(R.drawable.ic_repeat_off_24dp);
                }
            }
        });
        //OnClickListener on playlist button click to open the song playlist
        btnPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                finish();
            }
        });
        //OnClickListener on next button click to skip to the next song
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                // check if next song is available or not
                if (currentSongIndex < (mSongs.size() - 1)) {
                    ++currentSongIndex;
                    mediaPlayer = MediaPlayer.create(NowPlayingActivity.this, mSongs.get(currentSongIndex).getAudioResourceId());
                } else {
                    // play first song
                    currentSongIndex = 0;
                    mediaPlayer = MediaPlayer.create(NowPlayingActivity.this, mSongs.get(currentSongIndex).getAudioResourceId());
                }
                initializeSeekBar();
                String songTitle = mSongs.get(currentSongIndex).getSongDescription();
                toolbar.setTitle(songTitle);
                songImage.setImageResource(mSongs.get(currentSongIndex).getImage());
                mediaPlayer.start();
                btnPlay.setBackgroundResource(R.drawable.ic_pause_circle_24dp);
            }
        });
        //OnClickListener on previous button click to skip to the previous song
        btnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                }
                if (currentSongIndex > 0) {
                    --currentSongIndex;
                    mediaPlayer = MediaPlayer.create(NowPlayingActivity.this, mSongs.get(currentSongIndex).getAudioResourceId());
                } else {
                    // play first song
                    mediaPlayer = MediaPlayer.create(NowPlayingActivity.this, mSongs.get(mSongs.size() - 1).getAudioResourceId());
                    currentSongIndex = mSongs.size() - 1;
                }
                initializeSeekBar();
                String songTitle = mSongs.get(currentSongIndex).getSongDescription();
                toolbar.setTitle(songTitle);
                songImage.setImageResource(mSongs.get(currentSongIndex).getImage());
                mediaPlayer.start();
                btnPlay.setBackgroundResource(R.drawable.ic_pause_circle_24dp);
            }
        });
    }

    //Seek bar changeListeners
    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (mediaPlayer != null && fromUser) {
            mediaPlayer.seekTo(progress * 1000);
        }
    }

    /**
     * Function to play a song
     *
     * @param songIndex - index of song
     */
    public void playSong(int songIndex) {
        if (!mediaPlayer.isPlaying()) {
            // Play song
            mediaPlayer.reset();
            mediaPlayer = MediaPlayer.create(NowPlayingActivity.this, mSongs.get(currentSongIndex).getAudioResourceId());
            mediaPlayer.seekTo(currentPosition);
            mediaPlayer.start();
            // Displaying Song title
            String songTitle = mSongs.get(currentSongIndex).getSongDescription();
            toolbar.setTitle(songTitle);
            // Setting song image on imageview
            songImage.setImageResource(mSongs.get(currentSongIndex).getImage());
            // Changing Button Image to pause image
            btnPlay.setBackgroundResource(R.drawable.ic_pause_circle_24dp);
            // Creating instance of handler and initializing seekbar progress
            handler = new Handler();
            initializeSeekBar();
        } else if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            currentPosition = mediaPlayer.getCurrentPosition();
            // Changing Button Image to pause image
            btnPlay.setBackgroundResource(R.drawable.ic_play_circle_24dp);
        }
    }

    // Function to initialize the seekbar progress
    protected void initializeSeekBar() {
        seekBar.setMax(mediaPlayer.getDuration() / 1000);

        mRunnable = new Runnable() {
            @Override
            public void run() {
                if (mediaPlayer != null) {
                    int mCurrentPosition = mediaPlayer.getCurrentPosition() / 1000; // In milliseconds
                    seekBar.setProgress(mCurrentPosition);
                    getAudioStats();
                }
                handler.postDelayed(mRunnable, 1000);
            }
        };
        handler = new Handler();
        handler.postDelayed(mRunnable, 1000);
    }

    // Funcrion to set the text of textview representing the time position and time duration of the song
    protected void getAudioStats() {
        int duration = mediaPlayer.getDuration(); // In milliseconds
        int due = (duration - mediaPlayer.getCurrentPosition());
        int pass = duration - due;
        long passMinutes = TimeUnit.MILLISECONDS.toMinutes(pass);
        long passSeconds = TimeUnit.MILLISECONDS.toSeconds(pass) -
                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(pass));
        long durationMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
        long durationSeconds = TimeUnit.MILLISECONDS.toSeconds(duration) -
                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(duration));
        timePass.setText(String.format(getString(R.string.colon), passMinutes, passSeconds));
        timeDuration.setText(String.format(getString(R.string.colon), durationMinutes, durationSeconds));
    }

    //Methods to create option menu in toolbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nowplaying, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.playlist:
                Toast.makeText(this, "you selected \"Add to playlist\"", Toast.LENGTH_LONG).show();
                return true;
            case R.id.favourite:
                Toast.makeText(this, "you selected \"Add to favourites\"", Toast.LENGTH_LONG).show();
                return true;
            case R.id.add_queue:
                Toast.makeText(this, "you selected \"Add to queue\"", Toast.LENGTH_LONG).show();
                return true;
            case R.id.remove_queue:
                Toast.makeText(this, "you selected \"Remove from queue\"", Toast.LENGTH_LONG).show();
                return true;
            case R.id.album:
                Toast.makeText(this, "you selected \"Go to album\"", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
