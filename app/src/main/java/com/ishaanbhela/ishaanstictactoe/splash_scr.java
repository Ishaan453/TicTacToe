package com.ishaanbhela.ishaanstictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash_scr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_scr);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(splash_scr.this, MainActivity.class));
                finish();
            }
        }, 2000);
    }
}