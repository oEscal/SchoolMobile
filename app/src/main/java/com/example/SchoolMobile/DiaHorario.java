package com.example.SchoolMobile;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.view.LayoutInflater;


import com.example.SchoolMobile.Data_Classes.Fill_Info;
import com.example.SchoolMobile.Data_Classes.Schedule;

import java.util.List;
import java.util.Map;


public class DiaHorario extends AppCompatActivity {

    private Map<String, List<Schedule>> schedule_map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_horario);


        String person = this.getIntent().getStringExtra("person");
        if  ( person.equals("aluno") )
            schedule_map = Fill_Info.fill_Schedules();
        else
            schedule_map = Fill_Info.fill_Schedules_Docente();

        final DiaHorario this_object = this;

        TextView app_title = (TextView) findViewById(R.id.app_tittle);

        String day = this.getIntent().getStringExtra("day");

        app_title.setText(day);


        TableLayout mainTable = (TableLayout) findViewById(R.id.mainTable);


        set_subjects(day,mainTable,this_object);

    }

    public TextView[] getTextViews( TableLayout mainTable,int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
        layoutParams.setMargins(0,30,0,0);

        TableRow row=(TableRow) mainTable.getChildAt(i);
        row.setLayoutParams(layoutParams);

        CardView card=(CardView) row.getChildAt(0);
        ConstraintLayout layout=(ConstraintLayout) card.getChildAt(0);
        TableLayout layout2 =(TableLayout) layout.getChildAt(2);
        TableRow row2=(TableRow) layout2.getChildAt(0);
        ConstraintLayout layout3=(ConstraintLayout) row2.getChildAt(0);

        return new TextView[] {(TextView) layout.getChildAt(1),(TextView) layout3.getChildAt(0),(TextView) layout3.getChildAt(1)};
    }

    public void set_subjects(String day, TableLayout mainTable, DiaHorario this_object) {

        List<Schedule> per_day = schedule_map.get(day);


        for (int i = 0; i < per_day.size(); i++) {
            View tr = LayoutInflater.from(this_object).inflate(R.layout.schedulerow, null, false);
            mainTable.addView(tr);
        }

        for(int i = 0; i <per_day.size(); i++) {

            TextView All_views[] = getTextViews(mainTable,i);
            All_views[0].setText(per_day.get(i).getSubject());
            All_views[1].setText(per_day.get(i).getTime());
            All_views[2].setText("Sala: "+per_day.get(i).getSala());
        }

    }

    public void go_to_Subject(View view) {
        TextView text_view = (TextView) view;
        String subject = text_view.getText().toString();

        Intent intent = new Intent(this, Disciplina_Info_Page.class);
        intent.putExtra("dis", subject);
        startActivity(intent);
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }
}
