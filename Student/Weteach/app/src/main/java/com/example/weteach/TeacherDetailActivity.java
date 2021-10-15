package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeacherDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_detail);
        Button btnHire = findViewById(R.id.btnHire);
        btnHire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _inten = new Intent(TeacherDetailActivity.this, HireDetailActivity.class);
                startActivity(_inten);
            }
        });
    }
}