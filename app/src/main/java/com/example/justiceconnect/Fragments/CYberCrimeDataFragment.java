package com.example.justiceconnect.Fragments;

import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.justiceconnect.R;
import com.example.justiceconnect.databinding.FragmentCYberCrimeDataBinding;


public class CYberCrimeDataFragment extends Fragment {

    private FragmentCYberCrimeDataBinding binding;

    public CYberCrimeDataFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCYberCrimeDataBinding.inflate(inflater, container, false);

        binding.Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code here


                String name = binding.name.getText().toString().trim();
                String mobile = binding.mobile.getText().toString().trim();
                String Email = binding.email.getText().toString().trim();
                String subject = binding.Subject.getText().toString().trim();
                String message = binding.SubjectMSG.getText().toString().trim();
                if (binding.name.getText().toString().trim().isEmpty()) {
                    Log.d("Validation", "Name is empty");
                    binding.name.setError("Name is required");
                    binding.name.requestFocus();
                } else if (mobile.isEmpty()) {
                    binding.mobile.setError("Mobile is required");
                    binding.mobile.requestFocus();
                } else if (Email.isEmpty()) {
                    binding.mobile.setError("Email is required");
                    binding.mobile.requestFocus();
                } else if (subject.isEmpty()) {
                    binding.Subject.setError("Subject is required");
                    binding.Subject.requestFocus();
                } else if (message.isEmpty()) {
                    binding.mobile.setError("Message is required");
                    binding.mobile.requestFocus();
                }else {
                    // show the alert dialog box
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setTitle("Success");
                    builder.setMessage("Your Data has been submitted successfully");
                    builder.setPositiveButton("OK", null);
                    builder.show();
                }
            }
        });

        return binding.getRoot();
    }


}