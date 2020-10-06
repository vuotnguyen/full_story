package com.example.mvp_funystory.CallBackPresenter;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mvp_funystory.Model.category_stories;
import com.example.mvp_funystory.View.CallBack.CallBack;

import java.util.List;
@Dao
public interface CallHome extends CallBack {

//    void showStorySearch(String thing);

    @Query("SELECT * FROM category_stories")
    List<category_stories> getALlStory();

    @Insert
    void insertStory(category_stories categorystories);

    @Delete
    void deleteStory(category_stories categorystories);

    @Delete
    void deleteStoryByID(category_stories id);
}
