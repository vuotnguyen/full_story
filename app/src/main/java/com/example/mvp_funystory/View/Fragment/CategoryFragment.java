package com.example.mvp_funystory.View.Fragment;

import android.view.View;
import android.widget.TextView;

import com.example.mvp_funystory.Model.Categories;
import com.example.mvp_funystory.Presenter.CategoryPresenter;
import com.example.mvp_funystory.R;
import com.example.mvp_funystory.CallBackPresenter.CallCategory;

import java.util.List;

public class CategoryFragment extends BaseFragment<CategoryPresenter> implements CallCategory {
    public static final String TAG = CategoryFragment.class.getName();
    private TextView tvTitle;

    @Override
    public CategoryPresenter getMpresenter() {
        return new CategoryPresenter(this);
    }

    @Override
    protected void initView() {
        tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText("Thể Loại");
    }

    @Override
    protected int getLayoutID() {
        return R.layout.theloai_fragment;
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public List<Categories> getALlStory() {
        return null;
    }

    @Override
    public void insertStory(Categories category) {

    }

    @Override
    public void deleteStory(Categories category) {

    }

    @Override
    public void deleteStoryByID(Categories id) {

    }
}
