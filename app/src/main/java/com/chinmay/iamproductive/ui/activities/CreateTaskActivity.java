package com.chinmay.iamproductive.ui.activities;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.chinmay.iamproductive.R;

/**
 * Created by grandolf49 on 17-03-2020
 */
public class CreateTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);
    }

    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.iv_back:
                finish();
                break;
            case R.id.tv_create_task:
                //Create Task Code
                break;
        }
    }
}
