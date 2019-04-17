package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HorarioPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horario_page);
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }


    public void chooseDay(View view) {
        Button b = (Button) view;
        String day = b.getText().toString();
        Intent intent = new Intent(this, DiaHorario.class);
        intent.putExtra("day", day);
        startActivity(intent);
    }
}
