package com.example.lab_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] gender = {"Female","Male"};
    Spinner myspinner;
    String name, id, selectgender;
    EditText nameEditText, idEditText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myspinner=findViewById(R.id.spinnerID);
        nameEditText=findViewById(R.id.nameEditTextID);
        idEditText=findViewById(R.id.idEditTextID);
        button=findViewById(R.id.buttonID);
        ArrayAdapter myAA = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,gender);
        myAA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myAA);
        myspinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        selectgender=gender[position];
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void function(View view) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = myspinner.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, "You are Clicked on "+value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}