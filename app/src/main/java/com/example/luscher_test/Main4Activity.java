package com.example.luscher_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main4Activity extends AppCompatActivity {

    public String[] lines = new String[330];
    public TextView ResultText;
    String otv1,otv2,otv3;
    String text1,text2,text3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ResultText = findViewById(R.id.textView8);
        Intent intent = getIntent();
        otv1 = getIntent().getExtras().getString("otv1");
        otv2 = getIntent().getExtras().getString("otv2");
        otv3 = getIntent().getExtras().getString("otv3");
        try {
            InputStream File_Quest = getAssets().open("lusher.txt");
            InputStreamReader words = new InputStreamReader(File_Quest);
            BufferedReader buffer = new BufferedReader(words);
            for (int i = 0; i < 330; i++) {
                lines[i] = buffer.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i=0;i<55;i++) {
            if (otv1.equals(lines[i].substring(0,2))) {
            text1 = lines[i].substring(2);
            }
        }
        for (int i=55;i<110;i++) {
            if (otv2.equals(lines[i].substring(0,2))) {
                text2 = lines[i].substring(2);
            }
        }
        for (int i=110;i<165;i++) {
            if (otv3.equals(lines[i].substring(0,2))) {
                text3 = lines[i].substring(2);
            }
        }
        ResultText.setText(text1+"\n"+text2+"\n"+text3+"\n");
    }

    public void ButtonOk (View v) {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
