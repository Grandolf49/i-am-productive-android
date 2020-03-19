package com.chinmay.iamproductive.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.chinmay.iamproductive.R;
import com.chinmay.iamproductive.bottomsheetfragments.MenuBottomSheetFragment;
import com.chinmay.iamproductive.bottomsheetfragments.TasksBottomSheetFragment;
import com.google.android.material.bottomappbar.BottomAppBar;

/**
 * Created by grandolf49 on 26-02-2020
 */
public class MainActivity extends AppCompatActivity {

    private BottomAppBar bottomAppBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomAppBar = findViewById(R.id.bottom_app_bar);
        setSupportActionBar(bottomAppBar);

        bottomAppBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MenuBottomSheetFragment menuBottomSheetFragment = new MenuBottomSheetFragment();
                menuBottomSheetFragment.show(getSupportFragmentManager(), menuBottomSheetFragment.getTag());
            }
        });
    }

    public void onClickViewTasks(View view) {
        TasksBottomSheetFragment tasksBottomSheetFragment = new TasksBottomSheetFragment();
        tasksBottomSheetFragment.show(getSupportFragmentManager(), tasksBottomSheetFragment.getTag());
    }

    public void onClickHandleBottomSheetItemSelected(View view) {

    }

    public void onClickCreateTask(View view) {
        startActivity(new Intent(getApplicationContext(), CreateTaskActivity.class));
    }
}
