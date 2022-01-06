package com.example.personalproject;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPicMove;
        Button btnSet;

        btnPicMove = (Button)findViewById(R.id.btnPicMove);
        btnSet = (Button)findViewById(R.id.btnSet);


        //Pic functuion Listener
        btnPicMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Move to "takePic" page
                Intent intent = new Intent (getApplicationContext(), takePic.class);
                startActivity(intent);
            }
        });

        //Setting function Listener
        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Move to SettingFragment
                Intent intent = new Intent(getApplicationContext(), SettingFragment.class);
                startActivity(intent);
            }
        });
    }

}

