package com.example.performance_d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button button;
    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button=findViewById(R.id.resultshowID);
        editText=findViewById(R.id.editTextID);
        radioGroup=findViewById(R.id.radioGroupID);
        radioButton1=findViewById(R.id.usdID);
        radioButton2=findViewById(R.id.euroID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double amount = Double.parseDouble(editText.getText().toString());
                if(radioButton1.isChecked()){
                    double tk1 = amount*104.80;
                    Toast.makeText(MainActivity2.this, "After Convert BDT Amount : "+tk1, Toast.LENGTH_SHORT).show();
                }
                else if(radioButton2.isChecked()){
                    double tk2 = amount*105.26;
                    Toast.makeText(MainActivity2.this, "After Convert BDT Amount : "+tk2, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}