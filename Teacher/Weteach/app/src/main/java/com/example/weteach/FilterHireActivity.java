package com.example.weteach;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.slider.LabelFormatter;
import com.google.android.material.slider.RangeSlider;
import com.google.android.material.slider.Slider;

import java.util.List;

public class FilterHireActivity extends AppCompatActivity {
    RangeSlider sl ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_hire);
        sl = findViewById(R.id.rlPrice);
        sl.addOnChangeListener(new RangeSlider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull RangeSlider slider, float value, boolean fromUser) {
                EditText edtMin  = findViewById( R.id.edtMin);
                EditText edtMax  = findViewById( R.id.edtMax);
                List<Float> tmp  = slider.getValues();
                int number1 = Math.round((tmp.get(0)*1000)/100);
                edtMin.setText(number1+"");
                int number2 = Math.round((tmp.get(1)*1000)/100);
                edtMax.setText(number2+"");
            }
        });
        sl.setLabelFormatter(new LabelFormatter() {
            @NonNull
            @Override
            public String getFormattedValue(float value) {
                int number = Math.round((value*1000)/100);
                //It is just an example
                return "$" + number ;
            }
        });
    }
}