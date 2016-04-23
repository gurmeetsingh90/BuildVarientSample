package com.buildvarientsample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView server_tv,appid_tv,flavor_tv,report_crash_tv,prod_tv,dev_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        init();
        setValues();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    private void setValues() {
        server_tv.setText(BuildConfig.HOST);
        appid_tv.setText(BuildConfig.APPLICATION_ID);
        flavor_tv.setText(BuildConfig.FLAVOR);
        report_crash_tv.setText(""+BuildConfig.REPORT_CRASHES);
        if(BuildConfig.REPORT_CRASHES){
            prod_tv.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
            dev_tv.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
        }else {
            prod_tv.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
            dev_tv.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
        }
    }

    public void init(){
        server_tv = (TextView) findViewById(R.id.server_tv);
        appid_tv = (TextView) findViewById(R.id.applicationId_tv);
        flavor_tv = (TextView) findViewById(R.id.flavor_tv);
        report_crash_tv = (TextView) findViewById(R.id.report_crashes_tv);
        prod_tv = (TextView) findViewById(R.id.prod_tv);
        dev_tv = (TextView) findViewById(R.id.dev_tv);
    }

}
