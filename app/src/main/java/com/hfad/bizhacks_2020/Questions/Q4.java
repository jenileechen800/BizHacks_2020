package com.hfad.bizhacks_2020.Questions;

import android.content.Intent;
import android.os.Bundle;

import com.hfad.bizhacks_2020.MainActivity;
import com.hfad.bizhacks_2020.R;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class Q4 extends AppCompatActivity {
    ImageButton btn_next;
    Button btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        btn_exit = (Button) findViewById(R.id.btn_exit);
        btn_next = (ImageButton) findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Q4.this, Q5.class));
            }
        });
        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Q4.this, MainActivity.class));
            }
        });


    }

    public void onCheckBoxChecked(CheckBox checkBox) {
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);
        } else {
            checkBox.setChecked(true);
        }
    }

}
