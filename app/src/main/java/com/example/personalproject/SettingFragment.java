package com.example.personalproject;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


public class SettingFragment extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settingfragment);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frameLayout ,new Settingpage_Preference())
                .commit();
    }
}