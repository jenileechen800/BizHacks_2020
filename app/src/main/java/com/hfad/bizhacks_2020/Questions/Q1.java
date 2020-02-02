package com.hfad.bizhacks_2020.Questions;

import android.content.Intent;
import android.os.Bundle;

import com.hfad.bizhacks_2020.MainActivity;
import com.hfad.bizhacks_2020.R;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Q1 extends AppCompatActivity {
    ImageButton btn_next;

    Button btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);

        btn_next = (ImageButton) findViewById(R.id.btn_next);


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Q1.this, Q2.class));
            }
        });



        btn_exit = (Button) findViewById(R.id.btn_exit);
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Q1.this, MainActivity.class));
            }
        });

    }



}
