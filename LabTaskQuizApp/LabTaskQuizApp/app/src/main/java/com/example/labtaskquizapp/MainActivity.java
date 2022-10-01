package com.example.labtaskquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup myq1RadioGroup;
    int q1marks=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myq1RadioGroup=findViewById(R.id.q1radioGroupID);
    }

    public void nextFunction(View view) {
        if(myq1RadioGroup.getCheckedRadioButtonId()==R.id.q1radioBtn1ID){
            q1marks=5;
        }
        Intent myIntent=new Intent(this,secondActivity.class);
        myIntent.putExtra("Marks_of_Q1",q1marks);
        startActivity(myIntent);
    }
}