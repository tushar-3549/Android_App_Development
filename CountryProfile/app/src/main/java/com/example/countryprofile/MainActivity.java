package com.example.countryprofile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladeshBtn,IndiaBtn, PakistanBtn;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshBtn = findViewById(R.id.BangladeshBtnID);
        IndiaBtn = findViewById(R.id.IndiaBtnID);
        PakistanBtn = findViewById(R.id.pakistanBtnID);


        bangladeshBtn.setOnClickListener(this);
        IndiaBtn.setOnClickListener(this);
        PakistanBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.BangladeshBtnID){
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }
        if(v.getId() == R.id.IndiaBtnID){
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }
        if(v.getId() == R.id.pakistanBtnID){
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name","pakistan");
            startActivity(intent);
        }
    }
    public void onBackPressed(){
        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setIcon(R.drawable.bell);
        alertDialogBuilder.setTitle("Alert Message  for you !");
        alertDialogBuilder.setMessage("Do you Want to Exit?");
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertDialogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}