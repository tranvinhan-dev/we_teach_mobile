package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ClassDetailsActivity extends AppCompatActivity {

    private Button btnJoin;
    private ImageView btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_details);
        btnJoin = findViewById(R.id.btnJoin);
        btnJoin.setClickable(true);
        btnJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClassDetailsActivity.this, MeetLoadingActivity.class);
                ClassDetailsActivity.this.startActivity(intent);
            }
        });
        btnBack = findViewById(R.id.btnBack);
        btnBack.setClickable(true);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClassDetailsActivity.this, MeetFragment.class);
                ClassDetailsActivity.this.startActivity(intent);
            }
        });
    }
}