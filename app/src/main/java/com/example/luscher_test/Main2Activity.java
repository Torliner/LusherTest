package com.example.luscher_test;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    TextView MainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        MainText = findViewById(R.id.textView);
        String text = "Цветовой тест Люшера";
        SpannableString ss = new SpannableString(text);
        ForegroundColorSpan Green = new ForegroundColorSpan(Color.GREEN);
        ForegroundColorSpan Red = new ForegroundColorSpan(Color.RED);
        ForegroundColorSpan Yellow = new ForegroundColorSpan(Color.YELLOW);
        ss.setSpan(Green, 0, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(Red, 9, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(Yellow, 14, 20, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        MainText.setText(ss);
    }

public void ButtonStartTest (View v) {
    Intent intent = new Intent(this,Main3Activity.class);
    startActivity(intent);
}

public void ButtonAbout (View v) {
        Intent intent = new Intent(this,Main5Activity.class);
        startActivity(intent);
}
}
