package com.example.SchoolMobile;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.SchoolMobile.Data_Classes.Fill_Info;

import java.util.Map;

public class Aulas extends AppCompatActivity {

    private String type;
    private String key;
    private Map<String,String> aulas;
    private String dis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aulas);

        final Aulas this_object = this;


        this.type = this.getIntent().getStringExtra("type");
        this.key = this.getIntent().getStringExtra("key");
        this.aulas = Fill_Info.fill_aulas();
        this.dis = this.getIntent().getStringExtra("dis");

        TableLayout mainTable = (TableLayout) findViewById(R.id.mainTable);

        // ((TextView) findViewById(R.id.app_tittle)).setText("Aulas-"+key);
        ((TextView)findViewById(R.id.app_tittle)).setText(dis);
        ((TextView)findViewById(R.id.app_sub_tittle)).setText("Aulas - Faltas do " + key);

        set_aulas(mainTable,this_object);

    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }


    public void set_texts(View tr,String aula,String data) {
        TableRow row = (TableRow) tr;
        CardView card=(CardView) row.getChildAt(0);
        ConstraintLayout layout = (ConstraintLayout) card.getChildAt(0);
        TextView tview1 = (TextView) layout.getChildAt(1);
        TableLayout tlayout = (TableLayout) layout.getChildAt(2);
        TableRow row2 = (TableRow) tlayout.getChildAt(0);
        ConstraintLayout layout2 = (ConstraintLayout) row2.getChildAt(0);
        TextView tview2 = (TextView) layout2.getChildAt(0);

        tview1.setText(aula);
        tview2.setText(data);
    }

    public void set_aulas(TableLayout mainTable,Aulas this_object) {


        for (Map.Entry<String, String> entry : this.aulas.entrySet()) {

            View tr = LayoutInflater.from(this_object).inflate(R.layout.aula_row, null, false);
            set_texts(tr,entry.getKey(),entry.getValue());
            mainTable.addView(tr);

        }


    }


    public void go_to_action(View view) {


        Intent intent;
        if (this.type.equals("faltas")) {
            intent =  new Intent(this, Falta.class);
            intent.putExtra("dis", dis);
        }
        else
            intent = null;

        TableRow row = (TableRow) view;
        CardView card=(CardView) row.getChildAt(0);
        ConstraintLayout layout = (ConstraintLayout) card.getChildAt(0);
        TextView tview1 = (TextView) layout.getChildAt(1);



        intent.putExtra("key",this.key);
        intent.putExtra("aula_key",tview1.getText());
        startActivity(intent);
    }

    public void homeButton(View view) {
        Intent new_page = new Intent(this, HomePage.class);
        new_page.putExtra("person", "docente");
        startActivity(new_page);
    }
}
