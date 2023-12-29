package com.example.listexamples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Spinner spinner;

    AutoCompleteTextView autoCompleteTextView;

    ArrayList<String> arrName = new ArrayList<>();
    ArrayList<String> arrLanguages = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);



        arrName.add("Mohammad");
        arrName.add("Usama");
        arrName.add("Ahmed");
        arrName.add("Arham");
        arrName.add("Taha");
        arrName.add("Kashif");
        arrName.add("Ali");
        arrName.add("Mohammad");
        arrName.add("Usama");
        arrName.add("Ahmed");
        arrName.add("Arham");
        arrName.add("Taha");
        arrName.add("Kashif");
        arrName.add("Ali");
        arrName.add("Kashif");
        arrName.add("Ali");
        arrName.add("Mohammad");
        arrName.add("Usama");
        arrName.add("Ahmed");
        arrName.add("Arham");
        arrName.add("Taha");
        arrName.add("Kashif");
        arrName.add("Ali");
        arrName.add("Kashif");
        arrName.add("Ali");
        arrName.add("Mohammad");
        arrName.add("Usama");
        arrName.add("Ahmed");
        arrName.add("Arham");
        arrName.add("Taha");
        arrName.add("Kashif");
        arrName.add("Ali");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1, arrName);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            if(position % 2 == 0) {
                Toast.makeText(MainActivity.this, "Clicked Item", Toast.LENGTH_SHORT).show();
            }
        });

        // spinner
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> spinnerAdapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_dropdown_item, arrName);
        spinner.setAdapter(spinnerAdapter);


        // auto complete

        arrLanguages.add("C");
        arrLanguages.add("Java");
        arrLanguages.add("C++");
        arrLanguages.add("Python");
        arrLanguages.add("Dart");
        arrLanguages.add("JavaScript");
        arrLanguages.add("C#");
        arrLanguages.add("PHP");
        arrLanguages.add("GO Lang");
        arrLanguages.add("Swift");

        ArrayAdapter<String> autoComplete = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrLanguages);
        autoCompleteTextView = findViewById(R.id.autoCom);

        autoCompleteTextView.setAdapter(autoComplete);
        autoCompleteTextView.setThreshold(1);








    }
}