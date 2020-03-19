package com.chinmay.iamproductive.bottomsheetfragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.chinmay.iamproductive.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/**
 * Created by grandolf49 on 17-03-2020
 */
public class TasksBottomSheetFragment extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_tasks_bottom_sheet, container, false);
    }
}