package com.example.mvp_funystory.View.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.mvp_funystory.R;
import com.example.mvp_funystory.View.CallBack.CallBack;
import com.example.mvp_funystory.View.Fragment.BaseFragment;
import com.example.mvp_funystory.View.Fragment.CommunityFragment;
import com.example.mvp_funystory.View.Fragment.HomeFragment;
import com.example.mvp_funystory.View.Fragment.LibraryFragment;
import com.example.mvp_funystory.View.Fragment.MenuDrawerFragment;
import com.example.mvp_funystory.View.Fragment.PersonalFragment;
import com.example.mvp_funystory.View.Fragment.SignInFragment;
import com.example.mvp_funystory.View.Fragment.SignUpFragment;
import com.example.mvp_funystory.View.Fragment.SplashFragment;
import com.example.mvp_funystory.View.Fragment.CategoryFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements CallBack {
    private String currenTag;
    private BottomNavigationView botomMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        botomMenu = findViewById(R.id.menu_bot);
        botomMenu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.navigation_home:
                        showFragment(HomeFragment.TAG);
                        return true;
                    case R.id.navigation_theLoai:
                        showFragment(CategoryFragment.TAG);
                        return true;
                    case R.id.navigation_library:
                        showFragment(LibraryFragment.TAG);
                        return true;
                    case R.id.navigation_congDong:
                        showFragment(CommunityFragment.TAG);
                        return true;
                    case R.id.navigation_caNhan:
                        showFragment(PersonalFragment.TAG);
                        return true;
                }
                return false;
            }
        });

        showFragment(SplashFragment.TAG);
    }


    public void showFragment(String tag) {
        try {
            Class<?> clazz = Class.forName(tag);
            BaseFragment baseFragment = (BaseFragment) clazz.newInstance();
            baseFragment.setCallBack(this);
            currenTag = tag;
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.ln_main,baseFragment,tag).commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void callBack(String key, Object data) {
        switch (key){
            case SplashFragment.KEY_SHOW_SIGNIN:
                showFragment(SignInFragment.TAG);
                //botomMenu.setVisibility(View.GONE);

                break;
            case SignInFragment.KEY_SHOW_SIGNUP:
                showFragment(SignUpFragment.TAG);
                botomMenu.setVisibility(View.GONE);
                break;
            case MenuDrawerFragment.KEY_SHOW_HOME:
                showFragment(HomeFragment.TAG);
                Toast.makeText(MainActivity.this,"Home",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}