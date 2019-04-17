package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.SchoolMobile.Data_Classes.Disciplinas;

public class DisciplinasPage_Aluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disciplinas_page);
    }

    public void disciplinasBtnClick(View view) {
        Intent intent = new Intent(this, Disciplina_Info_Page.class);

        switch (view.getId()) {
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
}
