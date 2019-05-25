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

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DisciplinasPage_Docente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplinas_page__docente);

        this.set_datas();
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

    public void set_datas() {
        TextView geologia_faltas = (TextView) findViewById(R.id.data_geologia);
        TextView biologia_faltas = (TextView) findViewById(R.id.data_biologia);

        TextView faltas[] = new TextView[] {geologia_faltas,biologia_faltas};
        String horas[] = new String[] {"10h50","09h00"};

        String pattern = "dd-MM-yyyy";
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        Random r = new Random();

        for(int i=0; i < faltas.length ; i++) {

            cal.setTime(date);
            cal.add(Calendar.DATE, r.nextInt((4 - 2) + 1) + 2);
            String dateInString = new SimpleDateFormat(pattern).format(cal.getTime());
            faltas[i].setText("Próxima aula: "+dateInString+" "+horas[i]);


        }
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }

    public void homeButton(View view) {
        Intent new_page = new Intent(this, HomePage.class);
        new_page.putExtra("person", "docente");
        startActivity(new_page);
    }
}
