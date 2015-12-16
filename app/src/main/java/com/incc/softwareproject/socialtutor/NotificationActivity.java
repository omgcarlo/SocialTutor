package com.incc.softwareproject.socialtutor;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by carlo on 07/12/2015.
 */
public class NotificationActivity extends ActionBarActivity {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_activity);
        // Creating The Toolbar and setting it as the Toolbar for the activity
        //toolbar = (Toolbar) findViewById(R.id.ex_tool_bar);
        //toolbar.setTitle("   Notification");
        //setSupportActionBar(toolbar);
        Button bckBtn = (Button) findViewById(R.id.backBtn);
        bckBtn.setText("  Notification");
    }



    public void backBtnClicked(View v){
        finish();
    }

}
