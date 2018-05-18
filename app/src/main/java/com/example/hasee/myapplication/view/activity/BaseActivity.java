package com.example.hasee.myapplication.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;



import com.example.hasee.myapplication.R;
import com.example.hasee.myapplication.presenter.BasePresenter;
import com.example.hasee.myapplication.view.customview.MyTitle;
import com.example.hasee.myapplication.view.interfaces.IBaseView;

/**
 * Created by caojun on 2018/5/11.
 */

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IBaseView,View.OnClickListener{

    private P presenter;
    private FrameLayout content;
    private MyTitle myTitle;
    public TextView title;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        initSelfView();
        presenter = setPresenter();
        presenter.attachView(this);
        initData();
        initView();
    }

    private void initSelfView() {
        content = findViewById(R.id.content);
        content.addView(getChildView());
        myTitle = findViewById(R.id.mytitle);
        title = findViewById(R.id.titleBar_id);
        View viewById = myTitle.findViewById(R.id.titleBar_back);
        viewById.setOnClickListener(this);
    }

    abstract void initData();
    abstract void initView();
    abstract P setPresenter();
    abstract View getChildView();
    public P getPresenter(){
        return presenter;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.titleBar_back:
                finish();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
