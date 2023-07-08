package com.example.proyectofinal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends Activity {
    private TextView textViewConsulta;
    private EditText editTextRespuesta;
    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textViewConsulta = findViewById(R.id.textViewConsulta);
        editTextRespuesta = findViewById(R.id.editTextRespuesta);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String respuesta = editTextRespuesta.getText().toString();
                guardarRespuesta(respuesta);

            }
        });
    }

    private void guardarRespuesta(String respuesta) {


    }
}
