package com.chinmay.iamproductive.ui.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.chinmay.iamproductive.R;

/**
 * Created by grandolf49 on 19-03-2020
 */
public class TaskDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);
        //getWindow().setFlags(FLAG_LAYOUT_NO_LIMITS, FLAG_LAYOUT_NO_LIMITS);
    }
}
