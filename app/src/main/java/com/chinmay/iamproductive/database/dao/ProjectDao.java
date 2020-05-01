package com.chinmay.iamproductive.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.chinmay.iamproductive.database.entities.ProjectEntity;

import java.util.List;

/**
 * Created by grandolf49 on 13-04-2020
 */
@Dao
public interface ProjectDao {
    @Insert
    void insert(ProjectEntity project);

    @Update
    void update(ProjectEntity project);

    @Delete
    void delete(ProjectEntity project);

    @Query("select * from project_table")
    List<ProjectEntity> getAllProjects();
}
