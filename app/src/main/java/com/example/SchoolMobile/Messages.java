package com.example.SchoolMobile;

import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messages_page);

        String person_name = getIntent().getExtras().getString("name");
        ((TextView) findViewById(R.id.name)).setText(person_name);

        ConstraintLayout messages_layout = findViewById(R.id.messages_layout);
        List<View> all_messages = new ArrayList<>();

        View new_message_send = LayoutInflater.from(this).inflate(R.layout.send_message_layout, null, false);
        messages_layout.addView(new_message_send);

        ViewGroup.LayoutParams params = new_message_send.getLayoutParams();
        params.width = ViewGroup.LayoutParams.MATCH_PARENT;
        params.height = dpToPx(50, this);
        new_message_send.setLayoutParams(params);

        ConstraintSet set = new ConstraintSet();
        set.clone(messages_layout);


        if (all_messages.size() == 0)
            set.connect(new_message_send.getId(), ConstraintSet.TOP, messages_layout.getId(), ConstraintSet.TOP, 8);
        set.connect(new_message_send.getId(), ConstraintSet.LEFT, messages_layout.getId(), ConstraintSet.LEFT, 100);
        set.connect(new_message_send.getId(), ConstraintSet.RIGHT, messages_layout.getId(), ConstraintSet.RIGHT, 8);
        all_messages.add(new_message_send);
        set.applyTo(messages_layout);



    }

    private static int dpToPx(int dp, Context c) {
        float density = c.getResources()
                .getDisplayMetrics()
                .density;
        return Math.round((float) dp * density);
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }
}
