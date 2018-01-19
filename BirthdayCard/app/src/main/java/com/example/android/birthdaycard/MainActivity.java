package com.example.android.birthdaycard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Typeface;
import android.widget.TextView;
import android.animation.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Font path
        String fontPath = "Fonts/Super Mario Bros.ttf";

        // text view label
        TextView txtHappyBirthday = (TextView) findViewById(R.id.happyBirthday);
        TextView txtToNick = (TextView) findViewById(R.id.toNick);

        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        // Applying font
        txtHappyBirthday.setTypeface(tf);
        txtToNick.setTypeface(tf);


    }
}
