package com.chinmay.iamproductive.alltasksmodel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chinmay.iamproductive.R;

import java.util.List;

/**
 * Created by grandolf49 on 19-03-2020
 */
public class AllTasksRecyclerAdapter extends RecyclerView.Adapter<AllTasksRecyclerAdapter.AllTasksViewHolder> {

    private List<AllTasksModel> allTasksModelList;

    public AllTasksRecyclerAdapter(List<AllTasksModel> allTasksModelList) {
        this.allTasksModelList = allTasksModelList;
    }

    @NonNull
    @Override
    public AllTasksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AllTasksViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_all_tasks, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AllTasksViewHolder holder, int position) {
        AllTasksModel task = allTasksModelList.get(position);
        holder.tv_task_name.setText(task.getTask_name());
    }

    @Override
    public int getItemCount() {
        return allTasksModelList.size();
    }

    static class AllTasksViewHolder extends RecyclerView.ViewHolder {

        TextView tv_task_name;
        ImageView iv_task_color;

        AllTasksViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_task_name = itemView.findViewById(R.id.tv_task_name);
            iv_task_color = itemView.findViewById(R.id.iv_task_color);
        }
    }

}
