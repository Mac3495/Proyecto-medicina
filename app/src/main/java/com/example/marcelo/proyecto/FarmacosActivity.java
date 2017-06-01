package com.example.marcelo.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FarmacosActivity extends AppCompatActivity {

    TextView t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmacos);

        t1 = (TextView) findViewById(R.id.cabecera_farmacos);
        t2 = (TextView) findViewById(R.id.farmacos_texto);
        t3 = (TextView) findViewById(R.id.farmacos_consulta);

        Intent i = getIntent();
        Bundle extra = i.getExtras();
        int dato = extra.getInt("dato2");
        switch (dato){
            case 0:
                t1.setText("Remedios para la gripe comun");
                break;
            case 1:
                t1.setText("Remedios para las enfermedades en la piel");
                break;
            case 2:
                t1.setText("Remedios para el dolor estomacal");
                break;
            case 3:
                t1.setText("Remedios para el dolor de cabeza");
                break;
            case 4:
                t1.setText("Remedios para el reumatismo");
                break;
        }
    }
}
