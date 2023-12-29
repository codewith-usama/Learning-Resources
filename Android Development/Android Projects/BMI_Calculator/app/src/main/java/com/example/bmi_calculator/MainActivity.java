package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edit_weight, edit_height_ft, edit_height_inch;
        Button btn;
        TextView txt_result;
        LinearLayout linearLayout;

        edit_weight = findViewById(R.id.edit_weight);
        edit_height_ft = findViewById(R.id.edit_height_ft);
        edit_height_inch = findViewById(R.id.edit_height_inch);
        btn = findViewById(R.id.btn);
        txt_result = findViewById(R.id.txt_result);
        linearLayout = findViewById(R.id.root_id);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int weight = Integer.parseInt(edit_weight.getText().toString());
                int height_ft = Integer.parseInt(edit_height_ft.getText().toString());
                int height_inch = Integer.parseInt(edit_height_inch.getText().toString());
                int total_inch = height_ft * 12 + height_inch;
                double total_centimeter = total_inch * 2.53;
                double total_meter = total_centimeter / 100;

                double bmi = weight / (total_meter*total_meter);

                if(bmi > 25) {
                    txt_result.setText(R.string.OverWeight);
                    linearLayout.setBackgroundColor(getResources().getColor(R.color.OverWeight));
                }
                else if(bmi < 18) {
                    txt_result.setText(R.string.UnderWeight);
                    linearLayout.setBackgroundColor(getResources().getColor(R.color.UnderWeight));
                }
                else {
                    txt_result.setText(R.string.Healthy);
                    linearLayout.setBackgroundColor(getResources().getColor(R.color.Healthy));
                }
            }
        });
    }
}