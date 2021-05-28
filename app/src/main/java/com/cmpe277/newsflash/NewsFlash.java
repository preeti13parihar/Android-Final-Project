package com.cmpe277.newsflash;

import android.app.Application;

/*
** Used for getting the application instance
**/
public class NewsFlash extends Application {
    private static NewsFlash newsFlashInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        newsFlashInstance = this;
    }
    public static NewsFlash getNewsFlashInstance(){
        return newsFlashInstance;
    }
}
