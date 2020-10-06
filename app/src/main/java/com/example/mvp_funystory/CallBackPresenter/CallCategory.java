package com.example.mvp_funystory.CallBackPresenter;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.mvp_funystory.Model.Categories;
import com.example.mvp_funystory.View.CallBack.CallBack;

import java.util.List;

@Dao
public interface CallCategory extends CallBack {
    @Query("SELECT * FROM Categories")
    List<Categories> getALlStory();

    @Insert
    void insertStory(Categories category);

    @Delete
    void deleteStory(Categories category);

    @Delete
    void deleteStoryByID(Categories id);

}
