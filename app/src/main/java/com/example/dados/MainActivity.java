package com.example.dados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDado1;
    private ImageView imageViewDado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDado1 = findViewById(R.id.image_view_1);
        imageViewDado2 = findViewById(R.id.image_view_2);

        girarDados();
    }

    public void girarDados(){

        Random random = new Random();
        int n = random.nextInt(6 + 1);

        if (n == 1){
            imageViewDado1.setImageResource(R.drawable.dado1);
            imageViewDado2.setImageResource(R.drawable.dado1);
        }
        else if (n == 2) {
            imageViewDado1.setImageResource(R.drawable.dado2);
            imageViewDado2.setImageResource(R.drawable.dado2);
        }
        else if (n == 3) {
            imageViewDado1.setImageResource(R.drawable.dado3);
            imageViewDado2.setImageResource(R.drawable.dado3);
        }
        else if (n == 4) {
            imageViewDado1.setImageResource(R.drawable.dado4);
            imageViewDado2.setImageResource(R.drawable.dado4);
        }else if (n == 5) {
            imageViewDado1.setImageResource(R.drawable.dado5);
            imageViewDado2.setImageResource(R.drawable.dado5);
        }
        else if (n == 6) {
            imageViewDado1.setImageResource(R.drawable.dado6);
            imageViewDado2.setImageResource(R.drawable.dado6);
        }

    }









}
