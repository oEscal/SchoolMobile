package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChooseChat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_chat);


    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }

    public void go_to_msg(View view) {
        TextView V = (TextView) view;
        Intent i = new Intent(this,Search_Messages.class);
        String w = (String) V.getText();
        if ( w.equals("Alunos") )
            i.putExtra("dest","aluno");
        else if (w.equals("Docente"))
            i.putExtra("dest","prof") ;
        else
            i.putExtra("dest","turma") ;
        startActivity(i);
    }

    public void homeButton(View view) {
        startActivity(new Intent(this, HomePage.class));
    }
}
