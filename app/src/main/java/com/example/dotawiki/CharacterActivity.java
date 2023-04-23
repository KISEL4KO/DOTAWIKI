package com.example.dotawiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CharacterActivity extends AppCompatActivity {
    ImageView juggernaut = findViewById(R.id.imageView4);
    ImageView pudge  = findViewById(R.id. imageView5);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);
        View.OnClickListener listener = new View.OnClickListener() {
            // делаем обработчик для intent
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CharacterActivity.this ,  JuggerActivity.class);
                startActivity(intent);
                Log.i("jugger","good"); // лог для проверки
            }
        };

        View.OnClickListener listener2 = new View.OnClickListener() {
            // делаем обработчик для intent
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CharacterActivity.this ,  PudgeActivity.class);
                startActivity(intent);
                Log.i("pudge","good"); // лог для проверки
            }
        };


        juggernaut.setOnClickListener(listener);
        pudge.setOnClickListener(listener2);



    }
}