package com.example.colorpicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.TintTypedArray;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBarRed;
    private SeekBar seekBarGreen;
    private SeekBar seekBarBlue;
    private TextView screenBackground;
    private TextView textViewRedNum;
    private TextView textViewGreenNum;
    private TextView textViewBlueNum;
    private int seekRed;
    private int seekGreen;
    private int seekBlue;
    private int textProgress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Picker();
    }

    public void Picker(){
        seekBarRed = (SeekBar) findViewById(R.id.seekBarRed);
        seekBarGreen = (SeekBar) findViewById(R.id.seekBarGreen);
        seekBarBlue = (SeekBar) findViewById(R.id.seekBarBlue);
        textViewRedNum = (TextView) findViewById(R.id.textViewRedNum);
        textViewGreenNum = (TextView) findViewById(R.id.textViewGreenNum);
        textViewBlueNum = (TextView) findViewById(R.id.textViewBlueNum);


        seekBarRed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                seekRed = progress;
                textViewRedNum.setText(String.valueOf(progress));
                Coloring();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBarGreen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                seekGreen = progress;
                textViewGreenNum.setText(String.valueOf(progress));
                Coloring();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBarBlue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                seekBlue = progress;
                textViewBlueNum.setText(String.valueOf(progress));
                Coloring();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private void Coloring(){
        screenBackground = (TextView) findViewById(R.id.textViewColor);
        int color = Color.rgb(seekRed, seekGreen, seekBlue);
        screenBackground.setBackgroundColor(color);

    }





}