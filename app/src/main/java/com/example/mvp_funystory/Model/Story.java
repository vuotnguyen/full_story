package com.example.mvp_funystory.Model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

import java.sql.Date;

@Entity(primaryKeys = {"id"})
public class Story {
    @NonNull
    @ColumnInfo(name = "id")
    public int id;

    @NonNull
    @ColumnInfo(name = "story_id")
    public int story_id;

    @NonNull
    @ColumnInfo(name = "category_id")
    public int category_id;

    @NonNull
    @ColumnInfo(name = "created_date")
    public String created_date;

    @NonNull
    @ColumnInfo(name = "image_url")
    public String image_url;

    @NonNull
    @ColumnInfo(name = "modified_date")
    public String modified_date;

    @NonNull
    @ColumnInfo(name = "status")
    public int status;

    @NonNull
    @ColumnInfo(name = "content_introduce")
    public String content_introduce;
}
