package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Bigger extends AppCompatActivity {

    ImageView pic;
    MediaPlayer sound;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigger);
        setTitle("You are in Bigger");

        sound = new MediaPlayer();

        sound = MediaPlayer.create(this, R.raw.track2);

        playing = 0;

        pic = (ImageView) findViewById(R.id.imageView2);

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (playing) {
                    case 0:
                        sound.start();
                        playing = 1;
                        break;
                    case 1:
                        sound.pause();
                        playing = 0;
                        break;
                }
            }
        });
    }
}