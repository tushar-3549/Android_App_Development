package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_item,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.settingID){
            Toast.makeText(this, "Setting is Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId() == R.id.profileID){
            Toast.makeText(this, "Profile is Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId() == R.id.homeID){
            Toast.makeText(this, "Home is Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId() == R.id.feedback){
            Toast.makeText(this, "Feed Back is Clicked", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}