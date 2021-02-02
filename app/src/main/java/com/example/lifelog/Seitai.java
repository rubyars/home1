package com.example.lifelog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class Seitai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seitai_kakunin);
        ImageButton btn = (ImageButton)findViewById(R.id.hensyu_button);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seitai.this,
                        Seitai2.class );
                startActivity(intent);
            }
        });


    }
}


