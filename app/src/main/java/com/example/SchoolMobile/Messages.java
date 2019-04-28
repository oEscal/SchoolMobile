package com.example.SchoolMobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messages_page);

        String person_name = getIntent().getExtras().getString("name");
        ((TextView) findViewById(R.id.name)).setText(person_name);
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }
}
