package com.fadh.tebakgambar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView , imageView2, imageView3 , imageView4, imageView5, imageView6, imageView7, imageView8;
    public static final String KEY_ICON_NAME = "nama_icon";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInisialisasi();
        oneClickIcon();
    }


    private void setInisialisasi() {
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
    }
    private void oneClickIcon() {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageViewSendIntent = new Intent(MainActivity.this,Tebak.class);
                imageViewSendIntent.putExtra(KEY_ICON_NAME, "imageview");
                startActivity(imageViewSendIntent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageView2SendIntent = new Intent(MainActivity.this,Tebak.class);
                imageView2SendIntent.putExtra(KEY_ICON_NAME,"imageView2");
                startActivity(imageView2SendIntent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageView3SendIntent = new Intent(MainActivity.this, Tebak.class);
                imageView3SendIntent.putExtra(KEY_ICON_NAME, "imageView3");
                startActivity(imageView3SendIntent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageView4SendIntent = new Intent(MainActivity.this, Tebak.class);
                imageView4SendIntent.putExtra(KEY_ICON_NAME, "imageView4");
                startActivity(imageView4SendIntent);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageView5SendIntent = new Intent(MainActivity.this, Tebak.class);
                imageView5SendIntent.putExtra(KEY_ICON_NAME, "imageView5");
                startActivity(imageView5SendIntent);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageView6SendIntent = new Intent(MainActivity.this, Tebak.class);
                imageView6SendIntent.putExtra(KEY_ICON_NAME, "imageView6");
                startActivity(imageView6SendIntent);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageView7SendIntent = new Intent(MainActivity.this, Tebak.class);
                imageView7SendIntent.putExtra(KEY_ICON_NAME, "imageView7");
                startActivity(imageView7SendIntent);
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent imageView8SendIntent = new Intent(MainActivity.this, Tebak.class);
                imageView8SendIntent.putExtra(KEY_ICON_NAME, "imageView8");
                startActivity(imageView8SendIntent);
            }
        });
    }
}