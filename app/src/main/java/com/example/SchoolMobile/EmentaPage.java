package com.example.SchoolMobile;


import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;


import com.example.SchoolMobile.Data_Classes.Fill_Info;
import com.example.SchoolMobile.Data_Classes.Menu;


import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EmentaPage extends AppCompatActivity {

    private Map<String, Menu> menus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        menus = Fill_Info.fill_Menu();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ementa_page);
        final EmentaPage this_object = this;

        TableLayout mainTable = (TableLayout) findViewById(R.id.mainTable);

        set_Menus(mainTable, this_object);
    }

    public TextView[] getTextViews(TableLayout mainTable, int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT);
        layoutParams.setMargins(0, 30, 0, 0);

        TableRow row = (TableRow) mainTable.getChildAt(i);
        row.setLayoutParams(layoutParams);

        CardView card = (CardView) row.getChildAt(0);
        ConstraintLayout layout = (ConstraintLayout) card.getChildAt(0);
        TableLayout layout2 = (TableLayout) layout.getChildAt(2);
        TableRow row2 = (TableRow) layout2.getChildAt(0);
        TableRow row3 = (TableRow) layout2.getChildAt(1);
        TableRow row4 = (TableRow) layout2.getChildAt(2);
        ConstraintLayout layout3 = (ConstraintLayout) row2.getChildAt(0);
        ConstraintLayout layout4 = (ConstraintLayout) row3.getChildAt(0);
        ConstraintLayout layout5 = (ConstraintLayout) row4.getChildAt(0);

        return new TextView[]{(TextView) layout.getChildAt(1), (TextView) layout3.getChildAt(0), (TextView) layout4.getChildAt(0), (TextView) layout5.getChildAt(0)};
    }


    public void set_Menus(TableLayout mainTable, EmentaPage this_object) {

        for (int i = 0; i < 5; i++) {
            View tr = LayoutInflater.from(this_object).inflate(R.layout.menurow, null, false);
            mainTable.addView(tr);
        }
        List<String> keys = new ArrayList<String>(menus.keySet());

        for (int i = 0; i < keys.size(); i++) {
            TextView all_views[] =this.getTextViews(mainTable,i);
            String key= keys.get(i);
            all_views[0].setText(key);
            all_views[1].setText("Sopa: "+menus.get(key).getSopa());
            all_views[1].setTextSize(20);
            all_views[2].setText("Prato: "+menus.get(key).getPrato());
            all_views[2].setTextSize(20);
            all_views[3].setText("Sobremesa: "+menus.get(key).getSobremesa());
            all_views[3].setTextSize(20);
        }

    }

    public void backBtnArrow(View view) {
        super.onBackPressed();
    }
}
