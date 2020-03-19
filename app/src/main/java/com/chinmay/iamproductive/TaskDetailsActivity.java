package com.chinmay.iamproductive;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by grandolf49 on 19-03-2020
 */
public class TaskDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);

        String name = getIntent().getStringExtra("name");
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
}
