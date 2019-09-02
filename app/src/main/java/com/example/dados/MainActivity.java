package com.example.dados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDado1;
    private ImageView imageViewDado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();

        imageViewDado1 = findViewById(R.id.image_view_1);
        imageViewDado2 = findViewById(R.id.image_view_2);
    }

    Random random = new Random();
    



}
