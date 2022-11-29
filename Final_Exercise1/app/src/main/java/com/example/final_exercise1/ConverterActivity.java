package com.example.final_exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConverterActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
        editText=findViewById(R.id.usdEditTextID);
        button=findViewById(R.id.convertButtonID);
        textView=findViewById(R.id.outputID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total;
                double amount = Double.parseDouble(editText.getText().toString());
                total = amount*98.00;
                textView.setText("USD to BDT : "+total);
            }
        });
    }
}