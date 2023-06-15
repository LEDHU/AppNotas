package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.notas.about_us.ArthurActivity;
import com.example.notas.about_us.EduardoActivity;
import com.example.notas.about_us.VictorActivity;

public class AboutUs extends AppCompatActivity {

    Button bt_art, bt_vic, bt_lui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        bt_art = findViewById(R.id.arthur_bt);
        bt_vic = findViewById(R.id.victor_bt);
        bt_lui = findViewById(R.id.eduardo_bt);

        bt_art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutUs.this, ArthurActivity.class);
                startActivity(intent);
            }
        });

        bt_vic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutUs.this, VictorActivity.class);
                startActivity(intent);
            }
        });

        bt_lui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutUs.this, EduardoActivity.class);
                startActivity(intent);
            }
        });


    }
}