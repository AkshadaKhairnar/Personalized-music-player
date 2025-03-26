package com.example.akmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=(Button)findViewById(R.id.b1);
        bt2=(Button)findViewById(R.id.b2);
        bt3=(Button)findViewById(R.id.b3);
        bt4=(Button)findViewById(R.id.b4);
        bt5=(Button)findViewById(R.id.b5);
        bt6=(Button)findViewById(R.id.b6);
        bt7=(Button)findViewById(R.id.b7);
        bt8=(Button)findViewById(R.id.b8);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Intent.ACTION_VIEW);
                i1.setData(Uri.parse("https://music.youtube.com/watch?v=vxUBYHz_q1I"));
                startActivity(i1);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Intent.ACTION_VIEW);
                i2.setData(Uri.parse("https://music.youtube.com/watch?v=PEM0Vs8jf1w"));
                startActivity(i2);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Intent.ACTION_VIEW);
                i3.setData(Uri.parse("https://music.youtube.com/watch?v=KWEsdF57hB4"));
                startActivity(i3);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(Intent.ACTION_VIEW);
                i4.setData(Uri.parse("https://music.youtube.com/watch?v=ORrFJ63nlcA"));
                startActivity(i4);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(Intent.ACTION_VIEW);
                i5.setData(Uri.parse("https://music.youtube.com/watch?v=GlMExeJMAGs"));
                startActivity(i5);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(Intent.ACTION_VIEW);
                i6.setData(Uri.parse("https://music.youtube.com/watch?v=2g-p76-r33I"));
                startActivity(i6);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7=new Intent(Intent.ACTION_VIEW);
                i7.setData(Uri.parse("https://music.youtube.com/watch?v=k-WWmSZE8RM"));
                startActivity(i7);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i8);
            }
        });

    }
}