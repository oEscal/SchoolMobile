package com.example.SchoolMobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.SchoolMobile.Data_Classes.Pessoas;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        final Chat this_object = this;

        EditText search_bar = findViewById(R.id.search_bar);
        search_bar.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable s) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence s, int start,
                                                  int count, int after) {
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start,
                                              int before, int count) {

                        TableLayout table_layout = findViewById(R.id.tableLayout);
                        table_layout.removeAllViews();

                        String text_search = s.toString();

                        for (String[] current_p : Pessoas.getByName(text_search)) {
                            View tr = LayoutInflater.from(this_object).inflate(R.layout.message_card_search, null, false);
                            ((TextView) tr.findViewById(R.id.person_name)).setText(current_p[0]);

                            table_layout.addView(tr);
                        }
                    }
                }
            );
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }
}
