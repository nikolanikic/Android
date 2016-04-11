package com.nnikic.rcjeep;

import android.app.Activity;
import android.content.Context;
import android.hardware.*;
import android.hardware.Sensor;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by nnikic on 4/7/2016.
 */
public class SecondActivity extends Activity implements SensorEventListener {

    TextView tvX, tvY, tvZ;
    public SensorManager sManager;
    public android.hardware.Sensor mSensor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        tvX = (TextView) findViewById(R.id.xValue);
        tvY = (TextView) findViewById(R.id.yValue);
        tvZ = (TextView) findViewById(R.id.zValue);

        sManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mSensor = sManager.getDefaultSensor(android.hardware.Sensor.TYPE_GYROSCOPE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        sManager.registerListener(this, sManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE), SensorManager.SENSOR_DELAY_FASTEST);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {

        Sensor sensor = event.sensor;
        final float alpha = 500;

        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];
        float sumX = 0, sumY = 0, sumZ = 0;

        while (true) {

            for (int i = 0; i < 10; i++) {

            }


        }

    }

    @Override
    public void onAccuracyChanged(android.hardware.Sensor sensor, int accuracy) {


    }
}
