package com.hfad.bizhacks_2020.Questions;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageButton;

import com.hfad.bizhacks_2020.R;
import com.hfad.bizhacks_2020.UserFlow.Laptop_Products;

public class Q6_2 extends AppCompatActivity {
    ImageButton btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q6_2);

        btn_next = (ImageButton) findViewById(R.id.btn_next);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Q6_2.this, Laptop_Products.class);
                intent.putExtra("Type", "Student");
                startActivity(intent);
            }
        });
    }

}
