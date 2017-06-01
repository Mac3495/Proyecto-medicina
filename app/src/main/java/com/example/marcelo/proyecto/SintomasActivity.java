package com.example.marcelo.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class SintomasActivity extends AppCompatActivity {

    ListView listView;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas);

        intent = new Intent(getApplicationContext(),DetalleActivity.class);

        Enfermedades enfermedades_datos [] = new Enfermedades[]{
                new Enfermedades(R.drawable.en1,"Gripe común"),
                new Enfermedades(R.drawable.en2,"Enfermedades de la piel"),
                new Enfermedades(R.drawable.en3,"Dolor estomacal"),
                new Enfermedades(R.drawable.en4,"Dolor de cabeza"),
                new Enfermedades(R.drawable.en5,"Reumatismo")
        };

        EnfermedadesAdapter adapter = new EnfermedadesAdapter(this, R.layout.listview_item_row, enfermedades_datos);

        listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent.putExtra("dato",0);
                        break;
                    case 1:
                        intent.putExtra("dato",1);
                        break;
                    case 2:
                        intent.putExtra("dato",2);
                        break;
                    case 3:
                        intent.putExtra("dato",3);
                        break;
                    case 4:
                        intent.putExtra("dato",4);
                        break;
                }
                startActivity(intent);
            }
        });
    }
}
