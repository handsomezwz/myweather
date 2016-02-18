package com.zwz.android.myweather.util;

/**
 * Created by 伟洲 on 2016/2/18.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
