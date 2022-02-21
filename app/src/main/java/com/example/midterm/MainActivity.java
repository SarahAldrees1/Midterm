package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView pic;
    MediaPlayer sound;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("You are in Activity1");

        sound = new MediaPlayer();

        sound = MediaPlayer.create(this, R.raw.track1);

        playing = 0;

        pic = (ImageView) findViewById(R.id.imageView);

        Button go2 = findViewById(R.id.button1);
        Button go3 = findViewById(R.id.button2);


        go2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }
        });
        go3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,MainActivity3.class));}
        });

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