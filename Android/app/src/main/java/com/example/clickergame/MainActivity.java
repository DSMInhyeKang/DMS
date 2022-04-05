package com.example.clickergame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView result;
    Button btnup;
    Button btndown;
    Button btnreset;

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.result);
        btnup = findViewById(R.id.btnup);
        btndown = findViewById(R.id.btndown);
        btnreset = findViewById(R.id.btnreset);


        btnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count + 1; //count++;
                result.setText(String.valueOf(count));
            }
        });


        btndown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;//count = count -1;
                result.setText(String.valueOf(count));
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                result.setText(String.valueOf(0));
            }
        });


    }



}