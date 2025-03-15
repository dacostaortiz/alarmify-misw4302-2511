package com.misw43022025.alarmify.ui.configs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.misw43022025.alarmify.databinding.FragmentConfigsBinding;

public class ConfigsFragment extends Fragment {

    private FragmentConfigsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ConfigsViewModel configsViewModel =
                new ViewModelProvider(this).get(ConfigsViewModel.class);

        binding = FragmentConfigsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textConfigs;
        configsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}