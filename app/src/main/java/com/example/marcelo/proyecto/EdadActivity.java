package com.example.marcelo.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EdadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edad);
    }

    void siguiente(View view){
        startActivity(new Intent(getApplicationContext(), NinhosActivity.class));
    }

    void siguiente2(View view){
        startActivity(new Intent(getApplicationContext(), JovenesActivity.class));
    }

    void siguiente3(View view){
        startActivity(new Intent(getApplicationContext(), AdultoActivity.class));
    }
}
