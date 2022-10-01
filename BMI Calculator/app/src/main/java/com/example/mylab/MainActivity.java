package com.example.mylab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText height, weight;
    TextView resultText;
    String calculation, bmiResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height = (EditText) findViewById(R.id.weightId);
        weight = (EditText) findViewById(R.id.heightId);
        resultText = (TextView) findViewById(R.id.resultId);

    }

    public void func(View view) {
        String s1 = height.getText().toString();
        String s2 = weight.getText().toString();

        float heightValue = Float.parseFloat(s1) / 100;
        float weightValue = Float.parseFloat(s2);


        float bmi = (weightValue)/(heightValue * heightValue);
        if(bmi < 18.5){
            bmiResult = "Surely under Weight";
        }
        else if(bmi > 18.5 && bmi <= 25.0){
            bmiResult = "Normal Weight";
        }
        else if(bmi > 25.0 && bmi <= 30){
            bmiResult = "Over Weight";
        }
        else {
            bmiResult = "Under Weight Class 1,2,3";
        }
        calculation = "Result:\n\n\n" + bmi + "\n" + bmiResult;
        resultText.setText(calculation);
    }
}