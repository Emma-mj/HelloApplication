package com.example.helloapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HActivity extends AppCompatActivity {

    TextView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hactivity);

        v= (TextView) findViewById(R.id.textView);
        Intent i = getIntent();

        v.setText("hello,"+i.getStringExtra("personName"));

    }
}