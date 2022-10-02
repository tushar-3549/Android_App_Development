package com.example.mycheckboxdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox option1, option2, option3, option4;
    Button showButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        option1 = (CheckBox) findViewById(R.id.option1ID);
        option2 = (CheckBox) findViewById(R.id.option2ID);
        option3 = (CheckBox) findViewById(R.id.option3ID);
        option4 = (CheckBox) findViewById(R.id.option4ID);

        showButton = (Button) findViewById(R.id.buttonID);
        resultTextView = (TextView) findViewById(R.id.resultTextView);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if(option1.isChecked()){
                    String res = option1.getText().toString();
                    stringBuilder.append(res + " city where I live in"+ "\n");
                }
                if(option2.isChecked()){
                    String res = option2.getText().toString();
                    stringBuilder.append(res + " city where I live in"+ "\n");
                }
                if(option3.isChecked()){
                    String res = option3.getText().toString();
                    stringBuilder.append(res + " city where I live in"+ "\n");
                }
                if(option4.isChecked()){
                    String res = option4.getText().toString();
                    stringBuilder.append(res + " city where I live in"+ "\n");
                }
                resultTextView.setText(stringBuilder);
            }
        });
    }
}