package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.SchoolMobile.Data_Classes.Fill_Info;
import com.example.SchoolMobile.Data_Classes.Schedule;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiaHorario extends AppCompatActivity {


    private Map<String, List<Schedule>> schedule_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        schedule_map = Fill_Info.fill_Schedules();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_horario);

        TextView app_title= (TextView) findViewById(R.id.app_tittle);

        String day = this.getIntent().getStringExtra("day");

        app_title.setText(day);


    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }
}
