package com.chinmay.iamproductive.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.chinmay.iamproductive.database.dao.ProjectDao;
import com.chinmay.iamproductive.database.dao.RecordDao;
import com.chinmay.iamproductive.database.dao.TaskDao;
import com.chinmay.iamproductive.database.entities.ProjectEntity;
import com.chinmay.iamproductive.database.entities.RecordEntity;
import com.chinmay.iamproductive.database.entities.TaskEntity;

import static com.chinmay.iamproductive.database.DataBaseConstants.PROJECT_DATABASE;

/**
 * Created by grandolf49 on 01-05-2020
 */
@Database(entities = {ProjectEntity.class, TaskEntity.class, RecordEntity.class}, version = 1)
public abstract class MainDatabase extends RoomDatabase {

    private static MainDatabase instance;

    public static synchronized MainDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    MainDatabase.class, PROJECT_DATABASE)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }

    public abstract ProjectDao projectDao();

    public abstract TaskDao taskDao();

    public abstract RecordDao recordDao();
}
