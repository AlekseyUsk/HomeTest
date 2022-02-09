package com.example.myhometest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btn1;
    Button btn2;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        /**ОДИН ОБРАБОТЧИК ДЛЯ НЕСКОЛЬКИХ КНОПОК*/
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btn1:
                        tvOut.setText("Нажата кнопка 1");
                        break;
                    case R.id.btn2:
                        tvOut.setText("Нажата кнопка 2");
                        break;
                    case R.id.btn3:
                        tvOut.setText("Нажата кнопка 3");
                        break;
                }
            }
        };
        /**ПОСЛЕ ТОГО КАК СОЗДАЛ ОБРАБОТЧИК НАДО НАЗНАЧИТЬ ЕГО КНОПКАМ*/
        btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
        btn3.setOnClickListener(onClickListener);

    tvOut.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            btn3.setText("СМЕНИЛ КНОПКУ");
        }
    });


    }
}







