package com.example.frame_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView imageView1, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1=findViewById(R.id.sakibID);
        imageView2=findViewById(R.id.tusharID);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.sakibID){
            imageView1.setVisibility(v.GONE);
            imageView2.setVisibility(v.VISIBLE);
        }
        else if(v.getId() == R.id.tusharID){
            imageView2.setVisibility(v.GONE);
            imageView1.setVisibility(v.VISIBLE);
        }
    }
}