package com.hfad.bizhacks_2020.UserFlow;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;

import com.hfad.bizhacks_2020.MainActivity;
import com.hfad.bizhacks_2020.Questions.Q1;
import com.hfad.bizhacks_2020.R;

public class Laptop_Products extends AppCompatActivity {
    ImageView iv_surface2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laptop__products);

        Intent intent = getIntent();
        final String type = intent.getStringExtra("Type");

        iv_surface2 = (ImageView) findViewById(R.id.iv_surface2);

        iv_surface2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (type.equals("Professional")) {
                    startActivity(new Intent(Laptop_Products.this, Laptop_Advanced_Item.class));
                } else if (type.equals("Student")) {
                    startActivity(new Intent(Laptop_Products.this, Laptop_Basic_Item.class));
                }

            }
        });

    }

}
