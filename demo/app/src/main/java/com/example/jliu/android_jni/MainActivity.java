package com.example.jliu.android_jni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean btnstatus = false;
    Toast toast =null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hwlib.ledOpen();
        final CheckBox led0 = (CheckBox) findViewById(R.id.led1);
        final CheckBox led1 = (CheckBox) findViewById(R.id.led2);
        final CheckBox led2 = (CheckBox) findViewById(R.id.led3);
        final CheckBox led3 = (CheckBox) findViewById(R.id.led4);
        final Button mybutton = (Button) findViewById(R.id.button);
        mybutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                btnstatus = !btnstatus;
                if (btnstatus) {
                    mybutton.setText("LED_OFF");
                    led0.setChecked(true);
                    led1.setChecked(true);
                    led2.setChecked(true);
                    led3.setChecked(true);
                    for(int i=0;i<4;i++)
                        hwlib.ledCtrl(i,1);
                } else {
                    mybutton.setText("LED_ON");
                    led0.setChecked(false);
                    led1.setChecked(false);
                    led2.setChecked(false);
                    led3.setChecked(false);
                    for(int i=0;i<4;i++)
                        hwlib.ledCtrl(i,0);
                }

            }
        });
        led0.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (led0.isChecked()) {
                    toast.makeText(getApplicationContext(), "led1_on", 0).show();
                    led0.setChecked(true);
                    hwlib.ledCtrl(0,1);
                } else {
                    led0.setChecked(false);
                    toast.makeText(getApplicationContext(), "led1_false", 0).show();
                    hwlib.ledCtrl(0,0);
                }
            }

        });

        led1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (led1.isChecked()) {
                    toast.makeText(getApplicationContext(), "led2_on", 0).show();
                    led1.setChecked(true);
                    hwlib.ledCtrl(1,1);
                } else {
                    led1.setChecked(false);
                    toast.makeText(getApplicationContext(), "led2_false", 0).show();
                    hwlib.ledCtrl(1,0);
                }
            }
        });

        led2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (led2.isChecked()) {
                    toast.makeText(getApplicationContext(), "led3_on", 0).show();
                    led2.setChecked(true);
                    hwlib.ledCtrl(2,1);
                } else {
                    led2.setChecked(false);
                    toast.makeText(getApplicationContext(), "led3_false", 0).show();
                    hwlib.ledCtrl(2,0);
                }
            }
        });
        led3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (led3.isChecked()) {
                    toast.makeText(getApplicationContext(), "led4_on", 0).show();
                    led3.setChecked(true);
                    hwlib.ledCtrl(3,1);
                } else {
                    led3.setChecked(false);
                    toast.makeText(getApplicationContext(), "led4_false", 0).show();
                    hwlib.ledCtrl(3,0);
                }
            }
        });
    }

}
