package com.example.personalproject;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

//preference.xml must be placed in 'res/xml' folder
public class Settingpage_Preference extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {

        //connect with "settingpage_preference"
        setPreferencesFromResource(R.xml.settingpage_preference, rootKey);
    }
}
