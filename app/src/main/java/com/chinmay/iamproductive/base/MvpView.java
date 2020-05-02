package com.chinmay.iamproductive.base;

/**
 * Created by grandolf49 on 02-05-2020
 * <p>
 * Base interface for any class that wants to act as a View. This interface will be extended an
 * interface for that screen which will be extended by presenter class for that screen
 */
public interface MvpView {

    void showToastMessage(String message);

}
