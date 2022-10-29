package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView = (ImageView) findViewById(R.id.ImageViewID);
        textView = (TextView) findViewById(R.id.textViewID);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){

             String countryName = bundle.getString("name");
             showDetails(countryName);
        }
    }
    void showDetails(String countryName){
        if(countryName.equals("bangladesh")){
            imageView.setImageResource(R.drawable.bd);
            textView.setText(R.string.bd_info);
        }
        if(countryName.equals("india")){
            imageView.setImageResource(R.drawable.ind);
            textView.setText(R.string.ind_info);
        }
        if(countryName.equals("pakistan")){
            imageView.setImageResource(R.drawable.pak);
            textView.setText(R.string.pak_info);
        }
    }

}