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
    private String dis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turmas);

        this.type= this.getIntent().getStringExtra("type");
        this.dis = this.getIntent().getStringExtra("dis");

        ((TextView)findViewById(R.id.app_tittle)).setText(dis);
        if (this.type.equals("faltas"))
            ((TextView)findViewById(R.id.app_sub_tittle)).setText("Turmas - Faltas");
        else
            ((TextView)findViewById(R.id.app_sub_tittle)).setText("Turmas - Mensagens");
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }

    public void go_to_team(View view) {
        Intent intent;
        if (this.type.equals("faltas")) {
            intent =  new Intent(this, Aulas.class);
            intent.putExtra("dis", dis);
        }
        else if (this.type.equals("chat")) {
            intent = new Intent(this,Messages.class);
            intent.putExtra("person", "docente");
        }
        else
            intent = null;

        TableRow row=(TableRow) view;
        CardView card=(CardView) row.getChildAt(0);
        ConstraintLayout layout=(ConstraintLayout) card.getChildAt(0);
        TextView tview = (TextView)layout.getChildAt(1);
        String team = (String) tview.getText();


        intent.putExtra("key",team);
        intent.putExtra("name",team);
        intent.putExtra("type",this.type);
        startActivity(intent);

    }

    public void homeButton(View view) {
        Intent new_page = new Intent(this, HomePage.class);
        new_page.putExtra("person", "docente");
        startActivity(new_page);
    }
}
