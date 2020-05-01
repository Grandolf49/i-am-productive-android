package com.chinmay.iamproductive.ui.alltasksmodel;

/**
 * Created by grandolf49 on 19-03-2020
 */
public class TaskModel {

    private String taskName;
    private String taskColor;

    public TaskModel(String taskName, String taskColor) {
        this.taskName = taskName;
        this.taskColor = taskColor;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskColor() {
        return taskColor;
    }

    public void setTaskColor(String taskColor) {
        this.taskColor = taskColor;
    }
}
