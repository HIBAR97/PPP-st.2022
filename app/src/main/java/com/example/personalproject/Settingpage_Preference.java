package com.example.personalproject;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceManager;

//preference.xml must be placed in 'res/xml' folder
public class Settingpage_Preference extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {

        //connect with "settingpage_preference"
        setPreferencesFromResource(R.xml.settingpage_preference, rootKey);

    }
}
