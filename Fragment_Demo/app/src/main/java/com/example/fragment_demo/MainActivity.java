package com.example.fragment_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    Fragment fragment;
    String[] name={"Tushar", "Sakib Al Hasan", "Maruf", "Tamim", "Riyad","Musfiq", "Masrafi"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listViewID);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        if(position == 0){
            fragment=new TusharFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentID,fragment).commit();
        }
        else if(position == 1){
            fragment=new SakibFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentID,fragment).commit();
        }
    }
}