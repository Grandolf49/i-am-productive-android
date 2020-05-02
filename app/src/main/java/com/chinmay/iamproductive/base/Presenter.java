package com.chinmay.iamproductive.base;

/**
 * Created by grandolf49 on 02-05-2020
 */
public interface Presenter<T extends MvpView> {

    void attachView(T mvpView);

    void detachView();

}
