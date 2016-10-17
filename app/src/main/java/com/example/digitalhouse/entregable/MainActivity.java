package com.example.digitalhouse.entregable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonFotos = (Button) findViewById(R.id.activity_main_btn_fotos);
        botonFotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SegundaActivity.class);
                startActivity(intent);
            }
        });

        Button botonRecetas = (Button) findViewById(R.id.activity_main_btn_recetas);
        botonRecetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TerceraActivity.class);
                startActivity(intent);
            }
        });

    }


}
