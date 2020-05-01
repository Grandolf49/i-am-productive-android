package com.chinmay.iamproductive.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

import static com.chinmay.iamproductive.database.DataBaseConstants.PROJECT_TABLE_NAME;

/**
 * Created by grandolf49 on 13-04-2020
 */
@Entity(tableName = PROJECT_TABLE_NAME)
public class ProjectEntity {
    @PrimaryKey(autoGenerate = true)
    public int projectId;
    public String projectName;
    public int color;
    public List<TaskEntity> tasks;

    public ProjectEntity(String projectName, int color) {
        this.projectName = projectName;
        this.color = color;
    }
}
