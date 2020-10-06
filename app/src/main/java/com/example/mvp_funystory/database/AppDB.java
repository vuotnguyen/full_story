package com.example.mvp_funystory.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.mvp_funystory.CallBackPresenter.CallHome;
import com.example.mvp_funystory.Convert.DateConverter;
import com.example.mvp_funystory.Model.Categories;
import com.example.mvp_funystory.Model.category_stories;
import com.example.mvp_funystory.Model.StoriesHistory;
import com.example.mvp_funystory.Model.Story;
import com.example.mvp_funystory.Model.StoryComment;
import com.example.mvp_funystory.Model.StoryContent;
import com.example.mvp_funystory.Model.User;

@Database(entities = {Categories.class, category_stories.class, StoriesHistory.class, Story.class, StoryComment.class, StoryContent.class, User.class},version = 1,exportSchema = false)
@TypeConverters({DateConverter.class})
public abstract class AppDB extends RoomDatabase {
    public abstract CallHome getStoryDAO();
}
