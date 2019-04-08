package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HorarioPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horario_page);
    }

    public void backBtnArrow(View view) {
        startActivity(new Intent(this, HomePage.class));
    }

    public void DiaBtn(View view) {
        startActivity(new Intent(this, DiaHorario.class));
    }
}
