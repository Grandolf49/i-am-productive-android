package com.chinmay.iamproductive.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.chinmay.iamproductive.database.entities.TaskEntity;

import java.util.List;

/**
 * Created by grandolf49 on 13-04-2020
 */
@Dao
public interface TaskDao {
    @Insert
    void insert(TaskEntity task);

    @Update
    void update(TaskEntity task);

    @Delete
    void delete(TaskEntity task);

    @Query("select * from task_table where projectId=:projectId")
    List<TaskEntity> getTasksByProjectId(int projectId);
}
