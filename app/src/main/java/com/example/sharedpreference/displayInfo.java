package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class displayInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
        String display = preferences.getString("display", "");

        TextView displayInfo = (TextView) findViewById(R.id.textViewName);
        displayInfo.setText(display);

    }
}