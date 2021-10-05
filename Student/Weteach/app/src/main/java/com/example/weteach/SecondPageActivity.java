package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SecondPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        Button btnStudent = findViewById(R.id.btnStudent);
        ImageView btnBack = findViewById(R.id.btnBack3);
        btnBack.setClickable(true);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        btnStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(SecondPageActivity.this,StudentSignUpFragment.class);
                SecondPageActivity.this.startActivity(_intent);
            }
        });
        Button btnTeacher = findViewById(R.id.btnTeacher);
        btnTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(SecondPageActivity.this,TeacherSignUpFragment.class);
                SecondPageActivity.this.startActivity(_intent);
            }
        });
    }
}