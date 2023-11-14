package com.example.a2023_app;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.Toast;

public class MyDialogFragment extends DialogFragment {

    String title = "Выбор есть всегда";
    String message = "Выбери пищу";
    String button2String = "START";
    String button1String = "END";


    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setButton1String(String button1String) {
        this.button1String = button1String;
    }

    public void setButton2String(String button2String) {
        this.button2String = button2String;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {


        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(title);
        builder.setMessage(message);
        builder.setIcon(R.drawable.sad);
      //  builder.
        builder.setPositiveButton(button1String, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {


                Toast.makeText(getActivity(), "ВЫ СДЕЛАЛИ ПРАВИЛЬНЫЙ ВЫБОР", Toast.LENGTH_LONG).show();

            }
        });
        builder.setNegativeButton(button2String, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "ВОЗМОЖНО ВЫ ПРАВЫ", Toast.LENGTH_LONG).show();
            }
        });
        builder.setCancelable(true);
        return builder.create();
    }
}

