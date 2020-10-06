package com.example.mvp_funystory.Presenter;

import com.example.mvp_funystory.CallBackPresenter.CallCategory;
import com.example.mvp_funystory.Model.Categories;

import java.util.List;

public class CategoryPresenter extends BasePresenter<CallCategory> {
    public CategoryPresenter(CallCategory callBack) {
        super(callBack);
    }
    public List<Categories> getAllCategory(){
        return null;
    }
    public boolean deleteCategory(int id){
        return false;
    }
    public boolean upDateCategory(String name,String des){
        return false;
    }
}
