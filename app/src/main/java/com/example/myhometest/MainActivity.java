package com.example.myhometest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvOut;
    Button btn1;
    Button btn2;
    Button btn3;

    private static final String TAG = "myLog";

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.settings:
                Toast.makeText(getApplicationContext(),
                        "настройки",Toast.LENGTH_LONG).show();
                return true;

            case R.id.action_item1:
                Toast.makeText(getApplicationContext(),
                        "ТЕМА 1",Toast.LENGTH_LONG).show();
                break;
            case R.id.action_item2:
                Toast.makeText(getApplicationContext(),
                        "ТЕМА 2",Toast.LENGTH_LONG).show();
                break;
            case R.id.action_item3:
                Toast.makeText(getApplicationContext(),
                        "ТЕМА 3",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvOut = (TextView) findViewById(R.id.tvOut);
        btn1 = (Button) findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Обработаем нажатие кнопки");

                /** ВСПЛЫВАЮЩИЕ УВЕДОМЛЕНИЯ
                 *ИНИЦИАЛИЗИРУЕМ ОБЬЕКТ КЛАССА Toast
                 *СТАТИЧЕСКИЙ МЕТОД MakeText создает View для отображения текста уведомления
                 *пареметры метода дают доступ к ресурсам базового приложения (MainActivity.this,"....",время)
                 * и задаем второй параметр это текст который надо показать
                 * третий параметр это время на сколько надо высветить уведомление*/
                Toast toast = Toast.makeText(MainActivity.this, "нажата кнопка 1", Toast.LENGTH_LONG);

                toast.setGravity(Gravity.CENTER, 0, 0); // можно менять располоение уведомления по осям Х и Y
                /** ДОБАВИМ КАРТИНКУ В РЕСУРСЫ drawable - чтобы она выскакивала в уведомлении Toast*/
                // ПРИМЕР :
                LinearLayout toastImage = (LinearLayout) toast.getView();
                ImageView imageView = new ImageView(MainActivity.this);
                imageView.setImageResource(R.drawable.petuh);
                toastImage.addView(imageView, 1);// задал расположение рисунка

                //после создания Toast для отображения его на экране вызывается метод show
                toast.show();// вызвал

            }
        });

    }
}










