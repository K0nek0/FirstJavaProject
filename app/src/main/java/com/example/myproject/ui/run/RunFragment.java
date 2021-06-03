package com.example.myproject.ui.run;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myproject.databinding.FragmentRunBinding;

public class RunFragment extends Fragment {

    private FragmentRunBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RunViewModel runViewModel = new ViewModelProvider(this).get(RunViewModel.class);

        binding = FragmentRunBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textRun;
        runViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}