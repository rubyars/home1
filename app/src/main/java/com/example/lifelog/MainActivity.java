package com.example.lifelog;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //アクションバーを表示させるメソッド
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //main.xmlの内容を読み込む
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    // オプションメニューのアイテムが選択されたときに呼び出されるメソッド
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView varTextView = (TextView) findViewById(R.id.textView);
        switch (item.getItemId()) {
            case R.id.item1:
                varTextView.setText(R.string.menu_item1);
                return true;
            case R.id.item2:
                varTextView.setText(R.string.menu_item2);
                return true;
            case R.id.item3:
                varTextView.setText(R.string.menu_item3);
                return true;
            case R.id.item4:
                varTextView.setText(R.string.menu_item4);
                return true;
            case R.id.item5:
                varTextView.setText(R.string.menu_item5);
                return true;
            case R.id.item6:
                varTextView.setText(R.string.menu_item6);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        ImageButton btn1 = (ImageButton) findViewById(R.id.calendar_button);
        ImageButton btn2 = (ImageButton) findViewById(R.id.camera_button);
        ImageButton btn3 = (ImageButton) findViewById(R.id.iti_button);
        ImageButton btn4 = (ImageButton) findViewById(R.id.memo_button);
        ImageButton btn5 = (ImageButton) findViewById(R.id.seitai_button);
        ImageButton btn6 = (ImageButton) findViewById(R.id.suimin_button);
        ImageButton btn7 = (ImageButton) findViewById(R.id.tyoubo_button);
        ImageButton btn8 = (ImageButton) findViewById(R.id.sumaho_button);
        ImageButton btn9 = (ImageButton) findViewById(R.id.hosuu_button);
        ImageButton btn10 = (ImageButton) findViewById(R.id.imageButton2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        Calender.class );
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        Camera.class );
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        Google_map.class );
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        Memo.class );
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        Seitai.class );
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        Sleep_time.class );
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        Tyoubo.class );
                startActivity(intent);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        Time.class );
                startActivity(intent);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        Walk_counter.class );
                startActivity(intent);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        Kekka.class );
                startActivity(intent);
            }
        });

        }

}