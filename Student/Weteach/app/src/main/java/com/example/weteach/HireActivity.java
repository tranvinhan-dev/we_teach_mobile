package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HireActivity extends AppCompatActivity {
    ImageView ivFilter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hire);

        ivFilter = findViewById(R.id.ivFilter3);
        ivFilter.setClickable(true);
        ivFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(HireActivity.this, FilterHireActivity.class);
                startActivity(_intent);
            }
        });
    }
}