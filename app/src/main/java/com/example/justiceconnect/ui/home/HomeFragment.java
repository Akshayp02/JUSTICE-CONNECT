package com.example.justiceconnect.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.example.justiceconnect.Emergency;
import com.example.justiceconnect.GovScheme;
import com.example.justiceconnect.R;
import com.example.justiceconnect.databinding.FragmentHomeBinding;
import com.example.justiceconnect.rulesofnation;
import com.example.justiceconnect.ui.Emergency.SlideshowFragment;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        binding.emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Emergency.class);

                startActivity(intent);
            }
        });

        binding.rulls
                .setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), rulesofnation.class);
                                            startActivity(intent);
                                        }
                                    }
                );

        binding.govScheme
                .setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), GovScheme.class);
                                            startActivity(intent);
                                        }
                                    }
                );

        binding.Ecompliant
                .setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent intent = new Intent(getActivity(), com.example.justiceconnect.Ecompliant.class);
                                            startActivity(intent);
                                        }
                                    }
                );

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}