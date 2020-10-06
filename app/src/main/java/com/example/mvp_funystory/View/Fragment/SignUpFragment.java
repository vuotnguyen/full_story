package com.example.mvp_funystory.View.Fragment;

import android.view.View;

import com.example.mvp_funystory.CallBackPresenter.CallSignUP;
import com.example.mvp_funystory.Presenter.SignUpPresenter;
import com.example.mvp_funystory.R;

public class SignUpFragment extends BaseFragment<SignUpPresenter> implements CallSignUP {

    public static final String TAG = SignUpFragment.class.getName() ;


    @Override
    public SignUpPresenter getMpresenter() {
        return new SignUpPresenter(this);
    }

    @Override
    protected void initView() {
    }

    @Override
    protected int getLayoutID() {
        return R.layout.sign_up_fragment;
    }

    @Override
    public void register(String name, String path, String phone) {

    }

    @Override
    public void onClick(View v) {

    }
}
