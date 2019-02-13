package com.example.encounterfitness.amt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int minute = 0;
    int firstsecond = 0;
    int secondsecond = 0;
    int round = 0;


    TextView minuteView;
    TextView firstSecondView;
    TextView secondSecondView;
    TextView roundView;
    ImageView activeLight;
    ImageView warningLight;
    ImageView restLight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minuteView = findViewById(R.id.minute);
        firstSecondView = findViewById(R.id.firstSecond);
        secondSecondView = findViewById(R.id.secondSecond);
        roundView = findViewById(R.id.round);
        activeLight = findViewById(R.id.activeLight);
        warningLight = findViewById(R.id.warningLight);
        restLight = findViewById(R.id.restLight);

    }


}
