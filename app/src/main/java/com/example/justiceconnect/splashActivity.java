package com.example.justiceconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.justiceconnect.databinding.ActivitySplashBinding;

public class splashActivity extends AppCompatActivity {


     private ActivitySplashBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // to change status bar color
        getWindow().setStatusBarColor(getResources().getColor(R.color.white));

        // this is splash screen activity

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        }, 30000);


    }
}