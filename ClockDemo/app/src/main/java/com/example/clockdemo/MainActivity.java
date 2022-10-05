package com.example.clockdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorListenerAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AnalogClock analogClock;
    //DigitalClock digitalClock;
    TextClock textClock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analogClock = (AnalogClock) findViewById(R.id.AnalogClockID);
        textClock = (TextClock) findViewById(R.id.TextClockID);

        analogClock.setOnClickListener(this);
        textClock.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.AnalogClockID){
            Toast.makeText(this, "Analog Clock is Clicked", Toast.LENGTH_SHORT).show();
        }
        if(v.getId() == R.id.TextClockID){
            Toast.makeText(this, "Text Clock is Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}