package com.example.weteach;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class TeacherRegisterTeachingActivity extends AppCompatActivity {
    private Button btnThurday;
    private Button btnSat;
    private Button btnSun;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_register_teaching);
        dialog = new Dialog(this);
        btnThurday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setPopup(dialog);
            }
        });
        btnSat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setPopup(dialog);
            }
        });
        btnSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setPopup(dialog);
            }
        });

        Spinner spinner = findViewById(R.id.spinnerSubject);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.Subject, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


    }
    private void setPopup(Dialog dialog){
        dialog.setContentView(R.layout.teacher_register_popup);
        dialog.setCancelable(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
}