package com.ryl2.endlessbattle;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(32, 48, 32, 32);
        layout.setBackgroundColor(Color.rgb(14, 18, 30));
        TextView title = new TextView(this);
        title.setText("RYL2 ENDLESS BATTLE\nMOBILE");
        title.setTextColor(Color.WHITE);
        title.setTextSize(27);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);
        TextView status = new TextView(this);
        status.setText("ALPHA LAUNCHER — Runtime Winlator CMod dan client belum diintegrasikan.");
        status.setTextColor(Color.LTGRAY);
        status.setPadding(0, 30, 0, 24);
        status.setGravity(Gravity.CENTER);
        layout.addView(status);
        String[] actions = {"START GAME (HIGH)", "CLIENT SETUP (HIGH)", "CONTAINER SETUP (HIGH)", "START GAME (LOW)", "CLIENT SETUP (LOW)", "CONTAINER SETUP (LOW)"};
        for (String action : actions) {
            Button button = new Button(this);
            button.setText(action);
            button.setEnabled(false);
            layout.addView(button);
        }
        TextView footer = new TextView(this);
        footer.setText("Menunggu integrasi Wine/Box64 dan patch baharu daripada admin.");
        footer.setTextColor(Color.LTGRAY);
        footer.setPadding(0, 24, 0, 0);
        layout.addView(footer);
        ScrollView scroll = new ScrollView(this);
        scroll.addView(layout);
        setContentView(scroll);
    }
}
