package com.example.SchoolMobile;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.SchoolMobile.Data_Classes.Disciplinas;

public class Turmas extends AppCompatActivity {

    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turmas);

        this.type= this.getIntent().getStringExtra("type");
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }

    public void go_to_team(View view) {
        Intent intent;
        if (this.type.equals("faltas"))
            intent =  new Intent(this, Aulas.class);
        else
            intent = null;

        TableRow row=(TableRow) view;
        CardView card=(CardView) row.getChildAt(0);
        ConstraintLayout layout=(ConstraintLayout) card.getChildAt(0);
        TextView tview = (TextView)layout.getChildAt(1);
        String team = (String) tview.getText();


        intent.putExtra("key",team);
        intent.putExtra("type",this.type);
        startActivity(intent);

    }
}
