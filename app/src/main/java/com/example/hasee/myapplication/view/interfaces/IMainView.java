package com.example.hasee.myapplication.view.interfaces;

/**
 * Created by caojun on 2018/5/11.
 */

public interface IMainView<V> extends IBaseView{
    void onSuccess(V t);
    void onErr(int code, String errMsg);
}
