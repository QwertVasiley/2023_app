package com.example.a2023_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class On_Start_MainActivity extends AppCompatActivity {

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
        String a = "1";
        numButton(a);
    }

    public void clickNumber2(View view) {
        String a = "2";
        numButton(a);
    }

    public void clickNumber3(View view) {
        String a = "3";
        numButton(a);
    }

    public void clickNumber4(View view) {
        String a = "4";
        numButton(a);
    }
    public void clickNumber5(View view) {
        String a = "5";
        numButton(a);
    }
    public void clickNumber6(View view) {
        String a = "6";
        numButton(a);
    }
    public void clickNumber7(View view) {
        String a = "7";
        numButton(a);
    }
    public void clickNumber8(View view) {
        String a = "8";
        numButton(a);
    }
    public void clickNumber9(View view) {
        String a = "9";
        numButton(a);
    }
    public void clickNumber0(View view) {
        String a = "0";
        numButton(a);
    }
    void numButton(String a) {
        String num;
        num = buttonGrey1.getText().toString();
        if (num.equals("")) {
            buttonGrey1.setText(a);
        } else {
            num = buttonGrey2.getText().toString();
            if (num.equals("")) {
                buttonGrey2.setText(a);
            } else {
                num = buttonGrey3.getText().toString();
                if (num.equals("")) {
                    buttonGrey3.setText(a);
                } else {
                    num = buttonGrey4.getText().toString();
                    if (num.equals("")) {
                        buttonGrey4.setText(a);
                    }
                }
            }
        }
    }
}