package com.example.SchoolMobile;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.SchoolMobile.Data_Classes.Fill_Info;

import java.util.ArrayList;
import java.util.List;

public class Falta extends AppCompatActivity {

    private List<String> students;
    private TableLayout bottom_table;
    private Switch select_all;
    private ScrollView scroll;
    private int at_least_one;
    private ArrayList<Switch> all_switches;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falta);

        String key = this.getIntent().getStringExtra("key");
        String aula_key = this.getIntent().getStringExtra("aula_key");

        final Falta this_object = this;


        if ( key.equals("12ºA") )
            this.students = Fill_Info.fill_team("12A");
        else
            this.students = Fill_Info.fill_team("12B");

        this.scroll = (ScrollView) findViewById(R.id.scroll);
        this.all_switches = new ArrayList<>();
        this.at_least_one = 0;

        ((TextView) findViewById(R.id.app_tittle)).setText("Faltas-"+aula_key);

        TableLayout mainTable = (TableLayout) findViewById(R.id.mainTable);

        this.bottom_table = (TableLayout) findViewById(R.id.bottomTable);
        this.bottom_table.setVisibility(View.GONE);

        this.select_all = (Switch) findViewById(R.id.select_all);


        this.select_all.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) scroll.getLayoutParams();
                    layoutParams.bottomMargin=129;
                    scroll.setLayoutParams(layoutParams);
                    bottom_table.setVisibility(View.VISIBLE);
                    for(Switch s:all_switches)
                            s.setChecked(true);
                }
                else {

                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) scroll.getLayoutParams();
                    layoutParams.bottomMargin=0;
                    scroll.setLayoutParams(layoutParams);
                    bottom_table.setVisibility(View.GONE);
                    for(Switch s:all_switches)
                        s.setChecked(false);
                }

            }
        });


        this.set_alunos(mainTable,this_object);

    }

    public void set_texts(View tr,String first_name, String last_name,int number) {
        TableRow row = (TableRow) tr;
        CardView cview = (CardView) row.getChildAt(0);
        ConstraintLayout clayout = (ConstraintLayout) cview.getChildAt(0);
        TextView t1 = (TextView) clayout.getChildAt(2);
        TextView t2 = (TextView) clayout.getChildAt(3);
        Switch swi = (Switch) clayout.getChildAt(4);
        this.all_switches.add(swi);
        swi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    at_least_one+=1;
                else
                    at_least_one-=1;


                if (at_least_one>0)
                    bottom_table.setVisibility(View.VISIBLE);
                else
                    bottom_table.setVisibility(View.GONE);

            }
        });


        t1.setText(first_name+" "+ last_name);
        t2.setText("Numero: "+number);


    }

    public void set_alunos(TableLayout mainTable,  Falta this_object) {

        for(int i= 0;i< this.students.size();i++) {
            String spllited_line[] = this.students.get(i).split("\\s+");
            View tr = LayoutInflater.from(this_object).inflate(R.layout.aluno_row, null, false);
            set_texts(tr,spllited_line[0],spllited_line[spllited_line.length-1],i+1);
            mainTable.addView(tr);
        }

    }


    public void backBtnArrow(View view) {
        super.onBackPressed();
    }
}
