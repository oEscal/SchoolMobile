package com.example.SchoolMobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MainActivity context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void horarioBtnClick(View v){

        Toast.makeText(this, "Clicked on Horário Button", Toast.LENGTH_LONG).show();
    }

    public void disciplinasBtnClick(View v){

        Toast.makeText(this, "Clicked on disciplinas Button", Toast.LENGTH_LONG).show();
    }

    public void mensagensBtnClick(View v){

        Toast.makeText(this, "Clicked on mensagens Button", Toast.LENGTH_LONG).show();
    }

    public void ementaBtnClick(View v){

        Toast.makeText(this, "Clicked on ementa Button", Toast.LENGTH_LONG).show();
    }
}
