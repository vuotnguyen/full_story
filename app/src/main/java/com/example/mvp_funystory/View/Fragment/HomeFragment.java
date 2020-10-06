package com.example.mvp_funystory.View.Fragment;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mvp_funystory.CallBackPresenter.CallHome;
import com.example.mvp_funystory.Model.category_stories;
import com.example.mvp_funystory.Presenter.HomePresenter;
import com.example.mvp_funystory.R;
import com.example.mvp_funystory.View.adapter.CategoryStoriesAdapter;

import java.util.List;

public class HomeFragment extends BaseFragment<HomePresenter> implements CallHome {
    private RecyclerView rv_listStory;
    //private List<CategoryStories> storiesList;

    public static final String TAG = HomeFragment.class.getName();
    public static final String KEY_SHOW_HOME = "KEY_SHOW_HOME";


    @Override
    public HomePresenter getMpresenter() {
        return new HomePresenter(this);
    }

    @Override
    protected void initView() {
        rv_listStory = findViewById(R.id.rv_allStory);
        CategoryStoriesAdapter adapter = new CategoryStoriesAdapter(getContext(),getALlStory());
        rv_listStory.setAdapter(adapter);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.fragment_home;
    }

    @Override
    public void onClick(View v) {

    }


    @Override
    public List<category_stories> getALlStory() {
        List<category_stories> storiesList;
        storiesList = getMpresenter().getAllStory();
        return storiesList;
    }

    @Override
    public void insertStory(category_stories categorystories) {

    }

    @Override
    public void deleteStory(category_stories categorystories) {

    }

    @Override
    public void deleteStoryByID(category_stories id) {

    }

}
