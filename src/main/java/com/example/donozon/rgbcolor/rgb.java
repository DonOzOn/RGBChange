package com.example.donozon.rgbcolor;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

public class rgb extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private SeekBar sbRed, sbGreen, sbBlue;
    private LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rgb);
        sbRed   =(SeekBar)findViewById(R.id.SBRed);
        sbGreen =(SeekBar)findViewById(R.id.SBGreen);
        sbBlue  =(SeekBar)findViewById(R.id.SBBlue);
        linear  =(LinearLayout)findViewById(R.id.linear);
        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        linear.setBackgroundColor(Color.rgb(sbRed.getProgress(),sbGreen.getProgress(),sbBlue.getProgress()));

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
