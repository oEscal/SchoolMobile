package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.graphics.Matrix;
import android.widget.ImageButton;
import android.widget.ImageView;
public class EmentaPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ementa_page);


    }


    public void backBtnArrow(View view) {
        startActivity(new Intent(this, HomePage.class));
    }
}
