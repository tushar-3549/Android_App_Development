package com.example.labtaskquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class secondActivity extends AppCompatActivity {

    int previousmarks=0;
    int recentmarks=0;

    RadioGroup myq2RadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent myGetIntent= getIntent();
        previousmarks= myGetIntent.getIntExtra("Marks_of_Q1",0);
        myq2RadioGroup=findViewById(R.id.q2radioGroupID);
        
    }
    public void submitFunction(View view) {
        if(myq2RadioGroup.getCheckedRadioButtonId()==R.id.q2radioBtn4ID){
            recentmarks=5;
        }
        Intent myIntent=new Intent(this,thirdActivity.class);
        myIntent.putExtra("Total_marks",previousmarks+recentmarks);
        startActivity(myIntent);
    }

    public void preFunction(View view) {
        Intent myIntent=new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }

}