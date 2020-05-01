package com.chinmay.iamproductive.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.chinmay.iamproductive.database.entities.RecordEntity;

import java.util.List;

/**
 * Created by grandolf49 on 13-04-2020
 */
@Dao
public interface RecordDao {
    @Insert
    void insert(RecordEntity record);

    @Update
    void update(RecordEntity record);

    @Delete
    void delete(RecordEntity record);

    @Query("select * from record_table where projectId=:projectId")
    List<RecordEntity> getRecordsByProjectId(int projectId);

    @Query("select * from record_table where taskId=:taskId")
    List<RecordEntity> getRecordsByTaskId(int taskId);
}
