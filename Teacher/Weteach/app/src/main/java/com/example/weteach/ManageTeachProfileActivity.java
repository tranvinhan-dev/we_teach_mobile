package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManageTeachProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_teach_profile);
        Button btnEdit = findViewById(R.id.btnEditTexhingProfile);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent  = new Intent(ManageTeachProfileActivity.this, EditProfileTeachinhActivity.class);
                startActivity(_intent);
            }
        });
    }
}