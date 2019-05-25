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

public class DisciplinasPage_Docente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplinas_page__docente);
    }

    public void disciplinasBtnClick(View view) {
        Intent intent = new Intent(this, Disciplina_Info_Page_Docente.class);

        TableRow row=(TableRow) view;
        CardView card=(CardView) row.getChildAt(0);
        ConstraintLayout layout=(ConstraintLayout) card.getChildAt(0);
        TextView tview = (TextView)layout.getChildAt(1);

        switch (tview .getId()) {
            case R.id.btw_biologia:
                intent.putExtra("dis", Disciplinas.biologia.getValue());
                break;
            case R.id.btw_geologia:
                intent.putExtra("dis", Disciplinas.geologia.getValue());
                break;
        }
        startActivity(intent);
    }


    public void backBtnArrow(View view) {
        super.onBackPressed();
    }

    public void homeButton(View view) {
        startActivity(new Intent(this, HomePage.class));
    }
}
