package com.example.performance_a;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText editText1, editText2;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button showButton;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editText1=findViewById(R.id.idEditTextID);
        editText2=findViewById(R.id.nameEditTextID);
        radioGroup=findViewById(R.id.radioGroupID);
        textView=findViewById(R.id.resultShowID);
        showButton=findViewById(R.id.showButtonID);


        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = editText1.getText().toString();
                String name = editText2.getText().toString();
                int selectedID = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selectedID);

                textView.setText("ID : "+id+"\nName : "+name+"\nGender :"+radioButton.getText());
            }
        });
    }
}