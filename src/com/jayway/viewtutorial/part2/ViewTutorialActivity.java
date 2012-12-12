package com.jayway.viewtutorial.part2;

import android.app.Activity;
import android.os.Bundle;

public class ViewTutorialActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        LineChartView lineChart = (LineChartView) findViewById(R.id.linechart);
        lineChart.setChartData(getRandomData());
    }

    private float[] getRandomData() {
        return new float[] { 10, 12, 7, 14, 15, 19, 13, 2, 10, 13, 13, 10, 15, 14 };
    }
}