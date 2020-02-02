package com.hfad.bizhacks_2020.Questions;

import android.content.Intent;
import android.os.Bundle;

import com.hfad.bizhacks_2020.MainActivity;
import com.hfad.bizhacks_2020.R;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class Q6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6);

        Button btn_exit = (Button) findViewById(R.id.btn_exit);
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Q6.this, MainActivity.class));
            }
        });

    }

}
