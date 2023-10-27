package com.example.a2023_app;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class On_Start_MainActivity extends AppCompatActivity {
    Button buttonGrey1;
    Button buttonGrey2;
    Button buttonGrey3;
    Button buttonGrey4;

    Button buttonGrey21;
    Button buttonGrey22;
    Button buttonGrey23;
    Button buttonGrey24;
    Button buttonGrey31;
    Button buttonGrey32;
    Button buttonGrey33;
    Button buttonGrey34;
    Button buttonGrey41;
    Button buttonGrey42;
    Button buttonGrey43;
    Button buttonGrey44;


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
    Button undo;
    Button enter;
    int numButtonLine = 0;
    String compNum;
    char[] arrCharNumComp = new char[4];
    char[] arrCharNumUser = new char[4];

    char[] arrGreenNum = new char[4];
    char[] arrYeloNum = new char[4];

    private int currentViewIndex = 0;
    private Handler handler = new Handler();

    LinearLayout buttonLinerLayoutGray1;
    LinearLayout buttonLinerLayoutGray2;
    LinearLayout buttonLinerLayoutGray3;
    LinearLayout buttonLinerLayoutGray4;
    int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.on_start_activity);

        compNum = GameLogic.rand();
        arrCharNumComp = compNum.toCharArray();
        numButtonLine++;
        System.out.println("Линия кнопок ввода чисел" + numButtonLine);
        System.out.println("Число задуманное компьютером " + compNum);

        buttonGrey1 = (Button) findViewById(R.id.image_gray1);
        buttonGrey2 = (Button) findViewById(R.id.image_gray2);
        buttonGrey3 = (Button) findViewById(R.id.image_gray3);
        buttonGrey4 = (Button) findViewById(R.id.image_gray4);

        buttonGrey21 = (Button) findViewById(R.id.image_gray21);
        buttonGrey22 = (Button) findViewById(R.id.image_gray22);
        buttonGrey23 = (Button) findViewById(R.id.image_gray23);
        buttonGrey24 = (Button) findViewById(R.id.image_gray24);

        buttonGrey31 = (Button) findViewById(R.id.image_gray31);
        buttonGrey32 = (Button) findViewById(R.id.image_gray32);
        buttonGrey33 = (Button) findViewById(R.id.image_gray33);
        buttonGrey34 = (Button) findViewById(R.id.image_gray34);

        buttonGrey41 = (Button) findViewById(R.id.image_gray41);
        buttonGrey42 = (Button) findViewById(R.id.image_gray42);
        buttonGrey43 = (Button) findViewById(R.id.image_gray43);
        buttonGrey44 = (Button) findViewById(R.id.image_gray44);

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
        undo = (Button) findViewById(R.id.undo);
        enter = (Button) findViewById(R.id.enter);

        Button[] btn = new Button[16];
        btn[0] = buttonGrey1;
        btn[1] = buttonGrey2;
        btn[2] = buttonGrey3;
        btn[3] = buttonGrey4;
        btn[4] = buttonGrey21;
        btn[5] = buttonGrey22;
        btn[6] = buttonGrey23;
        btn[7] = buttonGrey24;
        btn[8] = buttonGrey31;
        btn[9] = buttonGrey32;
        btn[10] = buttonGrey33;
        btn[11] = buttonGrey34;
        btn[12] = buttonGrey41;
        btn[13] = buttonGrey42;
        btn[14] = buttonGrey43;
        btn[15] = buttonGrey44;
        showViewsSequentialli(btn);


    }

    private void showViewsSequentialli(Button[] buttons) {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (currentViewIndex < buttons.length) {
                    buttons[currentViewIndex].setVisibility(View.VISIBLE);
                    //  buttons[currentViewIndex].setSoundEffectsEnabled();
                    currentViewIndex++;
                    handler.postDelayed(this, 80);
                }
            }
        }, 80);
    }


    public void clickNumber1(View view) {
        String a = "1";
        numButton(a);
        schelk();
        vibration ();
    }

    public void clickNumber2(View view) {
        String a = "2";
        numButton(a);
        schelk();
        vibration ();
    }

    public void clickNumber3(View view) {
        String a = "3";
        numButton(a);
        schelk();
        vibration ();
    }

    public void clickNumber4(View view) {
        String a = "4";
        numButton(a);
        schelk();
        vibration ();
    }

    public void clickNumber5(View view) {
        String a = "5";
        numButton(a);
        schelk();
        vibration ();
    }

    public void clickNumber6(View view) {
        String a = "6";
        numButton(a);
        schelk();
        vibration ();
    }

    public void clickNumber7(View view) {
        String a = "7";
        numButton(a);
        schelk();
        vibration ();
    }

    public void clickNumber8(View view) {
        String a = "8";
        numButton(a);
        schelk();
        vibration ();
    }

    public void clickNumber9(View view) {
        String a = "9";
        numButton(a);
        schelk();
        vibration ();
    }

    public void clickNumber0(View view) {
        String a = "0";
        numButton(a);
        schelk();
        vibration ();
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

    public void clickUndo(View view) {
        String a = "";
        undoKey();
        schelk();
        vibration ();
    }

    public void clickEnter(View view) {
        if (buttonGrey4.getText().toString() != "") {

            arrCharNumUser[0] = buttonGrey1.getText().toString().charAt(0);
            arrCharNumUser[1] = buttonGrey2.getText().toString().charAt(0);
            arrCharNumUser[2] = buttonGrey3.getText().toString().charAt(0);
            arrCharNumUser[3] = buttonGrey4.getText().toString().charAt(0);
            System.out.println(arrCharNumUser);
            arrGreenNum = GameLogic.tru(arrCharNumComp, arrCharNumUser); //проверка на полное совпадение

            if (arrGreenNum[0] == 1)
                buttonGrey1.setBackgroundResource(R.drawable.green);
            if (arrGreenNum[1] == 1)
                buttonGrey2.setBackgroundResource(R.drawable.green);
            if (arrGreenNum[2] == 1)
                buttonGrey3.setBackgroundResource(R.drawable.green);
            if (arrGreenNum[3] == 1)
                buttonGrey4.setBackgroundResource(R.drawable.green);

            arrYeloNum = GameLogic.yeloTru(arrCharNumComp, arrCharNumUser); //проверка на желтые
            if (arrYeloNum[0] == 1)
                buttonGrey1.setBackgroundResource(R.drawable.yellow);
            if (arrYeloNum[1] == 1)
                buttonGrey2.setBackgroundResource(R.drawable.yellow);
            if (arrYeloNum[2] == 1)
                buttonGrey3.setBackgroundResource(R.drawable.yellow);
            if (arrYeloNum[3] == 1)
                buttonGrey4.setBackgroundResource(R.drawable.yellow);

            schelk();
            vibration ();
            newLineGrayButton(arrCharNumUser, view);
        }
    }

    void undoKey() {
        String num;
        num = buttonGrey4.getText().toString();
        if (num != "") {
            buttonGrey4.setText("");
        } else {
            num = buttonGrey3.getText().toString();
            if (num != "") {
                buttonGrey3.setText("");
            } else {
                num = buttonGrey2.getText().toString();
                if (num != "") {
                    buttonGrey2.setText("");
                } else {
                    num = buttonGrey1.getText().toString();
                    if (num != "") {
                        buttonGrey1.setText("");
                    }
                }
            }
        }
    }

    private void newLineGrayButton(char[] buttons, View view) {
        buttonLinerLayoutGray2 = (LinearLayout) findViewById(R.id.buttonLinerLayoutGray2);
        arrCharNumUser = new char[4];

//        arrCharNumUser[0] = buttonGrey21.getText().toString().charAt(0);
//        arrCharNumUser[1] = buttonGrey22.getText().toString().charAt(0);
//        arrCharNumUser[2] = buttonGrey21.getText().toString().charAt(0);
//        arrCharNumUser[3] = buttonGrey22.getText().toString().charAt(0);

//        buttonGrey21.setVisibility(View.VISIBLE);
//        buttonGrey22.setVisibility(View.VISIBLE);
//        buttonGrey23.setVisibility(View.VISIBLE);
//        buttonGrey24.setVisibility(View.VISIBLE);
    }
    public void schelk (){
        MediaPlayer.create(this, R.raw.schelk).start();
    }
    public void vibration (){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.O) {
            vibrator.vibrate(VibrationEffect.createOneShot(50,VibrationEffect.DEFAULT_AMPLITUDE));
        } else {
            vibrator.vibrate(50);
        }
    }
}