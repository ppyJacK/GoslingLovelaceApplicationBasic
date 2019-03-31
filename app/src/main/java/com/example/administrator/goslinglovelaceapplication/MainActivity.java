package com.example.administrator.goslinglovelaceapplication;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        int ori = getResources().getConfiguration().orientation;
        if(ori == Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landlayout);
        }else if(ori == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.portlayout);
        }
        Locale locale = new Locale("cn");
        Configuration configuration = getBaseContext().getResources().getConfiguration();
        configuration.locale = locale;
        getBaseContext().getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());

    }
}
