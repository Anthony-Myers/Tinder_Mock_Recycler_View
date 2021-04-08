package com.example.tindermockrecyclerview.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tindermockrecyclerview.ProfileViewModel;
import com.example.tindermockrecyclerview.databinding.ProfilesFragmentBinding;
import com.example.tindermockrecyclerview.ui.adapter.ProfileAdapter;
import com.example.tindermockrecyclerview.R;

public class ProfilesFragment extends Fragment {

    ProfilesFragmentBinding binding;
    ProfileViewModel mProfileViewModel;

    public ProfilesFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = ProfilesFragmentBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mProfileViewModel = new ViewModelProvider(requireActivity()).get(ProfileViewModel.class);
        RecyclerView profilesRv = binding.profilesRv;
        ProfileAdapter profileAdapter = new ProfileAdapter(mProfileViewModel.getListOfProfiles());
        profilesRv.setAdapter(profileAdapter);
        profilesRv.setLayoutManager(new LinearLayoutManager(requireContext()));

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(profilesRv.getContext(), DividerItemDecoration.VERTICAL);
        profilesRv.addItemDecoration(dividerItemDecoration);

        binding.continueButton.setOnClickListener(v -> {
            NavHostFragment.findNavController(this).navigate(R.id.action_profiles_fragment_pop);
        });
    }
}
