package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Spinner spinner1, spinner2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.amountEditTextID);
        spinner1=findViewById(R.id.spinner1ID);
        spinner2=findViewById(R.id.spinner2ID);
        button=findViewById((R.id.buttonID));

        String[] from = {"BDT"};
        String[] to = {"RS","USD"};
        ArrayAdapter<String>arrayAdapter1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        spinner1.setAdapter(arrayAdapter1);

        ArrayAdapter<String>arrayAdapter2 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        spinner2.setAdapter(arrayAdapter2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total;
                double amount = Double.parseDouble(editText.getText().toString());
                if(spinner1.getSelectedItem().toString() == "BDT" && spinner2.getSelectedItem().toString() == "RS"){
                    total = amount*2.00;
                    Toast.makeText(MainActivity.this, "BDT to RS : "+total, Toast.LENGTH_LONG).show();
                }
                else if(spinner1.getSelectedItem().toString() == "BDT" && spinner2.getSelectedItem().toString() == "USD"){
                    total = amount*95.00;
                    Toast.makeText(MainActivity.this, "BDT to USD : "+total, Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}