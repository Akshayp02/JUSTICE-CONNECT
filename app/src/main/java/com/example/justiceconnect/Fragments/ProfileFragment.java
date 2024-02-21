package com.example.justiceconnect.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.justiceconnect.R;
import com.example.justiceconnect.databinding.FragmentCybercrimeComplaintBinding;
import com.example.justiceconnect.databinding.FragmentProfileBinding;

public class ProfileFragment extends Fragment {


    private FragmentProfileBinding binding;
    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =FragmentProfileBinding.inflate(inflater, container, false);



        return binding.getRoot();
    }
}