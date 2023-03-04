package com.example.task1_s92060869;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playButton(View view) {
        if (mediaPlayer==null)
            mediaPlayer = MediaPlayer.create(this, R.raw.bgm);
        mediaPlayer.start();
    }

    public void pauseButton(View view) {
        mediaPlayer.pause();
    }

    public void stopButton(View view) {
        mediaPlayer.stop();
        mediaPlayer=null;
    }
}