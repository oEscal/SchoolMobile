package com.example.SchoolMobile;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.solver.widgets.ConstraintTableLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.SchoolMobile.Data_Classes.Disciplinas;
import com.example.SchoolMobile.Data_Classes.Faltas;
import com.example.SchoolMobile.Data_Classes.Professores;

import org.w3c.dom.Text;

public class DisciplinasPage_Aluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disciplinas_page);

        this.setPreviewInfo();
    }

    public int[] foul_sum() {
        String fouls[][] = new String[][] {
                Faltas.portugues_a.getValue(),
                Faltas.biologia.getValue(),
                Faltas.matematica_a.getValue(),
                Faltas.geologia.getValue(),
                Faltas.ed_fisica.getValue()
        };
        int sums[]= new int[fouls.length];

        for(int i=0;i<fouls.length;i++) {
            int counter=0;
            for(String foul: fouls[i])
                counter+=Integer.parseInt(foul);
            sums[i]=counter;
        }
        return sums;
    }

    public void setPreviewInfo() {

        int fouls_sum[]= foul_sum();

        String teacher_names[] = new String[] {
                Professores.portugues_a.getValue()[0],
                Professores.biologia.getValue()[0],
                Professores.matematica_a.getValue()[0],
                Professores.geologia.getValue()[0],
                Professores.ed_fisica.getValue()[0]
        };
        int fouls_ids[] = new int []{
                R.id.faltas_portugues,
                R.id.faltas_biologia,
                R.id.faltas_matematica,
                R.id.faltas_geologia,
                R.id.faltas_efisica
        } ;

        int teachers_ids[] = new int []{
                R.id.docente_portugues,
                R.id.docente_biologia,
                R.id.docente_matematica,
                R.id.docente_geologia,
                R.id.docente_efisica
        } ;

        for(int i=0;i<fouls_ids.length;i++) {
            ((TextView) findViewById(fouls_ids[i])).setText("Faltas Totais: "+fouls_sum[i]);
            ((TextView) findViewById(teachers_ids[i])).setText("Docente: "+ teacher_names[i]);
        }
    }



    public void disciplinasBtnClick(View view) {
        Intent intent = new Intent(this, Disciplina_Info_Page.class);

        TableRow row=(TableRow) view;
        CardView card=(CardView) row.getChildAt(0);
        ConstraintLayout layout=(ConstraintLayout) card.getChildAt(0);
        TextView tview = (TextView)layout.getChildAt(1);

        switch (tview .getId()) {
            case R.id.btw_portugues:
                intent.putExtra("dis", Disciplinas.portugues_a.getValue());
                break;
            case R.id.btw_biologia:
                intent.putExtra("dis", Disciplinas.biologia.getValue());
                break;
            case R.id.btw_matematica:
                intent.putExtra("dis", Disciplinas.matematica_a.getValue());
                break;
            case R.id.btw_geologia:
                intent.putExtra("dis", Disciplinas.geologia.getValue());
                break;
            default:
                intent.putExtra("dis", Disciplinas.ed_fisica.getValue());
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
