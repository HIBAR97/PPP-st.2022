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



        btnPicMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //takePic으로 이동
                Intent intent = new Intent (getApplicationContext(), takePic.class);
                startActivity(intent);
            }
        });

        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Setting으로 이동
                Intent intent = new Intent(getApplicationContext(), Setting.class);
                startActivity(intent);
            }
        });
    }

}

