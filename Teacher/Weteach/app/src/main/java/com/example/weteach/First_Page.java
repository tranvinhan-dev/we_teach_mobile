package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        Button btnLogin = findViewById(R.id.btnLogin);
       btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent _intent = new Intent(First_Page.this,LoginActivity.class);
               First_Page.this.startActivity(_intent);
           }
       });
        Button btnRegister = findViewById(R.id.btnSignUp);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(First_Page.this,SecondPageActivity.class);
                First_Page.this.startActivity(_intent);
            }
        });
    }
}