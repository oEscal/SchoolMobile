package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DisciplinasPage_Aluno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disciplinas_page);
    }

    public void disciplinasBtnClick(View view) {
        startActivity(new Intent(this, Disciplina_Aluno.class));
    }

    public void backBtnArrow(View view) {
        startActivity(new Intent(this,HomePage.class));
    }
}
