package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Disciplina_Info_Page_Docente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplina__info__page__docente);

        String dis = getIntent().getExtras().getString("dis");

        ((TextView) findViewById(R.id.app_tittle)).setText(dis);

    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }

    public void go_to_faltas(View view) {
        Intent i = new Intent(this,Turmas.class);
        i.putExtra("type","faltas");
        startActivity(i);
    }

    public void go_to_sumario(View view) {
        Intent i = new Intent(this,this.getClass());
        i.putExtra("type","sumario");

    }

    public void go_to_chat(View view) {
        Intent i = new Intent(this,Turmas.class);
        i.putExtra("type","chat");
        startActivity(i);


    }

    public void homeButton(View view) {
        startActivity(new Intent(this, HomePage.class));
    }
}
