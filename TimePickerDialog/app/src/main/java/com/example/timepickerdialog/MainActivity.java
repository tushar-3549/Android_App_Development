package com.example.timepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button button;
    TimePickerDialog timePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.TextViewID);
        button = (Button) findViewById(R.id.ButtonID);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        TimePicker timePicker = new TimePicker(this);
        int currentMinuite = timePicker.getCurrentMinute();
        int currentHour = timePicker.getCurrentHour();
        timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        textView.setText(hourOfDay + " : " +minute);

                    }
                }, currentHour, currentMinuite, true);

        timePickerDialog.show();

    }
}