package com.hfad.bizhacks_2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.hfad.bizhacks_2020.Questions.Q1;
import com.hfad.bizhacks_2020.UserFlow.Laptop_Basic_Item;
import com.hfad.bizhacks_2020.UserFlow.Laptop_Advanced_Item;
import com.hfad.bizhacks_2020.UserFlow.Laptop_Products;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_begin_survey;
    Button btn_chat_bot;
    Button btn_after_options;
    Button btn_search;
    EditText et_searchbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_chat_bot = (Button) findViewById(R.id.btn_chat_bot);
        btn_after_options = (Button) findViewById(R.id.btn_after_options);
        btn_begin_survey = (ImageButton) findViewById(R.id.btn_begin_survey);
        btn_search = (Button) findViewById(R.id.btn_search);
        et_searchbar = (EditText) findViewById(R.id.et_searchbar);

        btn_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Laptop_Products.class);

                if (et_searchbar.getText().toString().equals("Surface 2")) {
                    intent.putExtra("Type", "Professional");
                } else if (et_searchbar.getText().toString().equals("surface 2")) {
                    intent.putExtra("Type", "Student");
                }

                startActivity(intent);

            }
        });
        btn_begin_survey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Q1.class));
            }
        });
        btn_chat_bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ChatBotActivity.class));
            }
        });

        btn_after_options.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Profile.class));
            }
        });
    }

}
