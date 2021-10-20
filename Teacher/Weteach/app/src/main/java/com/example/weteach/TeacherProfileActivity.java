package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeacherProfileActivity extends AppCompatActivity {
private Button btnViewIC;
private Button btnViewCT;
private Dialog dialogIC;
private Dialog dialogCT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_profile);
        btnViewCT = (Button) findViewById(R.id.btnViewCT);
        btnViewIC = (Button) findViewById(R.id.btnViewIC);

        btnViewIC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogIC.setContentView(R.layout.teacher_ic_popup_picture);
                dialogIC.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            }
        });
        btnViewCT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogCT.setContentView(R.layout.teacher_certificate_popup_picture);
                dialogIC.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            }
        });
    }
}