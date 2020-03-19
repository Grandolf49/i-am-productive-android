package com.chinmay.iamproductive.bottomsheetfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chinmay.iamproductive.R;
import com.chinmay.iamproductive.alltasksmodel.AllTasksModel;
import com.chinmay.iamproductive.alltasksmodel.AllTasksRecyclerAdapter;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;

/**
 * Created by grandolf49 on 17-03-2020
 */
public class TasksBottomSheetFragment extends BottomSheetDialogFragment {

    private RecyclerView rv_all_tasks;
    private AllTasksRecyclerAdapter allTasksRecyclerAdapter;
    private ArrayList<AllTasksModel> allTasksModels = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.layout_tasks_bottom_sheet, container, false);

        rv_all_tasks = mView.findViewById(R.id.rv_all_tasks);
        rv_all_tasks.setLayoutManager(new LinearLayoutManager(getContext()));

        // Create a temporary list of tasks
        allTasksModels.add(new AllTasksModel("Coding Practice", "RED"));
        allTasksModels.add(new AllTasksModel("Personal", "RED"));
        allTasksModels.add(new AllTasksModel("GSoC", "RED"));
        allTasksModels.add(new AllTasksModel("College Work", "RED"));
        allTasksModels.add(new AllTasksModel("Major Project", "RED"));

        allTasksRecyclerAdapter = new AllTasksRecyclerAdapter(allTasksModels);

        rv_all_tasks.setAdapter(allTasksRecyclerAdapter);
        return mView;
    }
}