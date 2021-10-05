package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TeacherSignUpFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_sign_up_fragment);
        ImageView btnBack2 = findViewById(R.id.btnBack2);
        btnBack2.setClickable(true);
        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        Button btnSignin2 = findViewById(R.id.btnSignIn2);
        btnSignin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(TeacherSignUpFragment.this,LoginActivity.class);
                TeacherSignUpFragment.this.startActivity(_intent);
            }
        });
    }
}