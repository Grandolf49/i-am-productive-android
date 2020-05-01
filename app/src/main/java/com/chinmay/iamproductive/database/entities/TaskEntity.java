package com.chinmay.iamproductive.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

import static com.chinmay.iamproductive.database.DataBaseConstants.TASK_TABLE_NAME;

/**
 * Created by grandolf49 on 13-04-2020
 */
@Entity(tableName = TASK_TABLE_NAME)
public class TaskEntity {
    @PrimaryKey(autoGenerate = true)
    public int taskId;
    public int projectId;
    public String taskName;
    public List<RecordEntity> records;
    /**
     * totalTime - It will keep a track of the total number of milliseconds spent in a particular
     * task
     */
    public int totalTime;

    public TaskEntity(int projectId, String taskName) {
        this.projectId = projectId;
        this.taskName = taskName;
    }
}
