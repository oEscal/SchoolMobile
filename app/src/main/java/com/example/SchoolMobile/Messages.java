package com.example.SchoolMobile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.SchoolMobile.Data_Classes.MessagesExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Messages extends AppCompatActivity {

    private ConstraintLayout messages_layout;
    private List<View> all_messages;
    private int current_id = 10;

    private static Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messages_page);

        String person_name = getIntent().getExtras().getString("name");
        ((TextView) findViewById(R.id.name)).setText(person_name);

        messages_layout = findViewById(R.id.messages_layout);
        all_messages = new ArrayList<>();

        for (String m : MessagesExamples.messages)
            if (Math.random() < 0.1)
                addMessageSend(m);

        for (String m : MessagesExamples.messages)
            if (Math.random() < 0.1)
                addMessageReceive(m);
    }

    private static int dpToPx(int dp, Context c) {
        float density = c.getResources()
                .getDisplayMetrics()
                .density;
        return Math.round((float) dp * density);
    }

    private void addMessageSend(String message_str) {

        View new_message_send = LayoutInflater.from(this).inflate(R.layout.send_message_layout, null, false);
        new_message_send.setId(current_id++);
        messages_layout.addView(new_message_send);

        ViewGroup.LayoutParams params = new_message_send.getLayoutParams();
        params.width = ViewGroup.LayoutParams.MATCH_PARENT;
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        new_message_send.setLayoutParams(params);

        ConstraintSet set = new ConstraintSet();
        set.clone(messages_layout);

        if (all_messages.size() == 0)
            set.connect(new_message_send.getId(), ConstraintSet.TOP, messages_layout.getId(), ConstraintSet.TOP, 8);
        else
            set.connect(new_message_send.getId(), ConstraintSet.TOP, all_messages.get(all_messages.size() - 1).getId(), ConstraintSet.BOTTOM, 8);


        set.connect(new_message_send.getId(), ConstraintSet.LEFT, messages_layout.getId(), ConstraintSet.LEFT, 100);
        set.connect(new_message_send.getId(), ConstraintSet.RIGHT, messages_layout.getId(), ConstraintSet.RIGHT, 8);

        all_messages.add(new_message_send);
        ((TextView) new_message_send).setText(message_str);

        set.applyTo(messages_layout);
    }

    private void addMessageReceive(String message_str) {

        View new_message_send = LayoutInflater.from(this).inflate(R.layout.receive_message_layout, null, false);
        new_message_send.setId(current_id++);
        messages_layout.addView(new_message_send);

        ViewGroup.LayoutParams params = new_message_send.getLayoutParams();
        params.width = ViewGroup.LayoutParams.MATCH_PARENT;
        params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        new_message_send.setLayoutParams(params);

        ConstraintSet set = new ConstraintSet();
        set.clone(messages_layout);

        if (all_messages.size() == 0)
            set.connect(new_message_send.getId(), ConstraintSet.TOP, messages_layout.getId(), ConstraintSet.TOP, 8);
        else
            set.connect(new_message_send.getId(), ConstraintSet.TOP, all_messages.get(all_messages.size() - 1).getId(), ConstraintSet.BOTTOM, 8);

        set.connect(new_message_send.getId(), ConstraintSet.LEFT, messages_layout.getId(), ConstraintSet.LEFT, 8);
        set.connect(new_message_send.getId(), ConstraintSet.RIGHT, messages_layout.getId(), ConstraintSet.RIGHT, 100);

        all_messages.add(new_message_send);
        ((TextView) new_message_send).setText(message_str);

        set.applyTo(messages_layout);
    }

    public void sendMessage(View view) {

        String message_to_send = ((TextView) findViewById(R.id.message_to_send)).getText().toString();
        ((TextView) findViewById(R.id.message_to_send)).setText("");
        addMessageSend(message_to_send);
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }

    public void homeButton(View view) {
        Intent new_page = new Intent(this, HomePage.class);
        new_page.putExtra("person", getIntent().getExtras().getString("person"));
        startActivity(new_page);
    }
}
