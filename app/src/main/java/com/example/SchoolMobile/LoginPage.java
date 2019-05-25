package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }


    public void go_to_Aluno(View view) {
        Intent intent = new Intent(this, HomePage.class);
        intent.putExtra("person", "aluno");
        startActivity(intent);

    }

    public void go_to_Docente(View view) {
        Intent intent = new Intent(this, HomePage.class);
        intent.putExtra("person", "docente");
        startActivity(intent);
    }

    public void homeButton(View view) {
        startActivity(new Intent(this, HomePage.class));
    }
}
