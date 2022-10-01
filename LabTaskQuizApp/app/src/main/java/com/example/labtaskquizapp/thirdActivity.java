package com.example.labtaskquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class thirdActivity extends AppCompatActivity {

    int totalmarks=0;
    TextView outputView, showRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent myGetIntent= getIntent();
        totalmarks= myGetIntent.getIntExtra("Total_marks",0);
        outputView=findViewById(R.id.outputTextviewID);
        showRes=findViewById(R.id.showText);
        outputView.setText("You get "+totalmarks+" out of 10");

    }
    public void tryAgainFunction(View view) {
        Intent myIntent=new Intent(this,MainActivity.class);
        startActivity(myIntent);
    }

}