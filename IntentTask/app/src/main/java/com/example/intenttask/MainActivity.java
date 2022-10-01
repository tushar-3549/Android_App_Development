package com.example.intenttask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String username, password;
    EditText nameEditText;
    EditText userEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userEditText = (EditText) findViewById(R.id.usernameEdiTTextId);
        passwordEditText = (EditText) findViewById(R.id.passwordEdiTTextId);
    }

    public void func(View view) {
        username = userEditText.getText().toString();
        password = passwordEditText.getText().toString();
        if(password.equals("3549")) {
            Intent myIntent = new Intent(this, MainActivity2.class);
            myIntent.putExtra("userdata", username);
            startActivity(myIntent);
        }
        else {
            Toast.makeText(this, "Wrong username and password", Toast.LENGTH_SHORT).show();
        }
    }
}