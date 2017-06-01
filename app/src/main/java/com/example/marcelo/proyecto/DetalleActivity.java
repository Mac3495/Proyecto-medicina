package com.example.marcelo.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    ImageView imagen;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        imagen = (ImageView) findViewById(R.id.img_toolbar);
        textView = (TextView) findViewById(R.id.texto_detalle);

        Intent i = getIntent();
        Bundle extra = i.getExtras();
        int dato = extra.getInt("dato");

        final Intent intent = new Intent(getApplication(),FarmacosActivity.class);

        if(dato == 0){
            toolbar.setTitle("Gripe común");
            imagen.setImageResource(R.drawable.entb1);

            intent.putExtra("dato2",0);
        }else if(dato == 1){
            toolbar.setTitle("Enfermedades de la piel");
            imagen.setImageResource(R.drawable.entb2);
            intent.putExtra("dato2",1);
        }else if(dato == 2){
            toolbar.setTitle("Dolor estomacal");
            imagen.setImageResource(R.drawable.entb3);
            intent.putExtra("dato2",2);
        }else if(dato == 3){
            toolbar.setTitle("Dolor de cabeza");
            imagen.setImageResource(R.drawable.entb4);
            intent.putExtra("dato2",3);
        }else if(dato == 4) {
            toolbar.setTitle("Reumatismo");
            imagen.setImageResource(R.drawable.entb5);
            intent.putExtra("dato2", 4);
        }

        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
