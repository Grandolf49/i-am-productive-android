package com.chinmay.iamproductive.alltasksmodel;

/**
 * Created by grandolf49 on 19-03-2020
 */
public class AllTasksModel {

    private String task_name;
    private String task_color;

    public AllTasksModel(String task_name, String task_color) {
        this.task_name = task_name;
        this.task_color = task_color;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public String getTask_color() {
        return task_color;
    }

    public void setTask_color(String task_color) {
        this.task_color = task_color;
    }
}
