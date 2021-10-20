package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class HireDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hire_detail);
        TextView btnApprove = findViewById(R.id.btnChange);
        Dialog m = new Dialog(HireDetailActivity.this);
        btnApprove.setClickable(true);
        btnApprove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m.setContentView(R.layout.calendar_popup_startdate);
                m.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                m.show();
            }
        });
        Button btnHire = findViewById(R.id.btnHire);
        btnHire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(HireDetailActivity.this, PaymentForHiredActivity.class);
                startActivity(_intent);
            }
        });
    }

}