package com.fadh.tebakgambar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Tebak extends AppCompatActivity {
    ImageView imageViewTebak;
    EditText editTextJawab;
    Button buttonCek;
    String jawaban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tebak);

    setInisialisasi();
    cekJawaban();
    onClickButtonCheck();
    }
    private void setInisialisasi(){
        imageViewTebak = findViewById(R.id.imageView_tebak);
        editTextJawab = findViewById(R.id.editText_jawab);
        buttonCek = findViewById(R.id.button_cek);
    }

    private void cekJawaban(){
        Intent tebakIntent = getIntent();
        String namaIcon = tebakIntent.getStringExtra(MainActivity.KEY_ICON_NAME);
        if(namaIcon.equalsIgnoreCase("Android")){
            imageViewTebak.setImageResource(R.drawable.ic_android);
            jawaban = "Android";
        }else if (namaIcon.equalsIgnoreCase("Virus")){
            imageViewTebak.setImageResource(R.drawable.ic_artificial_intelligence);
            jawaban = "Virus";
        }else if (namaIcon.equalsIgnoreCase("CCTV")){
            imageViewTebak.setImageResource(R.drawable.ic_cctv);
            jawaban = "CCTV";
        }else if (namaIcon.equalsIgnoreCase("Digital")){
            imageViewTebak.setImageResource(R.drawable.ic_digital);
            jawaban = "Digital";
        }else if (namaIcon.equalsIgnoreCase("Stik PS")){
            imageViewTebak.setImageResource(R.drawable.ic_gamepad);
            jawaban = "Stik PS";
        }else if (namaIcon.equalsIgnoreCase("IOT")){
            imageViewTebak.setImageResource(R.drawable.ic_internet_of_things);
            jawaban = "IOT";
        }else if (namaIcon.equalsIgnoreCase("Laptop")){
            imageViewTebak.setImageResource(R.drawable.ic_laptop_screen);
            jawaban = "Laptop";
        }else if (namaIcon.equalsIgnoreCase("Surat Lamaram")){
            imageViewTebak.setImageResource(R.drawable.ic_portfolio);
            jawaban = "Surat Lamaran";
        }
    }
    private void onClickButtonCheck(){
        buttonCek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextJawab.getText().toString().equalsIgnoreCase(jawaban)){
                    Toast.makeText(Tebak.this, "Jawaban Anda Benar" , Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(Tebak.this,"Jawaban Anda Salah", Toast.LENGTH_LONG).show();
                    Toast toast = new Toast(Tebak.this);
                }
            }
        });
    }
    
}