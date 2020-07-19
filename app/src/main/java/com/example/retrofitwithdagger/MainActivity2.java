package com.example.retrofitwithdagger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.getName);
        number = findViewById(R.id.getNumber);

        Intent intent = getIntent();
        String nameS = intent.getStringExtra("name");
        String numberS = intent.getStringExtra("number");

        name.setText(nameS);
        number.setText(numberS);
    }
}