package com.example.android.combo;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;
import android.widget.CheckBox;
import android.widget.Toast;
import android.content.Intent;
import android.widget.ImageView;


public class NewsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }

    public void abp(View view) {
        Uri webpage = Uri.parse("http://abpnews.abplive.in/live-tv");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void aajtak(View view) {
        Uri webpage = Uri.parse("https://m.aajtak.in/livetv/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void doordarshan(View view) {
        Uri webpage = Uri.parse("http://webcast.gov.in/live/");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }


    public void indiatv(View view) {
        Uri webpage = Uri.parse("http://m.indiatvnews.com/livetv");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void ndtv(View view) {
        Uri webpage = Uri.parse("http://m.ndtv.com/video/live/channel/ndtv24x7");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void newsnation(View view) {
        Uri webpage = Uri.parse("http://www.newsnation.in/livevideo");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    public void zeenews(View view) {
        Uri webpage = Uri.parse("http://zeenews.india.com/live-tv");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }


}