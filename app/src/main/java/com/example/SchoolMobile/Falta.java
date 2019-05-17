package com.example.SchoolMobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.SchoolMobile.Data_Classes.Fill_Info;

import java.util.List;

public class Falta extends AppCompatActivity {

    private List<String> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falta);

        String key = this.getIntent().getStringExtra("key");
        if ( key.equals("12ºA") )
            this.students = Fill_Info.fill_team("12A");
        else
            this.students = Fill_Info.fill_team("12B");

        ((TextView) findViewById(R.id.app_tittle)).setText("Faltas-"+key);

    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }
}
