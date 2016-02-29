package com.example.gpy.whiteboard;

import android.app.Application;

import com.example.gpy.whiteboard.base.Config;
import com.example.gpy.whiteboard.utils.AppContextUtil;
import com.example.gpy.whiteboard.utils.SdCardStatus;

/**
 * Created by gpy on 2016/2/17.
 */
public class SelfApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        AppContextUtil.init(this);
        SdCardStatus.init(Config.CACHE_DIR);
    }
}