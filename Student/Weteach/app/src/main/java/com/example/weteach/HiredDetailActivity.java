    package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

    public class HiredDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hired_detail);
        Button btnChat = findViewById(R.id.btnChat);
        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(HiredDetailActivity.this, ChatActivity.class);
                startActivity(_intent);
            }
        });
        Button btnFeedback = findViewById(R.id.btnFeedback);
        btnFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(HiredDetailActivity.this, FeedbackStudentActivity.class);
                startActivity(_intent);
            }
        });
        Button btnCancel = findViewById(R.id.btnRCancel);
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(HiredDetailActivity.this, RequestRemoveActivity.class);
                startActivity(_intent);
            }
        });
        Button btnPayment = findViewById(R.id.btnPayment2);
        btnPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(HiredDetailActivity.this, PaymentTeacherActivity.class);
                startActivity(_intent);
            }
        });
    }
}