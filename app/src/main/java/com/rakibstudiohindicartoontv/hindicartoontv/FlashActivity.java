package com.rakibstudiohindicartoontv.hindicartoontv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class FlashActivity extends AppCompatActivity {
    private ProgressBar pro_bar;
    private int progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        // requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        getSupportActionBar().hide();
        pro_bar = findViewById(R.id.progressBarID);


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                runProgressBar();
                startMainactivity();

            }
        });

        thread.start();
    }

    private void startMainactivity() {
        Intent i = new Intent(FlashActivity.this,MainActivity.class);
        startActivity(i);
        finish();

    }

    private void runProgressBar() {

        for(progress = 20; progress<=100; progress=progress+20){
            try {
                Thread.sleep(200);
                pro_bar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
