package com.example.SchoolMobile;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AlertDialog;
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
import android.widget.Toast;

import com.example.SchoolMobile.Data_Classes.Aluno;
import com.example.SchoolMobile.Data_Classes.Fill_Info;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Falta extends AppCompatActivity {

    private List<Aluno> students;
    private TableLayout bottom_table;
    private Switch select_all;
    private ScrollView scroll;
    private int at_least_one;
    private ArrayList<Switch> all_switches;
    private ArrayList<View> all_tviews;
    private final Falta this_object= this;
    private ArrayList<boolean []> type_fault;
    private ArrayList<Switch> box_swicthes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falta);

        String key = this.getIntent().getStringExtra("key");
        String aula_key = this.getIntent().getStringExtra("aula_key");



        if ( key.equals("12ºA") )
            this.students = Fill_Info.fill_team("12A");
        else
            this.students = Fill_Info.fill_team("12B");

        this.scroll = (ScrollView) findViewById(R.id.scroll);
        this.all_switches = new ArrayList<>();
        this.at_least_one = 0;
        this.type_fault = new ArrayList<>();
        this.all_tviews = new ArrayList<>();
        this.box_swicthes = new ArrayList<Switch>();



        this.box_swicthes.add((Switch)findViewById(R.id.switch3));
        this.box_swicthes.add((Switch)findViewById(R.id.switch6));
        this.box_swicthes.add((Switch)findViewById(R.id.switch5));
        this.box_swicthes.add((Switch)findViewById(R.id.switch7));

        this.clearTable();


        ((TextView) findViewById(R.id.app_tittle)).setText("Faltas-"+aula_key);

        TableLayout mainTable = (TableLayout) findViewById(R.id.mainTable);

        this.bottom_table = (TableLayout) findViewById(R.id.bottomTable);
        this.bottom_table.setVisibility(View.GONE);

        this.select_all = (Switch) findViewById(R.id.select_all);

        this.select_all.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) scroll.getLayoutParams();
                    layoutParams.bottomMargin=20;
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
        TextView t3 = (TextView) clayout.getChildAt(5);
        this.all_switches.add(swi);
        swi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    at_least_one+=1;
                else
                    at_least_one-=1;


                if (at_least_one>0) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) scroll.getLayoutParams();
                    layoutParams.bottomMargin=20;
                    scroll.setLayoutParams(layoutParams);
                    bottom_table.setVisibility(View.VISIBLE);

                }
                else {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) scroll.getLayoutParams();
                    layoutParams.bottomMargin=0;
                    scroll.setLayoutParams(layoutParams);
                    bottom_table.setVisibility(View.GONE);

                }

            }
        });


        t1.setText(first_name+" "+ last_name);
        t2.setText("Numero: "+number);


        String type[] = new String[] {"Justificada","Material","Injutsificada","Disciplinar"};
        ArrayList<String> line = new ArrayList<>();
        for (String i: type) {
            if(Math.random() < 0.2)
                line.add(i);

        }
        StringBuilder sb = new StringBuilder();
        if (line.size() >0) {
            for (int i = 0; i < line.size() - 1; i++) {
                sb.append(line.get(i)+" | ");
            }
            sb.append(line.get(line.size()-1));
        }
        if (number!=8)
            t3.setText(sb.toString());

    }

    public void set_alunos(TableLayout mainTable,  Falta this_object) {

        for(int i= 0;i< this.students.size();i++) {
            String spllited_line[] = this.students.get(i).getNome().split("\\s+");
            View tr = LayoutInflater.from(this_object).inflate(R.layout.aluno_row, null, false);
            set_texts(tr,spllited_line[0],spllited_line[spllited_line.length-1],i+1);
            all_tviews.add(tr);
            mainTable.addView(tr);
        }


    }
    public void clearTable() {
        for(Switch s: this.box_swicthes)
            s.setChecked(false);
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }
    public void save_fault(View view) {
        this.alertBox();
    }

    public void  set_text_by_fault_box(TextView v,boolean type[]){
        String type_s[] = new String[] {"Justificada","Material","Injutsificada","Disciplinar"};
        StringBuilder sb= new StringBuilder();
        ArrayList<String> just_trues = new ArrayList<>();
        int counter=0;

        for(int i=0;i<type.length;i++) {
                if (type[i]) {
                    just_trues.add(type_s[i]);
                    counter += 1;
                }

        }
        if (counter==0)
            return ;


        for(int i=0; i< just_trues.size() - 1 ;i++) {
                sb.append(just_trues.get(i)+" | ");
        }
        sb.append(just_trues.get(just_trues.size() - 1));

        v.setText(sb.toString());
    }

    public void alertBox() {
        new AlertDialog.Builder(this)
                .setTitle("Atençao")
                .setMessage("Deseja mesmo realizar esta ação?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {


                        for(int i=0;i<all_switches.size();i++) {
                            Switch justificada = box_swicthes.get(0);
                            Switch material = box_swicthes.get(1);
                            Switch injustificada = box_swicthes.get(2);
                            Switch disciplinar =  box_swicthes.get(3);

                            Switch s = all_switches.get(i);
                            View view = all_tviews.get(i);
                            TableRow row = (TableRow) view;
                            CardView cview = (CardView) row.getChildAt(0);
                            ConstraintLayout clayout = (ConstraintLayout) cview.getChildAt(0);
                            TextView v = (TextView) clayout.getChildAt(5);

                            if (s.isChecked()){
                                set_text_by_fault_box(v,new boolean[] {justificada.isChecked(),material.isChecked(),injustificada.isChecked(),disciplinar.isChecked()});
                            }

                        }

                        Toast.makeText(this_object, "Done!", Toast.LENGTH_SHORT).show();
                        clearTable();
                        bottom_table.setVisibility(View.GONE);

                    }})
                .setNegativeButton(android.R.string.no, null).show();
    }

    public void homeButton(View view) {
        startActivity(new Intent(this, HomePage.class));
    }
}
