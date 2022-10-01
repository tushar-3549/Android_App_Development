package com.example.intenttask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView outputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        outputView = (TextView) findViewById(R.id.outputTextViewID);


        Intent mygetent = getIntent();
        String name = mygetent.getStringExtra("userdata");

        outputView.setText("Welcome "+name);
    }
}