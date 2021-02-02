package com.example.lifelog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class Yuzazyouhou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zyouhou);

        Button btn = (Button)findViewById(R.id.button);
        Button btn2 =(Button)findViewById(R.id.button1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               setContentView(R.layout.settei);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.zyouhou2);
            }
        });
    }
}


