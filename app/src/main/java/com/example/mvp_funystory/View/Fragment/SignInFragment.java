package com.example.mvp_funystory.View.Fragment;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mvp_funystory.CallBackPresenter.CallSignIn;
import com.example.mvp_funystory.Presenter.SignInPresenter;
import com.example.mvp_funystory.R;

public class SignInFragment extends BaseFragment<SignInPresenter> implements CallSignIn {
    public static final String KEY_SHOW_HOME = "KEY_SHOW_HOME" ;
    private EditText edt_name,edt_pass;
    public static final String TAG = SignInFragment.class.getName();
    public static final String KEY_SHOW_SIGNUP = "SIGN_UP";

    @Override
    public SignInPresenter getMpresenter() {
        return new SignInPresenter(this);
    }

    @Override
    protected void initView() {
        edt_name = findViewById(R.id.edtUser);
        edt_pass = findViewById(R.id.edtPass);
        findViewById(R.id.btSignIn,this);
        findViewById(R.id.tvSignUp,this);

    }

    @Override
    protected int getLayoutID() {
        return R.layout.sign_in_fragment;
    }

    @Override
    public void showRS(String rs,boolean kq) {
        Toast.makeText(context,rs,Toast.LENGTH_SHORT).show();
        if(kq == true){
            even.callBack(KEY_SHOW_HOME,null);
        }
        else {

        }
    }
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btSignIn){
            mpresenter.signIn(edt_name.getText().toString(),edt_pass.getText().toString());
            even.callBack(MenuDrawerFragment.KEY_SHOW_HOME,null);
        }
        else if(v.getId() == R.id.tvSignUp){
            even.callBack(KEY_SHOW_SIGNUP,null);
        }
    }
}
