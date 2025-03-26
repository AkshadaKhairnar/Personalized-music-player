package com.example.akmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class MainActivity2 extends AppCompatActivity {
Button bu1,bu2;
MediaPlayer mp;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bu1=(Button) findViewById(R.id.bu1);
        bu2=(Button) findViewById(R.id.bu2);
        mp= new MediaPlayer();
        mp=MediaPlayer.create(getApplicationContext(),R.raw.deva);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();
            }
        });
        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.stop();
            }
        });
    }
}