package com.example.a2023_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;


public class On_Start_MainActivity extends AppCompatActivity {

    String slovo = "ГЛАЗ";
    int[] myArray = new int[4];

    Button buttonGrey1;
    Button buttonGrey2;
    Button buttonGrey3;
    Button buttonGrey4;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.on_start_activity);

        buttonGrey1 = (Button) findViewById(R.id.image_gray1);
        buttonGrey2 = (Button) findViewById(R.id.image_gray2);
        buttonGrey3 = (Button) findViewById(R.id.image_gray3);
        buttonGrey4 = (Button) findViewById(R.id.image_gray4);
        button1 = (Button) findViewById(R.id.key_1);
        button2 = (Button) findViewById(R.id.key_2);
        button3 = (Button) findViewById(R.id.key_3);
        button4 = (Button) findViewById(R.id.key_4);
        button5 = (Button) findViewById(R.id.key_5);
        button6 = (Button) findViewById(R.id.key_6);
        button7 = (Button) findViewById(R.id.key_7);
        button8 = (Button) findViewById(R.id.key_8);
        button9 = (Button) findViewById(R.id.key_9);
        button0 = (Button) findViewById(R.id.key_0);

    }

    public void clickNumber1(View view) {
        buttonGrey1.setText("1");
    }

    public void clickNumber2(View view) {
        buttonGrey2.setText("2");
    }

    public void clickNumber3(View view) {
        buttonGrey3.setText("3");
    }

    public void clickNumber4(View view) {
        buttonGrey4.setText("4");
    }

    public int numButton() {
        String num;
        num = buttonGrey1.getText().toString();
        if (num.equals("null")) return 1;
        if (num.equals("1")) return 2;
        if (num.equals("2")) return 3;
        return 4;
    }

}