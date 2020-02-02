package com.hfad.bizhacks_2020.Questions;

import android.content.Intent;
import android.os.Bundle;

import com.hfad.bizhacks_2020.MainActivity;
import com.hfad.bizhacks_2020.R;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Q3 extends AppCompatActivity {
    ImageButton btn_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);

        btn_next = (ImageButton) findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Q3.this, Q4.class));
            }
        });

        Button btn_exit = (Button) findViewById(R.id.btn_exit);
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Q3.this, MainActivity.class));
            }
        });
    }

}
