package com.example.spinner_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    TextView textView;
    Button button;
    String[] gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gender = getResources().getStringArray(R.array.gender_list);
        spinner = (Spinner) findViewById(R.id.spinnerID);
        button = (Button) findViewById(R.id.buttonID);
        textView = (TextView) findViewById(R.id.textViewID);

        ArrayAdapter<String>  adapter = new ArrayAdapter<String>(this,R.layout.sample_view,R.id.textViewSampleID,gender);
        spinner.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = spinner.getSelectedItem().toString();
                Toast.makeText(MainActivity.this, "Selected on "+value, Toast.LENGTH_SHORT).show();
            }
        });

    }
}