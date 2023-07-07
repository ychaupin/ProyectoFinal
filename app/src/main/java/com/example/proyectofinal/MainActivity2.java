package com.example.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private EditText editTextRespuesta;
    private Button button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTextRespuesta = findViewById(R.id.editTextRespuesta);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String consulta = editTextRespuesta.getText().toString();

                Toast.makeText(MainActivity2.this, "Consulta guardada: " + consulta, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
