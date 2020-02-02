package com.hfad.bizhacks_2020;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import io.kommunicate.KmConversationBuilder;
import io.kommunicate.Kommunicate;
import io.kommunicate.callbacks.KmCallback;

import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ChatBotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_bot);

        Kommunicate.init(ChatBotActivity.this, "29324937c8b116448c074d686d8c943a");

        new KmConversationBuilder(ChatBotActivity.this)
                .launchConversation(new KmCallback() {
                    @Override
                    public void onSuccess(Object message) {
                        Log.d("Conversation", "Success : " + message);
                    }

                    @Override
                    public void onFailure(Object error) {
                        Log.d("Conversation", "Failure : " + error);
                    }
                });

    }

}
