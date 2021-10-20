package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentForHiredActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_for_hired);
        Button btnPayment2 = findViewById(R.id.btnPayment2);
        btnPayment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(PaymentForHiredActivity.this, RequestSuccessActivity.class);
                startActivity(_intent);
            }
        });
    }
}