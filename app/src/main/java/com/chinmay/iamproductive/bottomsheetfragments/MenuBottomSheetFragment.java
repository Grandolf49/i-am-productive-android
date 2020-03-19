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
 * Created by grandolf49 on 26-02-2020
 */
public class MenuBottomSheetFragment extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container
            , @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_menu_bottom_sheet, container, false);
        view.setBackgroundResource(android.R.color.transparent);
        return view;
    }
}
