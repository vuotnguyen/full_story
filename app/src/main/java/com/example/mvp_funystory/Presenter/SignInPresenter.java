package com.example.mvp_funystory.Presenter;

import com.example.mvp_funystory.CallBackPresenter.CallSignIn;

public class SignInPresenter extends BasePresenter<CallSignIn> {
    private String rs;
    private boolean kq;
    public SignInPresenter(CallSignIn callBack) {
        super(callBack);
    }

    public void signIn(String name,String pass){
        if(name.equals("admin") && pass.equals("admin")){
            rs = "Login success";
            kq = true;
            viewFragment.showRS(rs,kq);
        }else{
            rs = "sai pass or name";
            kq = false;
            viewFragment.showRS(rs,kq);
        }
    }
}
