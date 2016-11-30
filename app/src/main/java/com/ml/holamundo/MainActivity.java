package com.ml.holamundo;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Typeface font = Typeface.createFromAsset(getAssets(),"DarkLarch_PERSONAL_USE.ttf");

        TextView titulo = (TextView) findViewById(R.id.titulo);
        titulo.setTypeface(font);

        Button inicarSesion = (Button) findViewById(R.id.iniciar);
        inicarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}
