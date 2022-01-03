package com.example.personalproject;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class takePic extends AppCompatActivity {

    final int TAKE_PICTURE = 1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        Button btnPic;
        btnPic = (Button)findViewById(R.id.btnPic);

        //화면 이동
        super.onCreate(savedInstanceState);
        setContentView(R.layout.takepic);

        //버튼 리스터
        btnPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnPic:
                        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivityForResult(cameraIntent, TAKE_PICTURE);
                        break;
                }
            }
        });
    }

    // 카메라로 촬영한 사진의 썸네일을 가져와 이미지뷰에 띄워줌
    @Override protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        ImageView ivPic;
        ivPic = (ImageView)findViewById(R.id.ivPic);
        super.onActivityResult(requestCode, resultCode, intent);

        switch (requestCode) { case TAKE_PICTURE: if (resultCode == RESULT_OK && intent.hasExtra("data")) {
            Bitmap bitmap = (Bitmap) intent.getExtras().get("data");

            if (bitmap != null) {
                ivPic.setImageBitmap(bitmap);
            }
        }break;
        }
    }

}
