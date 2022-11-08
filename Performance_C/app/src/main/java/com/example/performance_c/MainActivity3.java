package com.example.performance_c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        resultText=findViewById(R.id.setResultTV);
        Intent intent=getIntent();
        String name=intent.getStringExtra("NAME");
        String height=intent.getStringExtra("HEIGHT");
        String weight=intent.getStringExtra("WEIGHT");
        String select=intent.getStringExtra("gender");

        resultText.setText("Name : "+name+"\nHeight : "+height+"\nWeight : "+weight+"\nGender : "+select);
    }
}