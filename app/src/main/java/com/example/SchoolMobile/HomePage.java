package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    HomePage context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);



    }

    public void horarioBtnClick(View v) {
        String person = getIntent().getExtras().getString("person");
        if (person.equals("aluno") )
            startActivity(new Intent(this, HorarioPage.class));
        else
            startActivity(new Intent(this, HorarioPageDocente.class));
    }

    public void disciplinasBtnClick(View v) {
        String person = getIntent().getExtras().getString("person");
        if (person.equals("aluno"))
            startActivity(new Intent(this, DisciplinasPage_Aluno.class));
        else
            startActivity(new Intent(this, DisciplinasPage_Docente.class));

    }

    public void mensagensBtnClick(View v) {
        String person = getIntent().getExtras().getString("person");

        startActivity(new Intent(this, Search_Messages.class));
    }

    public void ementaBtnClick(View v) {
        startActivity(new Intent(this, EmentaPage.class));
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }
}
