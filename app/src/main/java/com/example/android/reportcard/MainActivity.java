package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Where I tested the code
        ReportCard rp = new ReportCard(64, 87, 65, 98, 45, 56, 100);

        int math = rp.getGrade("math");
        Log.v("ReportCard, Math", Integer.toString(math));

        rp.setGrade("math", 100);

        math = rp.getGrade("math");
        Log.v("ReportCard, Math", Integer.toString(math));

        String report = rp.toString();
        Log.v("ReportCard, Report", report);
    }

}
