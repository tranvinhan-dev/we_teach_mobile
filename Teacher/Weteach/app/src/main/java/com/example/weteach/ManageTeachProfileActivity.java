package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManageTeachProfileActivity extends AppCompatActivity {
private Button btnViewSession1;
private Button btnAddSession;
private Button btnViewSession2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_teach_profile);
        btnViewSession1 = findViewById(R.id.btnViewSession1);
        btnViewSession2 = findViewById(R.id.btnViewSession2);
        btnAddSession = findViewById(R.id.btnAddTeachingProfile);

        btnAddSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toTeaching = new Intent(ManageTeachProfileActivity.this,TeacherRegisterTeachingActivity.class);
                startActivity(toTeaching);
            }
        });
        btnViewSession1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toTeaching1 = new Intent(ManageTeachProfileActivity.this,TeacherRegisterTeachingActivity.class);
                startActivity(toTeaching1);
            }
        });
        btnViewSession2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toTeaching1 = new Intent(ManageTeachProfileActivity.this,TeacherRegisterTeachingActivity.class);
                startActivity(toTeaching1);
            }
        });
    }
}