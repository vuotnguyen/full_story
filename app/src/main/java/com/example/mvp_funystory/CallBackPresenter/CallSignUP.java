package com.example.mvp_funystory.CallBackPresenter;

import com.example.mvp_funystory.View.CallBack.CallBack;

public interface CallSignUP extends CallBack {
    void register(String name, String path,String phone);

}
