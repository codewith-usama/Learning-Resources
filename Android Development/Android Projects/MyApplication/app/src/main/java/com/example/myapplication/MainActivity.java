package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView txtAnim;
    Button btnAlpha, btnTranslate, btnRotate, btnScale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnim = findViewById(R.id.txtAnim);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnTranslate = findViewById(R.id.btnTranslate);
        btnRotate = findViewById(R.id.btnRotate);
        btnScale = findViewById(R.id.btnScale);



        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation move = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
                txtAnim.startAnimation(move);
            }
        });
        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation alpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                txtAnim.startAnimation(alpha);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
                txtAnim.startAnimation(rotate);
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation scale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                txtAnim.startAnimation(scale);
            }
        });
    }
}