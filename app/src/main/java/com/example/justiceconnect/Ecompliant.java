package com.example.justiceconnect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.justiceconnect.databinding.ActivityEcompliantBinding;
import com.example.justiceconnect.databinding.ActivityEmergencyBinding;

public class Ecompliant extends AppCompatActivity {

    ActivityEcompliantBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecompliant);
        binding = ActivityEcompliantBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        binding.LISTbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Ecompliant.this, "YOUR COMPLIANT LISTED", Toast.LENGTH_SHORT).show();
            }
        });
    }
}