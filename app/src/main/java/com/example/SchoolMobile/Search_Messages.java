package com.example.SchoolMobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;

import com.example.SchoolMobile.Data_Classes.Pessoas;

public class Search_Messages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_messages);
        final Search_Messages this_object = this;

        putMessages(this, "");

        EditText search_bar = findViewById(R.id.search_bar);
        search_bar.addTextChangedListener(new TextWatcher() {
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
                    putMessages(this_object, s.toString());
                }
            });
    }

    private void putMessages(Search_Messages this_object, String s) {
        TableLayout table_layout = findViewById(R.id.tableLayout);
        table_layout.removeAllViews();
        String text_search = s;
        for (String[] current_p : Pessoas.getByName(text_search)) {
            View tr = LayoutInflater.from(this_object).inflate(R.layout.message_card_search, null, false);

            ((TextView) tr.findViewById(R.id.person_name)).setText(current_p[0]);
            tr.findViewById(R.id.send_message_btn).setTag(current_p[0]);

            table_layout.addView(tr);
        }
    }

    public void goToMessagesBtn (View view) {

        Intent intent = new Intent(this, Messages.class);
        intent.putExtra("name", view.getTag().toString());

        startActivity(intent);
    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }
}
