package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DiaHorario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia_horario);
    }

    public void backBtnArrow(View view) {
        startActivity(new Intent(this , HorarioPage.class));
    }

    public void disciplinasBtnClick(View view) {
        startActivity(new Intent(this,Disciplina_Aluno.class));
    }
}
