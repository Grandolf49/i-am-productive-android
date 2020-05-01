package com.chinmay.iamproductive.ui.alltasksmodel;

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

    private List<TaskModel> taskModelList;
    private OnTaskClickListener mOnTaskClickListener;

    public AllTasksRecyclerAdapter(List<TaskModel> taskModelList, OnTaskClickListener onTaskClickListener) {
        this.taskModelList = taskModelList;
        this.mOnTaskClickListener = onTaskClickListener;
    }

    @NonNull
    @Override
    public AllTasksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_all_tasks, parent, false);
        return new AllTasksViewHolder(view, mOnTaskClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AllTasksViewHolder holder, int position) {
        TaskModel task = taskModelList.get(position);
        holder.tv_task_name.setText(task.getTaskName());
    }

    @Override
    public int getItemCount() {
        return taskModelList.size();
    }

    public interface OnTaskClickListener {
        void onTaskClicked(int position);
    }

    static class AllTasksViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView tv_task_name;
        ImageView iv_task_color;
        OnTaskClickListener onTaskClickListener;

        AllTasksViewHolder(@NonNull View itemView, OnTaskClickListener onTaskClickListener) {
            super(itemView);
            tv_task_name = itemView.findViewById(R.id.tv_task_name);
            iv_task_color = itemView.findViewById(R.id.iv_task_color);
            this.onTaskClickListener = onTaskClickListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onTaskClickListener.onTaskClicked(getAdapterPosition());
        }
    }

}
