package com.example.personalproject;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

    //extend "AppCompatActivity" (For defined activity in "Manifest")
public class SettingFragment extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Connect layout
        setContentView(R.layout.settingfragment);

        //Connect Preference using Manager
        getSupportFragmentManager()
                .beginTransaction()

                //frameLayout -> Settingpage_Preference replace
                .replace(R.id.frameLayout ,new Settingpage_Preference())
                .commit();
    }
}