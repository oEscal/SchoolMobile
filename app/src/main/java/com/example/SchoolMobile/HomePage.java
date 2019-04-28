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
        startActivity(new Intent(this, HorarioPage.class));
    }

    public void disciplinasBtnClick(View v) {
        startActivity(new Intent(this, DisciplinasPage_Aluno.class));
    }

    public void mensagensBtnClick(View v) {
        startActivity(new Intent(this, Search_Messages.class));
    }

    public void ementaBtnClick(View v) {
        startActivity(new Intent(this, EmentaPage.class));
    }

}
