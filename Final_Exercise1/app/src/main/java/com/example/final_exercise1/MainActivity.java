package com.example.final_exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] qs;
    String selectedValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listViewID);
        List<String>list=new ArrayList<String>();
        list.add("BMI Calculator");
        list.add("USD to BDT Converter");
        list.add("Your ID");
        list.add("About me");

        ArrayAdapter arrayAdapter=new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent=new Intent(MainActivity.this, BmiActivity.class);
                    startActivity(intent);
                }
                else if(position == 1){
                    Intent intent1=new Intent(MainActivity.this, ConverterActivity.class);
                    startActivity(intent1);
                }
                else if(position == 2){
                    Toast.makeText(MainActivity.this, "You are selected on Your ID ListView", Toast.LENGTH_SHORT).show();
                }
                else if(position == 3){
                    Toast.makeText(MainActivity.this, "You are selected on About me ListView", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}