package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.nio.channels.FileLock;

public class HomePage extends AppCompatActivity {

    HomePage context = this;
    private boolean home_pressed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);


        this.home_pressed = false;

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
        startActivity(new Intent(this, ChooseChat.class));
    }

    public void ementaBtnClick(View v) {
        startActivity(new Intent(this, EmentaPage.class));
    }

    public void backBtnArrow(View view) {

        if (this.home_pressed)
            super.onBackPressed();
        else {
            startActivity(new Intent(this, LoginPage.class));
        }

    }

    public void homeButton(View view) {
        startActivity(new Intent(this, HomePage.class));
    }
}
