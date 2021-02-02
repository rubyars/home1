package com.example.lifelog;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class Camera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picture);

        ImageButton btn = (ImageButton)findViewById(R.id.syasin_button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View s) {
                Intent intent = new Intent(Camera.this,
                        Camera2.class );
                startActivity(intent);
            }
        });
    }
}


