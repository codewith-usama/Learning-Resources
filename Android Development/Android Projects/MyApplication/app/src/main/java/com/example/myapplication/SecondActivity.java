package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent fromAct = getIntent();
        String name = fromAct.getStringExtra("name");
        int age = fromAct.getIntExtra("Age", -1);

        TextView txtView = findViewById(R.id.textView);

        txtView.setText("Name" + name);
//        getSupportActionBar().setTitle(name);

    }
}