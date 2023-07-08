package com.example.proyectofinal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends Activity {
    private ListView listViewPosts;
    private Button buttonCreatePost;
    private List<String> postList;
    private ArrayAdapter<String> adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        listViewPosts = findViewById(R.id.listViewPosts);
        buttonCreatePost = findViewById(R.id.buttonCreatePost);

        postList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, postList);
        listViewPosts.setAdapter(adapter);

        buttonCreatePost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crearNuevoPost();
            }
        });

    }

    private void crearNuevoPost() {
        String nuevoPost = "Contenido del nuevo post";
        postList.add(nuevoPost);
        adapter.notifyDataSetChanged();

        Toast.makeText(this, "Nuevo post creado", Toast.LENGTH_SHORT).show();
    }
}
