package com.example.proyectofinal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private EditText editTextRespuesta;
    private Button buttonGuardar;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editTextRespuesta = findViewById(R.id.editTextRespuesta);
        buttonGuardar = findViewById(R.id.button);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);

        buttonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener el texto ingresado en el EditText
                String consulta = editTextRespuesta.getText().toString();

                // Guardar la consulta en SharedPreferences
                guardarConsulta(consulta);
            }
        });

        // Cargar la consulta guardada (si existe)
        cargarConsulta();
    }

    private void guardarConsulta(String consulta) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("consulta", consulta);
        editor.apply();

        Toast.makeText(this, "Consulta guardada correctamente", Toast.LENGTH_SHORT).show();
    }

    private void cargarConsulta() {
        String consultaGuardada = sharedPreferences.getString("consulta", "");
        editTextRespuesta.setText(consultaGuardada);
    }
}





