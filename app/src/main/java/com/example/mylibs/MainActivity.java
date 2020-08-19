package com.example.mylibs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.daimajia.numberprogressbar.NumberProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    NumberProgressBar numberProgressBar;
    private Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberProgressBar=findViewById(R.id.number_progress_bar);


        numberProgressBar.setMax(100);
        numberProgressBar.setProgress(26);


        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        numberProgressBar.incrementProgressBy(1);
                    }
                });
            }
        }, 1000, 100);
    }
}