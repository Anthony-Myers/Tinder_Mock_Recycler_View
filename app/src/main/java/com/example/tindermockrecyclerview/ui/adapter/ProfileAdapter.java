package com.example.tindermockrecyclerview.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tindermockrecyclerview.Profile;
import com.example.tindermockrecyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder> {

    List<Profile> mProfileList;

    public ProfileAdapter(ArrayList<Profile> profiles) {
        mProfileList = profiles;
    }

    @NonNull
    @Override
    public ProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProfileViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.profile_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileViewHolder holder, int position) {
        Profile profile = getItem(position);

        holder.email.setText("Email: "+profile.getEmail());
        holder.name.setText("Name: "+profile.getName());
        holder.gender.setText("Gender: "+profile.getGender());
        if(!profile.isGenderConsent()){
            holder.gender.setText("Gender: HIDDEN");
        }
        holder.birthday.setText("Birthday: "+profile.getBirthMonth()+"/"+profile.getBirthDay()+"/"+profile.getBirthYear());
        holder.schoolName.setText("School: "+profile.getSchool());
    }


    @Override
    public int getItemCount() {
        return mProfileList.size();
    }

    public Profile getItem(int position) {
        return mProfileList.get(position);
    }

    public static class ProfileViewHolder extends RecyclerView.ViewHolder {
        private TextView email;
        private TextView name;
        private TextView gender;
        private TextView birthday;
        private TextView schoolName;

        public ProfileViewHolder(@NonNull View itemView) {
            super(itemView);
            email = itemView.findViewById(R.id.email_tv);
            name = itemView.findViewById(R.id.name_tv);
            gender = itemView.findViewById(R.id.gender_tv);
            birthday = itemView.findViewById(R.id.birthday_tv);
            schoolName = itemView.findViewById(R.id.school_name_tv);
        }

    }
}
