package com.example.android.locationtask.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.locationtask.R;

import java.text.DecimalFormat;

public class DistanceActivity extends AppCompatActivity {

    TextView textInfo,textDistance;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // to make for fullscreen and remove status bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_distance);

        textInfo = (TextView)findViewById(R.id.titleId);
        textDistance = (TextView)findViewById(R.id.distanceId);

        String locationTitle = getIntent().getStringExtra("Title");
        textInfo.setText("Your distance to the" + " " + locationTitle +" "+ "from your current location is :");

        double distance = getIntent().getDoubleExtra("distance",0);
        double distanceKm = distance/1000;
        String replacedValue = new DecimalFormat("##.##").format(distanceKm).replace(",",".");
        textDistance.setText(replacedValue);
    }
}
