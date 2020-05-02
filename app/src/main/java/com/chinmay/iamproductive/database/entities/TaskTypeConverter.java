package com.chinmay.iamproductive.database.entities;

import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/**
 * Created by grandolf49 on 02-05-2020
 */
public class TaskTypeConverter {

    private static Gson gson = new Gson();

    @TypeConverter
    public static List<TaskEntity> stringToTaskList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }

        Type type = new TypeToken<List<TaskEntity>>() {
        }.getType();

        return gson.fromJson(data, type);
    }

    @TypeConverter
    public static String taskListToString(List<TaskEntity> taskEntityList) {
        return gson.toJson(taskEntityList);
    }
}
