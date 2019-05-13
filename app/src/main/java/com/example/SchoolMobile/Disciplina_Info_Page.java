package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.SchoolMobile.Data_Classes.Disciplinas;
import com.example.SchoolMobile.Data_Classes.DisciplinasInfo;

import java.util.List;

public class Disciplina_Info_Page extends AppCompatActivity {

    private String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.discplina_info_page);

        String dis = getIntent().getExtras().getString("dis");

        // change page title
        ((TextView) findViewById(R.id.app_tittle)).setText(dis);

        DisciplinasInfo info_db = new DisciplinasInfo();

        List<String> info_profs = info_db.getProfInfo(Disciplinas.value(dis));
        List<String> info_faltas = info_db.getFaltasInfo(Disciplinas.value(dis));

        // prof info
        name = info_profs.get(0);
        ((TextView) findViewById(R.id.nome_docente_text)).setText(info_profs.get(0));
        ((TextView) findViewById(R.id.mail_docente_text)).setText(info_profs.get(1));
        ((TextView) findViewById(R.id.gabinete_docente_text)).setText(info_profs.get(2));

        // faltas info
        ((TextView) findViewById(R.id.num_faltas_justificadas)).setText(info_faltas.get(0));
        ((TextView) findViewById(R.id.num_faltas_injustificadas)).setText(info_faltas.get(1));
        ((TextView) findViewById(R.id.num_faltas_material)).setText(info_faltas.get(2));
        ((TextView) findViewById(R.id.num_faltas_disciplinares)).setText(info_faltas.get(3));
    }

    public void send_message(View view) {

        Intent intent = new Intent(this, Messages.class);
        intent.putExtra("name", this.name);

        startActivity(intent);
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }
}
