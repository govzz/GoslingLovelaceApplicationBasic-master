package com.example.goslinglovelaceapplicationbasic;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(isChinese()){
            int orientation = getResources().getConfiguration().orientation;
            String str;
            if (orientation == Configuration.ORIENTATION_PORTRAIT) {
                TextView namePort = (TextView)findViewById(R.id.namePort);
                namePort.setText("詹姆斯·高斯林");

            }
            else if(orientation == Configuration.ORIENTATION_LANDSCAPE) {
                TextView nameLand = (TextView)findViewById(R.id.nameLand);
                nameLand.setText("艾达·洛维斯");

            }
        }
    }

    public boolean isChinese(){
        Locale locale = this.getResources().getConfiguration().locale;
        String language = locale.getLanguage();

        if(language.endsWith("zh")){
            return true;
        }
        else return false;
    }
}
