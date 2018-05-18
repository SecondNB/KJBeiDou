package com.example.hasee.myapplication.presenter;


import com.example.hasee.myapplication.view.interfaces.IBaseView;

/**
 * Created by caojun on 2018/5/11.
 */

public class BasePresenter<V extends IBaseView> {
    private V v;

    public void attachView(V iBaseView) {
        this.v = iBaseView;
    }

    public void detachView() {
        v = null;
    }

    public V getView(){
        return  v;
    }
}
