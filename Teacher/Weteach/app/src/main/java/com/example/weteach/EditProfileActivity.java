package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditProfileActivity extends AppCompatActivity {
private Button btnSaveChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
        btnSaveChange = findViewById(R.id.btnSaveChange);

        btnSaveChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent save = new Intent(EditProfileActivity.this,TeacherProfileActivity.class);
                startActivity(save);
            }
        });
    }
}