package com.example.lenovo.services1;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
MediaPlayer mediaPlayer;
    SeekBar seekbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View view)
    {
        mediaPlayer = MediaPlayer.create(this, R.raw.dawn);
       mediaPlayer.start();
    }
    public void stop(View view)
    {
     mediaPlayer.stop();
    }
}
