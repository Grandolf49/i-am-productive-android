package com.chinmay.iamproductive.bottomsheetfragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chinmay.iamproductive.R;
import com.chinmay.iamproductive.TaskDetailsActivity;
import com.chinmay.iamproductive.alltasksmodel.AllTasksRecyclerAdapter;
import com.chinmay.iamproductive.alltasksmodel.TaskModel;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;

/**
 * Created by grandolf49 on 17-03-2020
 */
public class TasksBottomSheetFragment extends BottomSheetDialogFragment {

    private RecyclerView rv_all_tasks;
    private AllTasksRecyclerAdapter allTasksRecyclerAdapter;
    private ArrayList<TaskModel> taskModels = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.layout_tasks_bottom_sheet, container, false);

        rv_all_tasks = mView.findViewById(R.id.rv_all_tasks);
        rv_all_tasks.setLayoutManager(new LinearLayoutManager(getContext()));

        // Create a temporary list of tasks
        taskModels.add(new TaskModel("Coding Practice", "RED"));
        taskModels.add(new TaskModel("Personal", "RED"));
        taskModels.add(new TaskModel("GSoC", "RED"));
        taskModels.add(new TaskModel("College Work", "RED"));
        taskModels.add(new TaskModel("Major Project", "RED"));

        allTasksRecyclerAdapter = new AllTasksRecyclerAdapter(taskModels, new AllTasksRecyclerAdapter.OnTaskClickListener() {
            @Override
            public void onTaskClicked(int position) {
                TaskModel taskModel = taskModels.get(position);
                Intent intent = new Intent(getActivity(), TaskDetailsActivity.class);
                intent.putExtra("name", taskModel.getTaskName());
                startActivity(intent);
            }
        });

        rv_all_tasks.setAdapter(allTasksRecyclerAdapter);

        return mView;
    }
}