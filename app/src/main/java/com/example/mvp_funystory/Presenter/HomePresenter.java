package com.example.mvp_funystory.Presenter;

import android.util.Log;

import com.example.mvp_funystory.CallBackPresenter.CallHome;
import com.example.mvp_funystory.Model.category_stories;

import com.example.mvp_funystory.View.activity.App;

import java.util.List;

public class HomePresenter extends BasePresenter<CallHome> {
    public HomePresenter(CallHome callBack) {
        super(callBack);
    }


    public List<category_stories> getAllStory(){
//        MTask task = new MTask(null, new MTask.OnMTaskCallBack() {
//            @Override
//            public Object execTask(String key, Object data, MTask task) {
//                return App.getInstance().getAppDB().getStoryDAO().getALlStory();
//            }
//        });
//        return (List<CategoryStories>) task;
        Log.i("TAG", "getAllStory: cái đéo j đây");
        return App.getInstance().getAppDB().getStoryDAO().getALlStory();
    }
    public List<category_stories> getStoryByAnything(String anything){
        return null;
    }
    public boolean deleteStory(int id){
        return true;
    }

}
