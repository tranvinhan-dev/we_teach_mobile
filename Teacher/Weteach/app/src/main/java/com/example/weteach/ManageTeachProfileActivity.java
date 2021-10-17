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

        btnAddSession = findViewById(R.id.btnAddTeachingProfile);

        btnAddSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toTeaching = new Intent(ManageTeachProfileActivity.this,TeacherRegisterTeachingActivity.class);
                startActivity(toTeaching);
            }
        });

    }
}