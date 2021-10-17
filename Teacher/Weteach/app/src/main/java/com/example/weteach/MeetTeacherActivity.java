package com.example.weteach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MeetTeacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meet_teacher);
        ImageButton ibFullscreen = findViewById(R.id.ibFullScreen);
        ibFullscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(MeetTeacherActivity.this, FullScreenActivity.class);
                startActivity(_intent);
            }
        });
    }
}