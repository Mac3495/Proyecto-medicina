package com.example.marcelo.proyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Remedios2Activity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remedios2);

        textView = (TextView) findViewById(R.id.texto_remedio_jovenes);
        imageView = (ImageView) findViewById(R.id.imagen_remedio_jovenes);

        int dato = getIntent().getExtras().getInt("dato2");
        switch (dato){
            case 0:
                textView.setText(R.string.joven_1);
                imageView.setImageResource(R.drawable.icono);
                break;
            case 1:
                textView.setText(R.string.joven_2);
                imageView.setImageResource(R.drawable.icono);
                break;
            case 2:
                textView.setText(R.string.joven_3);
                imageView.setImageResource(R.drawable.icono);
                break;
            case 3:
                textView.setText(R.string.joven_4);
                imageView.setImageResource(R.drawable.icono);
                break;
            case 4:
                textView.setText(R.string.joven_5);
                imageView.setImageResource(R.drawable.icono);
                break;
            case 5:
                textView.setText(R.string.joven_6);
                imageView.setImageResource(R.drawable.icono);
                break;
            case 6:
                textView.setText(R.string.joven_7);
                imageView.setImageResource(R.drawable.icono);
                break;
            case 7:
                textView.setText(R.string.joven_8);
                imageView.setImageResource(R.drawable.icono);
                break;
        }
    }
}
