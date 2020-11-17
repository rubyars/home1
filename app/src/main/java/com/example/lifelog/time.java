package com.example.lifelog;


import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Locale;

public class time extends AppCompatActivity {

    private Timer timer;
    // 'Handler()' is deprecated as of API 30: Android 11.0 (R)
    private final Handler handler = new Handler(Looper.getMainLooper());

    private TextView timerText;
    private long delay, period;
    private int count;

    private final SimpleDateFormat dataFormat =
            new SimpleDateFormat("HH:mm:ss", Locale.US);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sumaho_time);

        delay = 0;
        period = 100;

        Button startButton = findViewById(R.id.start_button);
        Button stopButton = findViewById(R.id.stop_button);

        timerText = findViewById(R.id.timer);
        timerText.setText(dataFormat.format(0));

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != timer) {
                    timer.cancel();
                    timer = null;
                }

                // Timer インスタンスを生成
                timer = new Timer();

                // カウンター
                count = 0;
                timerText.setText(dataFormat.format(0));

                timer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        // handlerdを使って処理をキューイングする
                        handler.post(new Runnable() {
                            public void run() {
                                count++;
                                timerText.setText(dataFormat.
                                        format(count*period));
                            }
                        });
                    }
                }, delay, period);
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // timer がnullでない、起動しているときのみcancleする
                if (null != timer) {
                    // Cancel
                    timer.cancel();
                    timer = null;
                    timerText.setText(dataFormat.format(0));

                }
            }
        });
    }
}