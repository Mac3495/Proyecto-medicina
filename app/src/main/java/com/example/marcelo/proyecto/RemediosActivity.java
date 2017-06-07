package com.example.marcelo.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RemediosActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedios);

        textView = (TextView) findViewById(R.id.texto_remedio_ninhos);
        imageView = (ImageView) findViewById(R.id.imagen_remedio_ninhos);

        int dato = getIntent().getExtras().getInt("dato2");
        switch (dato){
            case 0:
                textView.setText(R.string.ninhos_1);
                imageView.setImageResource(R.drawable.icono);
                break;
            case 1:
                textView.setText(R.string.ninhos_2);
                imageView.setImageResource(R.drawable.icono);
                break;
            case 2:
                textView.setText(R.string.ninhos_3);
                imageView.setImageResource(R.drawable.icono);
                break;
        }
    }
}
