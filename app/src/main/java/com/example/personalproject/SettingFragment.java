package com.example.personalproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

    //extend "AppCompatActivity" (For defined activity in "Manifest")
public class SettingFragment extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Button btnBack;
        btnBack = (Button)findViewById(R.id.btnBack);

        //Connect layout
        setContentView(R.layout.settingfragment);

        //Connect Preference using Manager
        getSupportFragmentManager()
                .beginTransaction()

                //frameLayout -> Settingpage_Preference replace
                .replace(R.id.frameLayout ,new Settingpage_Preference())
                .commit();


        //뒤로가기 버튼 리스너
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Main으로 이동
                finish();
            }
        });
    }
}