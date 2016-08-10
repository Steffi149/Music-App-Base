package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Stefanie on 10.08.2016.
 */
public class TrendingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trending);
    }

    public void openSearchList(View view) {
        Intent i = new Intent(this, SearchActivity.class);
        startActivity(i);
    }
}