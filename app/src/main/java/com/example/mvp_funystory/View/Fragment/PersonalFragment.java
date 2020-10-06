package com.example.mvp_funystory.View.Fragment;

import android.view.View;
import android.widget.TextView;

import com.example.mvp_funystory.Presenter.PersonalPresenter;
import com.example.mvp_funystory.R;
import com.example.mvp_funystory.CallBackPresenter.CallPersonal;

public class PersonalFragment extends BaseFragment<PersonalPresenter> implements CallPersonal {
    public static final String TAG = PersonalFragment.class.getName() ;
    private TextView tvTitle;

    @Override
    public PersonalPresenter getMpresenter() {
        return new PersonalPresenter(this);
    }

    @Override
    protected void initView() {
        tvTitle = findViewById(R.id.tv_title);
        tvTitle.setText("Cá nhân");

    }

    @Override
    protected int getLayoutID() {
        return R.layout.personal_frament;
    }

    @Override
    public void onClick(View v) {

    }
}
