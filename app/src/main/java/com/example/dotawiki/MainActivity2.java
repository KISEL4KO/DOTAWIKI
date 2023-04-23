package com.example.dotawiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         /** ID  linearLayout*/
        LinearLayout linearLayout = findViewById(R.id.linearLayout1);
        LinearLayout linearLayout2 = findViewById(R.id. linearLayout2);

        /** Создаем слушателя на 1 linearLayout*/
        View.OnClickListener listener = new View.OnClickListener() {
            // делаем обработчик для intent
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this ,  CharacterActivity.class);
                startActivity(intent);
                Log.i("Character","good"); // лог для проверки
            }
        };

        /** Создаем слушателя на 1 linearLayout*/
        View.OnClickListener listener2 = new View.OnClickListener() {
            // делаем обработчик для intent
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this ,  ToolsActivity.class);
                startActivity(intent);
                Log.i("Tools","good");// лог для проверки
            }
        };

        linearLayout.setOnClickListener(listener);// Навешиваем слушателя на 1 linearLayout
        linearLayout2.setOnClickListener(listener2); //Навешиваем слушателя на 2 linearLayout

    }
}