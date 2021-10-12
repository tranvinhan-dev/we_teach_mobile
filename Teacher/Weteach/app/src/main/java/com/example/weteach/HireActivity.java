package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HireActivity extends AppCompatActivity {
    ImageView ivFilter ;
    CardView cvTeacher;
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

        cvTeacher = findViewById(R.id.cvTeacher);
        cvTeacher.setClickable(true);
        cvTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(HireActivity.this, TeacherDetailActivity.class);
                startActivity(_intent);
            }
        });
    }
}