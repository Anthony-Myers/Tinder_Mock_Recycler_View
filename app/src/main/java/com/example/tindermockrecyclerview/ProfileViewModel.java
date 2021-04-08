package com.example.tindermockrecyclerview;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class ProfileViewModel extends ViewModel {
    private ArrayList<Profile> listOfProfiles = new ArrayList<>();
    private Profile curProfile = new Profile();

    public void setProfileEmail(String email) {
        curProfile.setEmail(email);
    }

    public String getProfileEmail() {
        return curProfile.getEmail();
    }

    public void setProfileName(String name) {
        curProfile.setName(name);
    }

    public String getProfileName() {
        return curProfile.getName();
    }

    public void setProfileBirthDay(String birthDay) {
        curProfile.setBirthDay(birthDay);
    }

    public String getProfileBirthDay() {
        return curProfile.getBirthDay();
    }

    public void setProfileBirthMonth(String birthMonth) {
        curProfile.setBirthMonth(birthMonth);
    }

    public String getProfileBirthMonth() {
        return curProfile.getBirthMonth();
    }

    public void setProfileBirthYear(String birthYear) {
        curProfile.setBirthYear(birthYear);
    }

    public String getProfileBirthYear() {
        return curProfile.getBirthYear();
    }

    public void setProfileGender(String gender) {
        curProfile.setGender(gender);
    }

    public String getProfileGender() {
        return curProfile.getGender();
    }

    public void setProfileSchool(String school) {
        curProfile.setSchool(school);
    }

    public String getProfileSchool() {
        return curProfile.getSchool();
    }

    public void setProfileGenderConsent(boolean consent) {
        curProfile.setGenderConsent(consent);
    }

    public boolean getProfileGenderConsent() {
        return curProfile.isGenderConsent();
    }

    public void createPerson() {
        Profile newProfile = new Profile();
        newProfile.setEmail(curProfile.getEmail());
        newProfile.setName(curProfile.getName());
        newProfile.setBirthDay(curProfile.getBirthDay());
        newProfile.setBirthMonth(curProfile.getBirthMonth());
        newProfile.setBirthYear(curProfile.getBirthYear());
        newProfile.setGender(curProfile.getGender());
        newProfile.setGenderConsent(curProfile.isGenderConsent());
        newProfile.setSchool(curProfile.getSchool());

        listOfProfiles.add(newProfile);
    }

    public void clearProfile(){
        curProfile.setEmail("");
        curProfile.setName("");
        curProfile.setBirthDay("");
        curProfile.setBirthMonth("");
        curProfile.setBirthYear("");
        curProfile.setGenderConsent(false);
        curProfile.setGender("");
        curProfile.setSchool("");
    }

    public ArrayList<Profile> getListOfProfiles() {
        return listOfProfiles;
    }
}
