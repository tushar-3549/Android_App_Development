package com.example.performance_c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {

    EditText editText1, editText2, editText3;
    Button button1;
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText1=findViewById(R.id.nameID);
        editText2=findViewById(R.id.heightID);
        editText3=findViewById(R.id.weightID);
        button1=findViewById(R.id.showButtonID);
        radioGroup=findViewById(R.id.radioGroupID);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editText1.getText().toString();
                String height = editText2.getText().toString();
                String weight = editText3.getText().toString();

                int selectedID = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selectedID);

                String select = radioButton.getText().toString();

                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("NAME",name);
                intent.putExtra("HEIGHT",height);
                intent.putExtra("WEIGHT",weight);
                intent.putExtra("gender",select);

                startActivity(intent);
            }
        });
    }
}