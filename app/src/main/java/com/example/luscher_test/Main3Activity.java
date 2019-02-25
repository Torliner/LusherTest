package com.example.luscher_test;

import android.annotation.SuppressLint;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Random;

public class Main3Activity extends AppCompatActivity {

    public Button cvetButton1;
    public Button cvetButton2;
    public Button cvetButton3;
    public Button cvetButton4;
    public Button cvetButton5;
    public Button cvetButton6;
    public Button cvetButton7;
    public Button cvetButton8;
    public Button NextButton;
    public  int[] cvet = {0,1,2,3,4,5,6,7};
    public int b1,b2,b3,b4,b5,b6,b7,b8;
   public int[] cvet_v1 = new int[8];
   public int[] cvet_v2 = new int[8];
   String otv1,otv2,otv3;
    int posl=0;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        cvetButton1 = findViewById(R.id.button6);
        cvetButton2 = findViewById(R.id.button7);
        cvetButton3 = findViewById(R.id.button8);
        cvetButton4 = findViewById(R.id.button9);
        cvetButton5 = findViewById(R.id.button10);
        cvetButton6 = findViewById(R.id.button11);
        cvetButton7 = findViewById(R.id.button12);
        cvetButton8 = findViewById(R.id.button13);
        NextButton = findViewById(R.id.button3);
        Random rnd = new Random();
        for (int i = cvet.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = cvet[index];
            cvet[index] = cvet[i];
            cvet[i] = a;
        }
            switch (cvet[0]) {
                case 0 : cvetButton1.setBackgroundResource(R.color.blue); b1=1;  break;
                case 1 : cvetButton1.setBackgroundResource(R.color.green); b1=2; break;
                case 2 : cvetButton1.setBackgroundResource(R.color.red); b1=3; break;
                case 3 : cvetButton1.setBackgroundResource(R.color.yellow); b1=4; break;
                case 4 : cvetButton1.setBackgroundResource(R.color.violet); b1=5; break;
                case 5 : cvetButton1.setBackgroundResource(R.color.brown); b1=6; break;
                case 6 : cvetButton1.setBackgroundResource(R.color.black); b1=7; break;
                case 7 : cvetButton1.setBackgroundResource(R.color.grey); b1=8; break;
            }
        switch (cvet[1]) {
            case 0 : cvetButton2.setBackgroundResource(R.color.blue); b2=1; break;
            case 1 : cvetButton2.setBackgroundResource(R.color.green); b2=2; break;
            case 2 : cvetButton2.setBackgroundResource(R.color.red); b2=3; break;
            case 3 : cvetButton2.setBackgroundResource(R.color.yellow); b2=4; break;
            case 4 : cvetButton2.setBackgroundResource(R.color.violet); b2=5; break;
            case 5 : cvetButton2.setBackgroundResource(R.color.brown); b2=6; break;
            case 6 : cvetButton2.setBackgroundResource(R.color.black); b2=7; break;
            case 7 : cvetButton2.setBackgroundResource(R.color.grey); b2=8; break;
        }
        switch (cvet[2]) {
            case 0 : cvetButton3.setBackgroundResource(R.color.blue); b3=1; break;
            case 1 : cvetButton3.setBackgroundResource(R.color.green); b3=2; break;
            case 2 : cvetButton3.setBackgroundResource(R.color.red); b3=3; break;
            case 3 : cvetButton3.setBackgroundResource(R.color.yellow); b3=4; break;
            case 4 : cvetButton3.setBackgroundResource(R.color.violet); b3=5; break;
            case 5 : cvetButton3.setBackgroundResource(R.color.brown); b3=6; break;
            case 6 : cvetButton3.setBackgroundResource(R.color.black); b3=7; break;
            case 7 : cvetButton3.setBackgroundResource(R.color.grey); b3=8; break;
        }
        switch (cvet[3]) {
            case 0 : cvetButton4.setBackgroundResource(R.color.blue); b4=1; break;
            case 1 : cvetButton4.setBackgroundResource(R.color.green); b4=2; break;
            case 2 : cvetButton4.setBackgroundResource(R.color.red); b4=3; break;
            case 3 : cvetButton4.setBackgroundResource(R.color.yellow); b4=4; break;
            case 4 : cvetButton4.setBackgroundResource(R.color.violet); b4=5; break;
            case 5 : cvetButton4.setBackgroundResource(R.color.brown); b4=6; break;
            case 6 : cvetButton4.setBackgroundResource(R.color.black); b4=7; break;
            case 7 : cvetButton4.setBackgroundResource(R.color.grey); b4=8; break;
        }
        switch (cvet[4]) {
            case 0 : cvetButton5.setBackgroundResource(R.color.blue); b5=1; break;
            case 1 : cvetButton5.setBackgroundResource(R.color.green); b5=2; break;
            case 2 : cvetButton5.setBackgroundResource(R.color.red); b5=3; break;
            case 3 : cvetButton5.setBackgroundResource(R.color.yellow); b5=4; break;
            case 4 : cvetButton5.setBackgroundResource(R.color.violet); b5=5; break;
            case 5 : cvetButton5.setBackgroundResource(R.color.brown); b5=6; break;
            case 6 : cvetButton5.setBackgroundResource(R.color.black); b5=7; break;
            case 7 : cvetButton5.setBackgroundResource(R.color.grey); b5=8; break;
        }
        switch (cvet[5]) {
            case 0 : cvetButton6.setBackgroundResource(R.color.blue); b6=1; break;
            case 1 : cvetButton6.setBackgroundResource(R.color.green); b6=2; break;
            case 2 : cvetButton6.setBackgroundResource(R.color.red); b6=3; break;
            case 3 : cvetButton6.setBackgroundResource(R.color.yellow); b6=4; break;
            case 4 : cvetButton6.setBackgroundResource(R.color.violet); b6=5; break;
            case 5 : cvetButton6.setBackgroundResource(R.color.brown); b6=6; break;
            case 6 : cvetButton6.setBackgroundResource(R.color.black); b6=7; break;
            case 7 : cvetButton6.setBackgroundResource(R.color.grey); b6=8; break;
        }
        switch (cvet[6]) {
            case 0 : cvetButton7.setBackgroundResource(R.color.blue); b7=1; break;
            case 1 : cvetButton7.setBackgroundResource(R.color.green); b7=2; break;
            case 2 : cvetButton7.setBackgroundResource(R.color.red); b7=3; break;
            case 3 : cvetButton7.setBackgroundResource(R.color.yellow); b7=4; break;
            case 4 : cvetButton7.setBackgroundResource(R.color.violet); b7=5; break;
            case 5 : cvetButton7.setBackgroundResource(R.color.brown); b7=6; break;
            case 6 : cvetButton7.setBackgroundResource(R.color.black); b7=7; break;
            case 7 : cvetButton7.setBackgroundResource(R.color.grey); b7=8; break;
        }
        switch (cvet[7]) {
            case 0 : cvetButton8.setBackgroundResource(R.color.blue); b8=1;  break;
            case 1 : cvetButton8.setBackgroundResource(R.color.green); b8=2; break;
            case 2 : cvetButton8.setBackgroundResource(R.color.red); b8=3; break;
            case 3 : cvetButton8.setBackgroundResource(R.color.yellow); b8=4; break;
            case 4 : cvetButton8.setBackgroundResource(R.color.violet); b8=5; break;
            case 5 : cvetButton8.setBackgroundResource(R.color.brown); b8=6; break;
            case 6 : cvetButton8.setBackgroundResource(R.color.black); b8=7; break;
            case 7 : cvetButton8.setBackgroundResource(R.color.grey); b8=8; break;
        }

    }

    public void cvetButtonClick1 (View v) {
        if (NextButton.getText().equals("Далее")) {
            cvetButton1.setVisibility(View.INVISIBLE);
            cvet_v1[posl]=b1;
            posl++;
        }
        if (NextButton.getText().equals("Результат")) {
            cvetButton1.setVisibility(View.INVISIBLE);
            cvet_v2[posl]=b1;
            posl++;
        }
    }

    public void cvetButtonClick2 (View v) {
        if (NextButton.getText().equals("Далее")) {
            cvetButton2.setVisibility(View.INVISIBLE);
            cvet_v1[posl] = b2;
            posl++;
        }
        if (NextButton.getText().equals("Результат")) {
            cvetButton2.setVisibility(View.INVISIBLE);
            cvet_v2[posl]=b2;
            posl++;
        }
    }

    public void cvetButtonClick3 (View v) {
        if (NextButton.getText().equals("Далее")) {
            cvetButton3.setVisibility(View.INVISIBLE);
            cvet_v1[posl] = b3;
            posl++;
        }
        if (NextButton.getText().equals("Результат")) {
            cvetButton3.setVisibility(View.INVISIBLE);
            cvet_v2[posl]=b3;
            posl++;
        }
    }

    public void cvetButtonClick4 (View v) {
        if (NextButton.getText().equals("Далее")) {
            cvetButton4.setVisibility(View.INVISIBLE);
            cvet_v1[posl] = b4;
            posl++;
        }
        if (NextButton.getText().equals("Результат")) {
            cvetButton4.setVisibility(View.INVISIBLE);
            cvet_v2[posl]=b4;
            posl++;
        }
    }

    public void cvetButtonClick5 (View v) {
        if (NextButton.getText().equals("Далее")) {
            cvetButton5.setVisibility(View.INVISIBLE);
            cvet_v1[posl] = b5;
            if (posl == 7) { NextButton.setClickable(true); }
            posl++;
        }
        if (NextButton.getText().equals("Результат")) {
            cvetButton5.setVisibility(View.INVISIBLE);
            cvet_v2[posl]=b5;
            posl++;
        }
    }

    public void cvetButtonClick6 (View v) {
        if (NextButton.getText().equals("Далее")) {
            cvetButton6.setVisibility(View.INVISIBLE);
            cvet_v1[posl] = b6;
            posl++;
        }
        if (NextButton.getText().equals("Результат")) {
            cvetButton6.setVisibility(View.INVISIBLE);
            cvet_v2[posl]=b6;
            posl++;
        }
    }

    public void cvetButtonClick7 (View v) {
        if (NextButton.getText().equals("Далее")) {
            cvetButton7.setVisibility(View.INVISIBLE);
            cvet_v1[posl] = b7;
            posl++;
        }
        if (NextButton.getText().equals("Результат")) {
            cvetButton7.setVisibility(View.INVISIBLE);
            cvet_v2[posl]=b7;
            posl++;
        }
    }

    public void cvetButtonClick8 (View v) {
        if (NextButton.getText().equals("Далее")) {
            cvetButton8.setVisibility(View.INVISIBLE);
            cvet_v1[posl] = b8;
            posl++;
        }
        if (NextButton.getText().equals("Результат")) {
            cvetButton8.setVisibility(View.INVISIBLE);
            cvet_v2[posl]=b8;
            posl++;
        }
    }


    public void ButtonNext (View v) {
        if (posl == 8) {
            if (NextButton.getText().equals("Результат")) {
                posl = 0;
                cvetButton1.setVisibility(View.VISIBLE);
                cvetButton2.setVisibility(View.VISIBLE);
                cvetButton3.setVisibility(View.VISIBLE);
                cvetButton4.setVisibility(View.VISIBLE);
                cvetButton5.setVisibility(View.VISIBLE);
                cvetButton6.setVisibility(View.VISIBLE);
                cvetButton7.setVisibility(View.VISIBLE);
                cvetButton8.setVisibility(View.VISIBLE);
                otv1 = String.valueOf(cvet_v1[0]) + String.valueOf(cvet_v1[1]);
                otv2 = String.valueOf(cvet_v2[0]) + String.valueOf(cvet_v2[1]);
                otv3 = String.valueOf(cvet_v2[6]) + String.valueOf(cvet_v2[7]);
                Intent intent = new Intent(this, Main4Activity.class);
                intent.putExtra("otv1",otv1);
                intent.putExtra("otv2",otv2);
                intent.putExtra("otv3",otv3);
                startActivity(intent);
            }
            if (NextButton.getText().equals("Далее")) {
                new CountDownTimer(15000, 1000) {
                    @Override
                    public void onTick(long l) {
                    NextButton.setText("Подождите " + l/1000);
                    }

                    @Override
                    public void onFinish() {
                        posl = 0;
                        NextButton.setText("Результат");
                        Random rnd = new Random();
                        for (int i = cvet.length - 1; i > 0; i--) {
                            int index = rnd.nextInt(i + 1);
                            int a = cvet[index];
                            cvet[index] = cvet[i];
                            cvet[i] = a;
                        }
                        switch (cvet[0]) {
                            case 0: cvetButton1.setBackgroundResource(R.color.blue);b1 = 1;break;
                            case 1: cvetButton1.setBackgroundResource(R.color.green);b1 = 2;break;
                            case 2: cvetButton1.setBackgroundResource(R.color.red);b1 = 3;break;
                            case 3: cvetButton1.setBackgroundResource(R.color.yellow);b1 = 4;break;
                            case 4: cvetButton1.setBackgroundResource(R.color.violet);b1 = 5;break;
                            case 5: cvetButton1.setBackgroundResource(R.color.brown);b1 = 6;break;
                            case 6: cvetButton1.setBackgroundResource(R.color.black);b1 = 7;break;
                            case 7: cvetButton1.setBackgroundResource(R.color.grey);b1 = 8;break;
                        }
                        switch (cvet[1]) {
                            case 0: cvetButton2.setBackgroundResource(R.color.blue);b2 = 1;break;
                            case 1: cvetButton2.setBackgroundResource(R.color.green);b2 = 2;break;
                            case 2: cvetButton2.setBackgroundResource(R.color.red);b2 = 3;break;
                            case 3: cvetButton2.setBackgroundResource(R.color.yellow);b2 = 4;break;
                            case 4: cvetButton2.setBackgroundResource(R.color.violet);b2 = 5;break;
                            case 5: cvetButton2.setBackgroundResource(R.color.brown);b2 = 6;break;
                            case 6: cvetButton2.setBackgroundResource(R.color.black);b2 = 7;break;
                            case 7: cvetButton2.setBackgroundResource(R.color.grey);b2 = 8;break;
                        }
                        switch (cvet[2]) {
                            case 0: cvetButton3.setBackgroundResource(R.color.blue);b3 = 1;break;
                            case 1: cvetButton3.setBackgroundResource(R.color.green);b3 = 2;break;
                            case 2: cvetButton3.setBackgroundResource(R.color.red);b3 = 3;break;
                            case 3: cvetButton3.setBackgroundResource(R.color.yellow);b3 = 4;break;
                            case 4: cvetButton3.setBackgroundResource(R.color.violet);b3 = 5;break;
                            case 5: cvetButton3.setBackgroundResource(R.color.brown);b3 = 6;break;
                            case 6: cvetButton3.setBackgroundResource(R.color.black);b3 = 7;break;
                            case 7: cvetButton3.setBackgroundResource(R.color.grey);b3 = 8;break;
                        }
                        switch (cvet[3]) {
                            case 0: cvetButton4.setBackgroundResource(R.color.blue);b4 = 1;break;
                            case 1: cvetButton4.setBackgroundResource(R.color.green);b4 = 2;break;
                            case 2: cvetButton4.setBackgroundResource(R.color.red);b4 = 3;break;
                            case 3: cvetButton4.setBackgroundResource(R.color.yellow);b4 = 4;break;
                            case 4: cvetButton4.setBackgroundResource(R.color.violet);b4 = 5;break;
                            case 5: cvetButton4.setBackgroundResource(R.color.brown);b4 = 6;break;
                            case 6: cvetButton4.setBackgroundResource(R.color.black);b4 = 7;break;
                            case 7: cvetButton4.setBackgroundResource(R.color.grey);b4 = 8;break;
                        }
                        switch (cvet[4]) {
                            case 0: cvetButton5.setBackgroundResource(R.color.blue);b5 = 1;break;
                            case 1: cvetButton5.setBackgroundResource(R.color.green);b5 = 2;break;
                            case 2: cvetButton5.setBackgroundResource(R.color.red);b5 = 3;break;
                            case 3: cvetButton5.setBackgroundResource(R.color.yellow);b5 = 4;break;
                            case 4: cvetButton5.setBackgroundResource(R.color.violet);b5 = 5;break;
                            case 5: cvetButton5.setBackgroundResource(R.color.brown);b5 = 6;break;
                            case 6: cvetButton5.setBackgroundResource(R.color.black);b5 = 7;break;
                            case 7: cvetButton5.setBackgroundResource(R.color.grey);b5 = 8;break;
                        }
                        switch (cvet[5]) {
                            case 0: cvetButton6.setBackgroundResource(R.color.blue);b6 = 1;break;
                            case 1: cvetButton6.setBackgroundResource(R.color.green);b6 = 2;break;
                            case 2: cvetButton6.setBackgroundResource(R.color.red);b6 = 3;break;
                            case 3: cvetButton6.setBackgroundResource(R.color.yellow);b6 = 4;break;
                            case 4: cvetButton6.setBackgroundResource(R.color.violet);b6 = 5;break;
                            case 5: cvetButton6.setBackgroundResource(R.color.brown);b6 = 6;break;
                            case 6: cvetButton6.setBackgroundResource(R.color.black);b6 = 7;break;
                            case 7: cvetButton6.setBackgroundResource(R.color.grey);b6 = 8;break;
                        }
                        switch (cvet[6]) {
                            case 0: cvetButton7.setBackgroundResource(R.color.blue);b7 = 1;break;
                            case 1: cvetButton7.setBackgroundResource(R.color.green);b7 = 2;break;
                            case 2: cvetButton7.setBackgroundResource(R.color.red);b7 = 3;break;
                            case 3: cvetButton7.setBackgroundResource(R.color.yellow);b7 = 4;break;
                            case 4: cvetButton7.setBackgroundResource(R.color.violet);b7 = 5;break;
                            case 5: cvetButton7.setBackgroundResource(R.color.brown);b7 = 6;break;
                            case 6: cvetButton7.setBackgroundResource(R.color.black);b7 = 7;break;
                            case 7: cvetButton7.setBackgroundResource(R.color.grey);b7 = 8;break;
                        }
                        switch (cvet[7]) {
                            case 0: cvetButton8.setBackgroundResource(R.color.blue);b8 = 1;break;
                            case 1: cvetButton8.setBackgroundResource(R.color.green);b8 = 2;break;
                            case 2: cvetButton8.setBackgroundResource(R.color.red);b8 = 3;break;
                            case 3: cvetButton8.setBackgroundResource(R.color.yellow);b8 = 4;break;
                            case 4: cvetButton8.setBackgroundResource(R.color.violet);b8 = 5;break;
                            case 5: cvetButton8.setBackgroundResource(R.color.brown);b8 = 6;break;
                            case 6: cvetButton8.setBackgroundResource(R.color.black);b8 = 7;break;
                            case 7: cvetButton8.setBackgroundResource(R.color.grey);b8 = 8;break;
                        }
                        cvetButton1.setVisibility(View.VISIBLE);
                        cvetButton2.setVisibility(View.VISIBLE);
                        cvetButton3.setVisibility(View.VISIBLE);
                        cvetButton4.setVisibility(View.VISIBLE);
                        cvetButton5.setVisibility(View.VISIBLE);
                        cvetButton6.setVisibility(View.VISIBLE);
                        cvetButton7.setVisibility(View.VISIBLE);
                        cvetButton8.setVisibility(View.VISIBLE);
                    }
                }.start();

            }
        } else { Toast.makeText(Main3Activity.this,"Выберете наиболее привлекательный цвет",Toast.LENGTH_SHORT).show(); }
    }
}
