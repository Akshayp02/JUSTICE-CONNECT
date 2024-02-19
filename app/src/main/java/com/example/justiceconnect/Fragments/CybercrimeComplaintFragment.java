package com.example.justiceconnect.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.justiceconnect.R;
import com.example.justiceconnect.databinding.FragmentCybercrimeComplaintBinding;


public class CybercrimeComplaintFragment extends Fragment {
     FragmentCybercrimeComplaintBinding binding;

    public CybercrimeComplaintFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentCybercrimeComplaintBinding.inflate(inflater, container, false);
        // code here


        binding.ECommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code here
                CYberCrimeDataFragment fragment = new CYberCrimeDataFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.nav_host_fragment_content_main, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        binding.facebokFraud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code here
                CYberCrimeDataFragment fragment = new CYberCrimeDataFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.nav_host_fragment_content_main, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        binding.InstagramFraud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code here
                CYberCrimeDataFragment fragment = new CYberCrimeDataFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.nav_host_fragment_content_main, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        binding.jobFraudCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code here
                CYberCrimeDataFragment fragment = new CYberCrimeDataFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.nav_host_fragment_content_main, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        binding.Loan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code here
                CYberCrimeDataFragment fragment = new CYberCrimeDataFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.nav_host_fragment_content_main, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        binding.othter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code here
                CYberCrimeDataFragment fragment = new CYberCrimeDataFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.nav_host_fragment_content_main, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        binding.LuckyDraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code here
                CYberCrimeDataFragment fragment = new CYberCrimeDataFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.nav_host_fragment_content_main, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        } );

        binding.ECommerce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code here
                CYberCrimeDataFragment fragment = new CYberCrimeDataFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.nav_host_fragment_content_main, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
        binding.Insurence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code here
                CYberCrimeDataFragment fragment = new CYberCrimeDataFragment();
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.nav_host_fragment_content_main, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });




        return binding.getRoot();
    }
}