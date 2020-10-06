package com.example.mvp_funystory.Model;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(primaryKeys = {"id"})
public class StoryContent {

    @NonNull
    @ColumnInfo(name = "id")
    public int id;

    @NonNull
    @ColumnInfo(name = "story_id")
    public int story_id;

    @NonNull
    @ColumnInfo(name = "chapter")
    public String chapter;

    @NonNull
    @ColumnInfo(name = "chapter_name")
    public String chapter_name;

    @NonNull
    @ColumnInfo(name = "story_content")
    public String story_content;

}
