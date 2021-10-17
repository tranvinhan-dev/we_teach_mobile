package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateQuizActivity extends AppCompatActivity {

    private Button btnBack;
    private Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_quiz);
        btnBack.findViewById(R.id.btnBack);
        btnBack.setClickable(true);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent _intent = new Intent(CreateQuizActivity.this,QuizListFragment.class);
                CreateQuizActivity.this.startActivity(_intent);
            }
        });
        btnSave.findViewById(R.id.btnSave);
        btnSave.setClickable(true);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent _intent = new Intent(CreateQuizActivity.this,QuizListFragment.class);
                CreateQuizActivity.this.startActivity(_intent);
            }
        });
    }
}