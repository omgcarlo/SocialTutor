package com.incc.softwareproject.socialtutor;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
/**
 * Created by carlo on 07/12/2015.
 */
public class SignupActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void backBtnClicked(View v){
        finish();
    }

}
