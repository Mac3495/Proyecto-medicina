package com.example.marcelo.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AdultoActivity extends AppCompatActivity {

    ListView listView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adulto);

        intent = new Intent(getApplicationContext(),Remedios3Activity.class);

        Enfermedades enfermedades_datos [] = new Enfermedades[]{
                new Enfermedades(R.drawable.en1,"LOS RESFRIOS"),
                new Enfermedades(R.drawable.en2,"LOS DOLORES MUSCULARES"),
                new Enfermedades(R.drawable.en3,"DOLOR DE HUESOS"),
                new Enfermedades(R.drawable.en4,"GASTRITIS"),
                new Enfermedades(R.drawable.en4,"ENFERMEDADES DE LA PIEL"),
                new Enfermedades(R.drawable.en5,"DIABETIS")
        };

        EnfermedadesAdapter adapter = new EnfermedadesAdapter(this, R.layout.listview_item_row, enfermedades_datos);

        listView = (ListView) findViewById(R.id.list_view_adultos);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        intent.putExtra("dato2",0);
                        break;
                    case 1:
                        intent.putExtra("dato2",1);
                        break;
                    case 2:
                        intent.putExtra("dato2",2);
                        break;
                    case 3:
                        intent.putExtra("dato2",3);
                        break;
                    case 4:
                        intent.putExtra("dato2",4);
                        break;
                    case 5:
                        intent.putExtra("dato2",5);
                        break;
                }
                startActivity(intent);
            }
        });
    }
}
