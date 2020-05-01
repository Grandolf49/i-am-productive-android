package com.chinmay.iamproductive.database.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import static com.chinmay.iamproductive.database.DataBaseConstants.RECORD_TABLE_NAME;

/**
 * Created by grandolf49 on 13-04-2020
 */
@Entity(tableName = RECORD_TABLE_NAME)
public class RecordEntity {
    @PrimaryKey(autoGenerate = true)
    public int recordId;
    public int taskId;
    public int projectId;
    public long startTime;
    public long endTime;
    public String date;

    public RecordEntity(long startTime, long endTime, String date) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
    }
}
