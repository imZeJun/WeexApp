package com.demo.lizejun.weexapp;

import android.app.Application;

import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

public class WeexApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        InitConfig config = new InitConfig.Builder().setImgAdapter(new CommentSDKWeeXImageAdapter()).build();
        WXSDKEngine.initialize(this, config);
    }

}
