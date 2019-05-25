package com.example.SchoolMobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class HorarioPageDocente extends AppCompatActivity implements GestureDetector.OnGestureListener {

    public static final int SWIPE_THRESHOLD = 100;
    public static final int SWIPE_VELOCITY_THRESHOLD = 100;

    private GestureDetector gesture_detector;
    private int page_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        System.out.println(this.getIntent().getStringExtra("page_number"));

        if (this.getIntent().getStringExtra("page_number") != null &&
                this.getIntent().getStringExtra("page_number").equals("1")) {
            setContentView(R.layout.activity_horario_page_docente2);
            page_number = 1;
        }
        else {
            setContentView(R.layout.activity_horario_page_docente);
            page_number = 0;
        }

        gesture_detector = new GestureDetector(this);
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }


    public void chooseDay(View view) {
        Button b = (Button) view;

        int day = b.getId();

        Intent intent = new Intent(this, DiaHorario.class);
        intent.putExtra("person","docente");
        switch (day) {
            case R.id.btw_segunda:
                intent.putExtra("day", "Segunda");
                break;
            case R.id.btw_terca:
                intent.putExtra("day", "Terça");
                break;
            case R.id.btw_quarta:
                intent.putExtra("day", "Quarta");
                break;
            case R.id.btw_quinta:
                intent.putExtra("day", "Quinta");
                break;
            case R.id.btn_sexta:
            default:
                intent.putExtra("day", "Sexta");
                break;
        }

        startActivity(intent);

    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent down, MotionEvent move, float velocity_x, float velocity_y) {

        boolean result = false;
        float diff_x = down.getX() - move.getX();
        float diff_y = down.getY() - move.getY();

        if (Math.abs(diff_x) > Math.abs(diff_y)) {

            if (Math.abs(diff_x) > SWIPE_THRESHOLD && Math.abs(velocity_x) > SWIPE_VELOCITY_THRESHOLD) {

                if (diff_x > 0)
                {
                    //View view = getLayoutInflater().inflate(R.layout.horario_page, null);
                    //view.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left));
//
                    //view = getLayoutInflater().inflate(R.layout.horario_page2, null);
                    //view.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right));
                    setContentView(R.layout.activity_horario_page_docente2);
                }
                else
                if (diff_x < 0)
                    setContentView(R.layout.activity_horario_page_docente);

                result = true;
            }
        }

        return result;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        System.out.println(ev.toString());

        gesture_detector.onTouchEvent(ev);

        return super.dispatchTouchEvent(ev);
    }

    public void next_page(View view) {

        setContentView(R.layout.horario_page2);
    }

    public void prev_page(View view) {

        setContentView(R.layout.horario_page);
    }

    public void homeButton(View view) {
        Intent new_page = new Intent(this, HomePage.class);
        new_page.putExtra("person", "docente");
        startActivity(new_page);
    }
}
