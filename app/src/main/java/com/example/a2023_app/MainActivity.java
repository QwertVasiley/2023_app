package com.example.a2023_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button startButton = (Button) findViewById(R.id.key_start);  //
        startButton.setOnClickListener((view ->
                startButton.setBackgroundResource(R.drawable.ic_launcher_background)));
        try {
            Intent intent = new Intent(MainActivity.this, On_Start_MainActivity.class);
            startActivity(intent);
            finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}